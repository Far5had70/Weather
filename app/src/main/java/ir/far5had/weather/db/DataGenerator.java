package ir.far5had.weather.db;

import java.util.ArrayList;
import java.util.List;

import ir.far5had.weather.model.City;

/**
 * Generates data to pre-populate the database
 */
public class DataGenerator {

    private static final String[] SearchesDefault = new String[]{
            "London", "Los Angeles", "Paris", "San Francisco", "Dubai"};

    public static List<City> generateSearches() {
        List<City> cities = new ArrayList<>();
        for (String item : SearchesDefault) {
            City s = new City();
            s.setId(0);
            s.setName(item);
            cities.add(s);
        }
        return cities;
    }
}
