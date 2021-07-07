package ir.far5had.weather.ui.search;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.jakewharton.rxbinding4.widget.RxTextView;

import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.concurrent.TimeUnit;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.schedulers.Schedulers;
import ir.far5had.weather.R;
import ir.far5had.weather.databinding.SearchBsfBinding;
import ir.far5had.weather.model.City;
import ir.far5had.weather.util.KeyboardUtils;
import ir.far5had.weather.viewmodel.SearchViewModel;

public class SearchBSF extends BottomSheetDialogFragment implements CityClickCallback {

    private SearchBsfBinding mBinding;
    private SearchViewModel viewModel;
    private CityAdapter adapter;

    public SearchBSF() {
    }

    @Override
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mBinding = DataBindingUtil.inflate(inflater, R.layout.search_bsf, container, false);
        return mBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        viewModel = new ViewModelProvider(this).get(SearchViewModel.class);

        adapter = new CityAdapter(this);
        mBinding.recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mBinding.recyclerView.setAdapter(adapter);

        RxTextView.textChanges(mBinding.searchEdt)
                .debounce(1, TimeUnit.SECONDS)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(textChanged -> {
                    if (!textChanged.toString().isEmpty()){
                        viewModel.setQuery(mBinding.searchEdt.getText());
                    }
                });

        subscribeUi(viewModel.getSearches());
    }

    private void subscribeUi(LiveData<List<City>> searches) {
        searches.observe(getViewLifecycleOwner(), response -> {
            adapter.setCityList(searches.getValue());
            mBinding.executePendingBindings();
        });
    }

    @Override
    public void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        dialog.getWindow().clearFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);
    }

    @Override
    public void onClick(City city) {
        viewModel.getForecast(city);
        viewModel.addToSearchHistory(city);
        KeyboardUtils.hideKeyboard(getActivity());
        dismiss();
    }
}
