package ir.far5had.weather;

import android.app.Application;

import androidx.multidex.MultiDexApplication;

import io.github.inflationx.calligraphy3.CalligraphyConfig;
import io.github.inflationx.calligraphy3.CalligraphyInterceptor;
import io.github.inflationx.viewpump.ViewPump;
import ir.far5had.weather.db.AppDatabase;

/**
 * Android Application class. Used for accessing singletons.
 */
public class AppController extends MultiDexApplication {

    private AppExecutors mAppExecutors;
    private static AppController instance;

    public static synchronized AppController getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        mAppExecutors = new AppExecutors();

        ViewPump.init(ViewPump.builder()
                .addInterceptor(new CalligraphyInterceptor(
                        new CalligraphyConfig.Builder()
                                .setDefaultFontPath("font.ttf")
                                .setFontAttrId(R.attr.fontPath)
                                .build()))
                .build());
    }

    public AppDatabase getDatabase() {
        return AppDatabase.getInstance(this, mAppExecutors);
    }

    public DataRepository getRepository() {
        return DataRepository.getInstance(getDatabase());
    }
}
