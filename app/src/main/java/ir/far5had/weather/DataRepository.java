package ir.far5had.weather;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Observer;

import java.util.List;

import ir.far5had.weather.api.ApiClient;
import ir.far5had.weather.api.IRetrofitObject;
import ir.far5had.weather.api.RetrofitCallBack;
import ir.far5had.weather.db.AppDatabase;
import ir.far5had.weather.model.City;
import ir.far5had.weather.model.Forecast;
import retrofit2.Response;

public class DataRepository {

    private static DataRepository sInstance;
    private final AppDatabase mDatabase;

    private final MediatorLiveData<Forecast> mObservableForecast;
    private final MediatorLiveData<List<City>> mObservableSearch;

    private DataRepository(final AppDatabase database) {
        mDatabase = database;
        mObservableForecast = new MediatorLiveData<>();
        mObservableSearch = new MediatorLiveData<>();

        mObservableSearch.addSource(mDatabase.searchDao().loadAllCities(), searchList -> {
                    if (mDatabase.getDatabaseCreated().getValue() != null) {
                        mObservableSearch.postValue(searchList);
                    }
                });
    }

    public static DataRepository getInstance(final AppDatabase database) {
        if (sInstance == null) {
            synchronized (DataRepository.class) {
                if (sInstance == null) {
                    sInstance = new DataRepository(database);
                }
            }
        }
        return sInstance;
    }

    public LiveData<Forecast> getForecast(String city) {
        RetrofitCallBack.callRetrofit(ApiClient.createApi(ApiClient.API_HOST)
                .Forecast(ApiClient.API_Token, city, "no", 3), new IRetrofitObject<Forecast>() {
            @Override
            public void onSuccess(Response<Forecast> response) {
                mObservableForecast.postValue(response.body());
            }

            @Override
            public void onFailure(String error) {

            }
        });
        return mObservableForecast;
    }

    public LiveData<List<City>> getSearches() {
        return mObservableSearch;
    }

    public String getLastCity() {
        City city = mDatabase.searchDao().lastCity();
        return city != null ? city.getName() : "London";
    }

    public LiveData<List<City>> searchCity(String search) {
        RetrofitCallBack.callRetrofit(ApiClient.createApi(ApiClient.API_HOST).Search(ApiClient.API_Token, search, "no"), new IRetrofitObject<List<City>>() {
            @Override
            public void onSuccess(Response<List<City>> response) {
                mObservableSearch.postValue(response.body());
            }

            @Override
            public void onFailure(String error) {

            }
        });
        return mObservableSearch;
    }

    public void addToSearchHistory(City city) {
        mDatabase.searchDao().insert(city);
    }
}
