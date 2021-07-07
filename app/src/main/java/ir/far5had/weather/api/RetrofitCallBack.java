package ir.far5had.weather.api;

import android.util.Log;

import ir.far5had.weather.util.NetworkUtils;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class RetrofitCallBack {

    public static <R> void callRetrofit(Call<R> call, final IRetrofitObject<R> IRetrofitObject) {

        if (NetworkUtils.isNetworkAvailable()) {
            call.enqueue(new Callback<R>() {
                @Override
                public void onResponse(Call<R> call, Response<R> response) {
                    try {
                        if (response.code() == 200) {
                            IRetrofitObject.onSuccess(response);
                        } else if (response.code() == 403) {
                            IRetrofitObject.onFailure("error 403");
                        } else if (response.code() == 500) {
                            IRetrofitObject.onFailure("InternalError 500");
                        } else {
                            String error = response.errorBody().string();
                            Log.e("serverError", response.code() + "  " + error);
                            IRetrofitObject.onFailure(error);
                        }
                    } catch (Exception e) {
                        Log.e("exceptionError", e.getMessage() != null ? e.getMessage() : "Server Error");
                        IRetrofitObject.onFailure(e.getMessage());
                    }
                }

                @Override
                public void onFailure(Call<R> call, Throwable t) {
                    Log.e("errorServer", t.getMessage() != null ? t.getMessage() : "Server Error");
                    IRetrofitObject.onFailure(t.getMessage());
                }
            });
        } else IRetrofitObject.onFailure("networkError");
    }
}