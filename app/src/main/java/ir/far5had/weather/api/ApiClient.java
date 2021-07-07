package ir.far5had.weather.api;

import ir.far5had.weather.api.ApiInterface.IApiHelper;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    public final static String API_HOST = "http://api.weatherapi.com/";
    public final static String API_Token = "707abaf0bcf440a08d3145045213006";

    public static final long CONNECT_TIMEOUT = 15;
    public static final long READ_TIMEOUT = 15;
    public static final long WRITE_TIMEOUT = 15;


    public static IApiHelper createApi(String url) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .client(CertificateBuilder.createClient())
                .build();

        return retrofit.create(IApiHelper.class);
    }

}