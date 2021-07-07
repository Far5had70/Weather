package ir.far5had.weather.api;

import java.io.IOException;

import ir.far5had.weather.AppController;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class HeaderInterceptor implements Interceptor {

    @Override
    public Response intercept(Chain chain) throws IOException {

        Request request = chain.request().newBuilder()
                .addHeader("accept", "application/json")
                .build();

        return chain.proceed(request);
    }

}