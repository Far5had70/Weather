package ir.far5had.weather.api.ApiInterface;


import java.util.List;

import ir.far5had.weather.model.City;
import ir.far5had.weather.model.Forecast;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface IApiHelper {

    String API_Base = "v1/";

    @GET(API_Base + "forecast.json")
    Call<Forecast> Forecast(
            @Query("key") String key ,
            @Query("q") String q ,
            @Query("aqi") String aqi ,
            @Query("days") int days);

    @GET(API_Base + "search.json")
    Call<List<City>> Search(
            @Query("key") String key ,
            @Query("q") String q ,
            @Query("aqi") String aqi);
}