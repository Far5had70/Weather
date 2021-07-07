package ir.far5had.weather.api;


import retrofit2.Response;

public interface IRetrofitObject<R> extends IRetrofitFailure {

    void onSuccess(Response<R> response);

}