package ir.far5had.weather.model;

import androidx.annotation.NonNull;
import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import ir.far5had.weather.BR;

@Entity(tableName = "city")
public class City extends BaseObservable {

    /**
     * id : 1162404
     * name : Astane, Gilan, Iran
     * region : Gilan
     * country : Iran
     * lat : 37.27
     * lon : 49.94
     * url : astane-gilan-iran
     */

    @PrimaryKey(autoGenerate = true)
    @NonNull
    private int id;
    private String name;
    private String region;
    private String country;
    private double lat;
    private double lon;
    private String url;

    @Bindable
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
        notifyPropertyChanged(BR.id);
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    @Bindable
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
        notifyPropertyChanged(BR.region);
    }

    @Bindable
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
        notifyPropertyChanged(BR.country);
    }

    @Bindable
    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
        notifyPropertyChanged(BR.lat);
    }

    @Bindable
    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
        notifyPropertyChanged(BR.lon);
    }

    @Bindable
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
        notifyPropertyChanged(BR.url);
    }
}
