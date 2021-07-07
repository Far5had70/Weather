package ir.far5had.weather.viewmodel;

import android.app.Application;
import android.text.TextUtils;

import androidx.annotation.NonNull;
import androidx.arch.core.util.Function;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.Transformations;

import java.util.List;

import ir.far5had.weather.AppController;
import ir.far5had.weather.DataRepository;
import ir.far5had.weather.model.Forecast;
import ir.far5had.weather.model.City;

public class SearchViewModel extends AndroidViewModel {

    private static final String TAG = "SearchViewModel";

    private final SavedStateHandle mSavedStateHandler;
    private final DataRepository mRepository;
    private final LiveData<List<City>> mSearches;
    private LiveData<Forecast> mForecast;

    public SearchViewModel(@NonNull Application application,
                           @NonNull SavedStateHandle savedStateHandle) {
        super(application);
        mSavedStateHandler = savedStateHandle;

        mRepository = ((AppController) application).getRepository();
//
//         Use the savedStateHandle.getLiveData() as the input to switchMap,
//         allowing us to recalculate what LiveData to get from the DataRepository
//         based on what query the user has entered
        mSearches = Transformations.switchMap(
                savedStateHandle.getLiveData(TAG, null),
                (Function<CharSequence, LiveData<List<City>>>) input -> {
                    if (TextUtils.isEmpty(input)) {
                        return mRepository.getSearches();
                    }
                    return mRepository.searchCity(input.toString());
                }
        );


    }

    public void setQuery(CharSequence query) {
        // Save the user's query into the SavedStateHandle.
        // This ensures that we retain the value across process death
        // and is used as the input into the Transformations.switchMap above
        mSavedStateHandler.set(TAG, query);
    }

    public LiveData<List<City>> getSearches() {
        return mSearches;
    }

    public LiveData<Forecast> getForecast(City city) {
        mForecast =  mRepository.getForecast(city.getName());
        return mForecast;
    }

    public void addToSearchHistory(City city) {
        mRepository.addToSearchHistory(city);
    }
}
