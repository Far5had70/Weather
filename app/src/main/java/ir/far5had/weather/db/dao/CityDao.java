package ir.far5had.weather.db.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

import ir.far5had.weather.model.City;

@Dao
public interface CityDao {

    @Query("SELECT * FROM city")
    LiveData<List<City>> loadAllCities();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertAll(List<City> cities);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(City city);

    @Query("SELECT * FROM city order by id desc limit 1")
    City lastCity();
}
