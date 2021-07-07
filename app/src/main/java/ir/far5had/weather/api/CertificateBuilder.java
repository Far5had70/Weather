package ir.far5had.weather.api;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;

public class CertificateBuilder {

    public static OkHttpClient createClient() {
        return new OkHttpClient.Builder()
                .addInterceptor(new HeaderInterceptor())
                .connectTimeout(ApiClient.CONNECT_TIMEOUT, TimeUnit.SECONDS)
                .readTimeout(ApiClient.READ_TIMEOUT, TimeUnit.SECONDS)
                .writeTimeout(ApiClient.WRITE_TIMEOUT, TimeUnit.SECONDS)
                .build();
    }

}