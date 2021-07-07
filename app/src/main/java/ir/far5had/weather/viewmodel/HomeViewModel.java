package ir.far5had.weather.viewmodel;

import android.app.Application;
import android.text.TextUtils;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.arch.core.util.Function;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.Transformations;

import java.util.List;

import ir.far5had.weather.AppController;
import ir.far5had.weather.DataRepository;
import ir.far5had.weather.model.City;
import ir.far5had.weather.model.Forecast;

public class HomeViewModel extends AndroidViewModel {

    private static final String TAG = "HomeViewModel";

    private final SavedStateHandle mSavedStateHandler;
    private final DataRepository mRepository;
    private LiveData<Forecast> mForecast;

    public HomeViewModel(@NonNull Application application,
                         @NonNull SavedStateHandle savedStateHandle) {
        super(application);
        mSavedStateHandler = savedStateHandle;

        mRepository = ((AppController) application).getRepository();
//
//         Use the savedStateHandle.getLiveData() as the input to switchMap,
//         allowing us to recalculate what LiveData to get from the DataRepository
//         based on what query the user has entered
        mSavedStateHandler.set(TAG, mRepository.getLastCity());
        getForecast();
    }

    public LiveData<Forecast> getForecast() {
        mForecast =  mRepository.getForecast(String.valueOf(mSavedStateHandler.getLiveData(TAG, "").getValue()));
        return mForecast;
    }
}
