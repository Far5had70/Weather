package ir.far5had.weather.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import ir.far5had.weather.R;
import ir.far5had.weather.databinding.HomeFragmentBinding;
import ir.far5had.weather.model.Forecast;
import ir.far5had.weather.ui.search.SearchBSF;
import ir.far5had.weather.util.TextUtils;
import ir.far5had.weather.viewmodel.HomeViewModel;

public class HomeFragment extends Fragment implements View.OnClickListener {

    public static final String TAG = "HomeFragment";
    private HomeFragmentBinding mBinding;
    private ForecastAdapter forecastAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mBinding = DataBindingUtil.inflate(inflater, R.layout.home_fragment, container, false);

        forecastAdapter = new ForecastAdapter(forecastClickCallback);
        mBinding.recyclerView.setAdapter(forecastAdapter);
        mBinding.recyclerView.setLayoutManager(new GridLayoutManager(getContext() , 1 , GridLayoutManager.HORIZONTAL , false));

        return mBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        final HomeViewModel viewModel = new ViewModelProvider(this).get(HomeViewModel.class);

        mBinding.search.setOnClickListener(this);

        subscribeUi(viewModel.getForecast());
    }

    private void subscribeUi(LiveData<Forecast> liveData) {
        liveData.observe(getViewLifecycleOwner(), forecast -> {
            if (forecast != null) {
                mBinding.setIsLoading(false);
                mBinding.setCity(liveData.getValue().getLocation().getName());
                mBinding.setStatus(TextUtils.splitByInter(liveData.getValue().getCurrent().getCondition().getText()));
                mBinding.setDegree(""+liveData.getValue().getCurrent().getTemp_c() + getString(R.string.degree));
                forecastAdapter.setForecastList(forecast.getForecast().getForecastday());
                Glide.with(this)
                        .load(liveData.getValue().getCurrent().getCondition().getIcon())
                        .into(mBinding.imageView);
            } else {
                mBinding.setIsLoading(true);
            }
            mBinding.executePendingBindings();
        });
    }

    @Override
    public void onDestroyView() {
        mBinding = null;
        forecastAdapter = null;
        super.onDestroyView();
    }

    private final ForecastClickCallback forecastClickCallback = forecast -> {
        if (getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            //todo show detail of forecast card
            //((MainActivity) requireActivity()).show(forecast);
        }
    };

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.search:
                SearchBSF searchBSF = new SearchBSF();
                searchBSF.show(getChildFragmentManager() , searchBSF.getTag());
                break;
        }
    }
}
