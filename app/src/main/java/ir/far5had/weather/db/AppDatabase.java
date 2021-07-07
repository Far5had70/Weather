package ir.far5had.weather.db;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

import java.util.List;

import ir.far5had.weather.AppExecutors;
import ir.far5had.weather.db.dao.CityDao;
import ir.far5had.weather.model.City;

@Database(entities = {City.class}, version = 4)
public abstract class AppDatabase extends RoomDatabase {

    private static AppDatabase sInstance;

    @VisibleForTesting
    public static final String DATABASE_NAME = "basic-sample-db";

    public abstract CityDao searchDao();

    private final MutableLiveData<Boolean> mIsDatabaseCreated = new MutableLiveData<>();

    public static AppDatabase getInstance(final Context context, final AppExecutors executors) {
        if (sInstance == null) {
            synchronized (AppDatabase.class) {
                if (sInstance == null) {
                    sInstance = buildDatabase(context.getApplicationContext(), executors);
                    sInstance.updateDatabaseCreated(context.getApplicationContext());
                }
            }
        }
        return sInstance;
    }

    /**
     * Build the database. {@link Builder#build()} only sets up the database configuration and
     * creates a new instance of the database.
     * The SQLite database is only created when it's accessed for the first time.
     */
    private static AppDatabase buildDatabase(final Context appContext,
                                             final AppExecutors executors) {
        return Room.databaseBuilder(appContext, AppDatabase.class, DATABASE_NAME)
                .addCallback(new Callback() {
                    @Override
                    public void onCreate(@NonNull SupportSQLiteDatabase db) {
                        super.onCreate(db);
                        executors.diskIO().execute(() -> {
                            // Add a delay to simulate a long-running operation
                            addDelay();
                            // Generate the data for pre-population
                            AppDatabase database = AppDatabase.getInstance(appContext, executors);
                            List<City> cities = DataGenerator.generateSearches();

                            insertData(database, cities);
                            // notify that the database was created and it's ready to be used
                            database.setDatabaseCreated();
                        });
                    }
                })
                .allowMainThreadQueries()
                .fallbackToDestructiveMigration()
//                .addMigrations(MIGRATION_2_3)
                .build();
    }

    /**
     * Check whether the database already exists and expose it via {@link #getDatabaseCreated()}
     */
    private void updateDatabaseCreated(final Context context) {
        if (context.getDatabasePath(DATABASE_NAME).exists()) {
            setDatabaseCreated();
        }
    }

    private void setDatabaseCreated() {
        mIsDatabaseCreated.postValue(true);
    }

    private static void insertData(final AppDatabase database, final List<City> cityList) {
        database.runInTransaction(() -> {
            database.searchDao().insertAll(cityList);
        });
    }

    private static void addDelay() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException ignored) {
        }
    }

    public LiveData<Boolean> getDatabaseCreated() {
        return mIsDatabaseCreated;
    }

//    private static final Migration MIGRATION_2_3 = new Migration(2, 3) {
//        @Override
//        public void migrate(@NonNull SupportSQLiteDatabase database) {
//
//        }
//    };
}
