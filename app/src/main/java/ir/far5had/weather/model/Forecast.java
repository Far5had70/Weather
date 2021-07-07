package ir.far5had.weather.model;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import java.util.List;

import ir.far5had.weather.BR;
import ir.far5had.weather.util.DateUtils;

public class Forecast extends BaseObservable{

    /**
     * location : {"name":"Tehran","region":"Tehran","country":"Iran","lat":35.73,"lon":51.33,"tz_id":"Asia/Tehran","localtime_epoch":1625217922,"localtime":"2021-07-02 13:55"}
     * current : {"last_updated_epoch":1625217300,"last_updated":"2021-07-02 13:45","temp_c":35,"temp_f":95,"is_day":1,"condition":{"text":"Partly cloudy","icon":"//cdn.weatherapi.com/weather/64x64/day/116.png","code":1003},"wind_mph":13.6,"wind_kph":22,"wind_degree":140,"wind_dir":"SE","pressure_mb":1013,"pressure_in":30.4,"precip_mm":0,"precip_in":0,"humidity":12,"cloud":25,"feelslike_c":33.2,"feelslike_f":91.7,"vis_km":10,"vis_miles":6,"uv":8,"gust_mph":8.3,"gust_kph":13.3}
     * forecast : {"forecastday":[{"date":"2021-07-02","date_epoch":1625184000,"day":{"maxtemp_c":38.1,"maxtemp_f":100.6,"mintemp_c":27,"mintemp_f":80.6,"avgtemp_c":32.9,"avgtemp_f":91.2,"maxwind_mph":8.9,"maxwind_kph":14.4,"totalprecip_mm":0,"totalprecip_in":0,"avgvis_km":10,"avgvis_miles":6,"avghumidity":16,"daily_will_it_rain":0,"daily_chance_of_rain":"0","daily_will_it_snow":0,"daily_chance_of_snow":"0","condition":{"text":"Partly cloudy","icon":"//cdn.weatherapi.com/weather/64x64/day/116.png","code":1003},"uv":11},"astro":{"sunrise":"05:53 AM","sunset":"08:24 PM","moonrise":"01:09 AM","moonset":"01:35 PM","moon_phase":"Waning Crescent","moon_illumination":"34"},"hour":[{"time_epoch":1625167800,"time":"2021-07-02 00:00","temp_c":29.5,"temp_f":85.1,"is_day":0,"condition":{"text":"Partly cloudy","icon":"//cdn.weatherapi.com/weather/64x64/night/116.png","code":1003},"wind_mph":3.6,"wind_kph":5.8,"wind_degree":52,"wind_dir":"NE","pressure_mb":1009,"pressure_in":30.3,"precip_mm":0,"precip_in":0,"humidity":19,"cloud":24,"feelslike_c":27.3,"feelslike_f":81.1,"windchill_c":29.5,"windchill_f":85.1,"heatindex_c":27.3,"heatindex_f":81.1,"dewpoint_c":3.6,"dewpoint_f":38.5,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":5.1,"gust_kph":8.3,"uv":1},{"time_epoch":1625171400,"time":"2021-07-02 01:00","temp_c":28.7,"temp_f":83.7,"is_day":0,"condition":{"text":"Partly cloudy","icon":"//cdn.weatherapi.com/weather/64x64/night/116.png","code":1003},"wind_mph":5.4,"wind_kph":8.6,"wind_degree":57,"wind_dir":"ENE","pressure_mb":1009,"pressure_in":30.3,"precip_mm":0,"precip_in":0,"humidity":20,"cloud":19,"feelslike_c":26.6,"feelslike_f":79.9,"windchill_c":28.7,"windchill_f":83.7,"heatindex_c":26.6,"heatindex_f":79.9,"dewpoint_c":3.3,"dewpoint_f":37.9,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":8.3,"gust_kph":13.3,"uv":1},{"time_epoch":1625175000,"time":"2021-07-02 02:00","temp_c":27.8,"temp_f":82,"is_day":0,"condition":{"text":"Partly cloudy","icon":"//cdn.weatherapi.com/weather/64x64/night/116.png","code":1003},"wind_mph":7.2,"wind_kph":11.5,"wind_degree":62,"wind_dir":"ENE","pressure_mb":1009,"pressure_in":30.3,"precip_mm":0,"precip_in":0,"humidity":20,"cloud":14,"feelslike_c":26,"feelslike_f":78.8,"windchill_c":27.8,"windchill_f":82,"heatindex_c":26,"heatindex_f":78.8,"dewpoint_c":3.1,"dewpoint_f":37.6,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":11.4,"gust_kph":18.4,"uv":1},{"time_epoch":1625178600,"time":"2021-07-02 03:00","temp_c":27,"temp_f":80.6,"is_day":0,"condition":{"text":"Partly cloudy","icon":"//cdn.weatherapi.com/weather/64x64/night/116.png","code":1003},"wind_mph":8.9,"wind_kph":14.4,"wind_degree":67,"wind_dir":"ENE","pressure_mb":1009,"pressure_in":30.3,"precip_mm":0,"precip_in":0,"humidity":21,"cloud":9,"feelslike_c":25.3,"feelslike_f":77.5,"windchill_c":27,"windchill_f":80.6,"heatindex_c":25.3,"heatindex_f":77.5,"dewpoint_c":2.8,"dewpoint_f":37,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":14.5,"gust_kph":23.4,"uv":1},{"time_epoch":1625182200,"time":"2021-07-02 04:00","temp_c":28.8,"temp_f":83.8,"is_day":0,"condition":{"text":"Clear","icon":"//cdn.weatherapi.com/weather/64x64/night/113.png","code":1000},"wind_mph":7.4,"wind_kph":11.9,"wind_degree":105,"wind_dir":"ESE","pressure_mb":1009,"pressure_in":30.3,"precip_mm":0,"precip_in":0,"humidity":21,"cloud":6,"feelslike_c":26.9,"feelslike_f":80.4,"windchill_c":28.8,"windchill_f":83.8,"heatindex_c":26.9,"heatindex_f":80.4,"dewpoint_c":4.2,"dewpoint_f":39.6,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":11.4,"gust_kph":18.4,"uv":1},{"time_epoch":1625185800,"time":"2021-07-02 05:00","temp_c":30.5,"temp_f":86.9,"is_day":0,"condition":{"text":"Partly cloudy","icon":"//cdn.weatherapi.com/weather/64x64/night/116.png","code":1003},"wind_mph":5.8,"wind_kph":9.4,"wind_degree":142,"wind_dir":"SE","pressure_mb":1010,"pressure_in":30.3,"precip_mm":0,"precip_in":0,"humidity":21,"cloud":3,"feelslike_c":28.6,"feelslike_f":83.5,"windchill_c":30.5,"windchill_f":86.9,"heatindex_c":28.6,"heatindex_f":83.5,"dewpoint_c":5.6,"dewpoint_f":42.1,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":8.1,"gust_kph":13,"uv":1},{"time_epoch":1625189400,"time":"2021-07-02 06:00","temp_c":32.3,"temp_f":90.1,"is_day":1,"condition":{"text":"Sunny","icon":"//cdn.weatherapi.com/weather/64x64/day/113.png","code":1000},"wind_mph":4.3,"wind_kph":6.8,"wind_degree":180,"wind_dir":"S","pressure_mb":1010,"pressure_in":30.3,"precip_mm":0,"precip_in":0,"humidity":21,"cloud":0,"feelslike_c":30.2,"feelslike_f":86.4,"windchill_c":32.3,"windchill_f":90.1,"heatindex_c":30.2,"heatindex_f":86.4,"dewpoint_c":7,"dewpoint_f":44.6,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":4.9,"gust_kph":7.9,"uv":8},{"time_epoch":1625193000,"time":"2021-07-02 07:00","temp_c":32.6,"temp_f":90.7,"is_day":1,"condition":{"text":"Sunny","icon":"//cdn.weatherapi.com/weather/64x64/day/113.png","code":1000},"wind_mph":4.9,"wind_kph":7.9,"wind_degree":178,"wind_dir":"S","pressure_mb":1010,"pressure_in":30.3,"precip_mm":0,"precip_in":0,"humidity":20,"cloud":0,"feelslike_c":30.5,"feelslike_f":86.9,"windchill_c":32.6,"windchill_f":90.7,"heatindex_c":30.5,"heatindex_f":86.9,"dewpoint_c":6.9,"dewpoint_f":44.4,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":5.6,"gust_kph":9,"uv":8},{"time_epoch":1625196600,"time":"2021-07-02 08:00","temp_c":32.8,"temp_f":91,"is_day":1,"condition":{"text":"Sunny","icon":"//cdn.weatherapi.com/weather/64x64/day/113.png","code":1000},"wind_mph":5.6,"wind_kph":9,"wind_degree":175,"wind_dir":"S","pressure_mb":1010,"pressure_in":30.3,"precip_mm":0,"precip_in":0,"humidity":20,"cloud":0,"feelslike_c":30.7,"feelslike_f":87.3,"windchill_c":32.8,"windchill_f":91,"heatindex_c":30.7,"heatindex_f":87.3,"dewpoint_c":6.9,"dewpoint_f":44.4,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":6.5,"gust_kph":10.4,"uv":8},{"time_epoch":1625200200,"time":"2021-07-02 09:00","temp_c":33.1,"temp_f":91.6,"is_day":1,"condition":{"text":"Sunny","icon":"//cdn.weatherapi.com/weather/64x64/day/113.png","code":1000},"wind_mph":6.3,"wind_kph":10.1,"wind_degree":173,"wind_dir":"S","pressure_mb":1010,"pressure_in":30.3,"precip_mm":0,"precip_in":0,"humidity":20,"cloud":0,"feelslike_c":31,"feelslike_f":87.8,"windchill_c":33.1,"windchill_f":91.6,"heatindex_c":31,"heatindex_f":87.8,"dewpoint_c":6.8,"dewpoint_f":44.2,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":7.2,"gust_kph":11.5,"uv":8},{"time_epoch":1625203800,"time":"2021-07-02 10:00","temp_c":33.7,"temp_f":92.7,"is_day":1,"condition":{"text":"Sunny","icon":"//cdn.weatherapi.com/weather/64x64/day/113.png","code":1000},"wind_mph":7.2,"wind_kph":11.5,"wind_degree":167,"wind_dir":"SSE","pressure_mb":1009,"pressure_in":30.3,"precip_mm":0,"precip_in":0,"humidity":18,"cloud":0,"feelslike_c":31.7,"feelslike_f":89.1,"windchill_c":33.7,"windchill_f":92.7,"heatindex_c":31.7,"heatindex_f":89.1,"dewpoint_c":6.2,"dewpoint_f":43.2,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":8.3,"gust_kph":13.3,"uv":8},{"time_epoch":1625207400,"time":"2021-07-02 11:00","temp_c":34.3,"temp_f":93.7,"is_day":1,"condition":{"text":"Sunny","icon":"//cdn.weatherapi.com/weather/64x64/day/113.png","code":1000},"wind_mph":8.1,"wind_kph":13,"wind_degree":161,"wind_dir":"SSE","pressure_mb":1009,"pressure_in":30.3,"precip_mm":0,"precip_in":0,"humidity":17,"cloud":0,"feelslike_c":32.4,"feelslike_f":90.3,"windchill_c":34.3,"windchill_f":93.7,"heatindex_c":32.4,"heatindex_f":90.3,"dewpoint_c":5.6,"dewpoint_f":42.1,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":9.2,"gust_kph":14.8,"uv":8},{"time_epoch":1625211000,"time":"2021-07-02 12:00","temp_c":34.9,"temp_f":94.8,"is_day":1,"condition":{"text":"Sunny","icon":"//cdn.weatherapi.com/weather/64x64/day/113.png","code":1000},"wind_mph":8.9,"wind_kph":14.4,"wind_degree":155,"wind_dir":"SSE","pressure_mb":1008,"pressure_in":30.2,"precip_mm":0,"precip_in":0,"humidity":16,"cloud":0,"feelslike_c":33.1,"feelslike_f":91.6,"windchill_c":34.9,"windchill_f":94.8,"heatindex_c":33.1,"heatindex_f":91.6,"dewpoint_c":5,"dewpoint_f":41,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":10.3,"gust_kph":16.6,"uv":8},{"time_epoch":1625214600,"time":"2021-07-02 13:00","temp_c":36,"temp_f":96.8,"is_day":1,"condition":{"text":"Sunny","icon":"//cdn.weatherapi.com/weather/64x64/day/113.png","code":1000},"wind_mph":7.8,"wind_kph":12.6,"wind_degree":165,"wind_dir":"SSE","pressure_mb":1007,"pressure_in":30.2,"precip_mm":0,"precip_in":0,"humidity":15,"cloud":0,"feelslike_c":34.5,"feelslike_f":94.1,"windchill_c":36,"windchill_f":96.8,"heatindex_c":34.5,"heatindex_f":94.1,"dewpoint_c":4.7,"dewpoint_f":40.5,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":8.9,"gust_kph":14.4,"uv":9},{"time_epoch":1625218200,"time":"2021-07-02 14:00","temp_c":37,"temp_f":98.6,"is_day":1,"condition":{"text":"Sunny","icon":"//cdn.weatherapi.com/weather/64x64/day/113.png","code":1000},"wind_mph":6.5,"wind_kph":10.4,"wind_degree":174,"wind_dir":"S","pressure_mb":1006,"pressure_in":30.2,"precip_mm":0,"precip_in":0,"humidity":13,"cloud":0,"feelslike_c":35.8,"feelslike_f":96.4,"windchill_c":37,"windchill_f":98.6,"heatindex_c":35.8,"heatindex_f":96.4,"dewpoint_c":4.4,"dewpoint_f":39.9,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":7.6,"gust_kph":12.2,"uv":9},{"time_epoch":1625221800,"time":"2021-07-02 15:00","temp_c":38.1,"temp_f":100.6,"is_day":1,"condition":{"text":"Sunny","icon":"//cdn.weatherapi.com/weather/64x64/day/113.png","code":1000},"wind_mph":5.4,"wind_kph":8.6,"wind_degree":184,"wind_dir":"S","pressure_mb":1005,"pressure_in":30.2,"precip_mm":0,"precip_in":0,"humidity":12,"cloud":0,"feelslike_c":37.2,"feelslike_f":99,"windchill_c":38.1,"windchill_f":100.6,"heatindex_c":37.2,"heatindex_f":99,"dewpoint_c":4.1,"dewpoint_f":39.4,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":6.3,"gust_kph":10.1,"uv":9},{"time_epoch":1625225400,"time":"2021-07-02 16:00","temp_c":37.5,"temp_f":99.5,"is_day":1,"condition":{"text":"Partly cloudy","icon":"//cdn.weatherapi.com/weather/64x64/day/116.png","code":1003},"wind_mph":5.6,"wind_kph":9,"wind_degree":154,"wind_dir":"SSE","pressure_mb":1005,"pressure_in":30.2,"precip_mm":0,"precip_in":0,"humidity":12,"cloud":2,"feelslike_c":36.4,"feelslike_f":97.5,"windchill_c":37.5,"windchill_f":99.5,"heatindex_c":36.4,"heatindex_f":97.5,"dewpoint_c":3,"dewpoint_f":37.4,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":6.5,"gust_kph":10.4,"uv":9},{"time_epoch":1625229000,"time":"2021-07-02 17:00","temp_c":37,"temp_f":98.6,"is_day":1,"condition":{"text":"Sunny","icon":"//cdn.weatherapi.com/weather/64x64/day/113.png","code":1000},"wind_mph":5.6,"wind_kph":9,"wind_degree":123,"wind_dir":"ESE","pressure_mb":1005,"pressure_in":30.1,"precip_mm":0,"precip_in":0,"humidity":11,"cloud":4,"feelslike_c":35.7,"feelslike_f":96.3,"windchill_c":37,"windchill_f":98.6,"heatindex_c":35.7,"heatindex_f":96.3,"dewpoint_c":1.9,"dewpoint_f":35.4,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":6.5,"gust_kph":10.4,"uv":9},{"time_epoch":1625232600,"time":"2021-07-02 18:00","temp_c":36.4,"temp_f":97.5,"is_day":1,"condition":{"text":"Partly cloudy","icon":"//cdn.weatherapi.com/weather/64x64/day/116.png","code":1003},"wind_mph":5.8,"wind_kph":9.4,"wind_degree":92,"wind_dir":"E","pressure_mb":1004,"pressure_in":30.1,"precip_mm":0,"precip_in":0,"humidity":11,"cloud":7,"feelslike_c":34.9,"feelslike_f":94.8,"windchill_c":36.4,"windchill_f":97.5,"heatindex_c":34.9,"heatindex_f":94.8,"dewpoint_c":0.8,"dewpoint_f":33.4,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":6.7,"gust_kph":10.8,"uv":9},{"time_epoch":1625236200,"time":"2021-07-02 19:00","temp_c":34.8,"temp_f":94.6,"is_day":1,"condition":{"text":"Partly cloudy","icon":"//cdn.weatherapi.com/weather/64x64/day/116.png","code":1003},"wind_mph":6.5,"wind_kph":10.4,"wind_degree":86,"wind_dir":"E","pressure_mb":1004,"pressure_in":30.1,"precip_mm":0,"precip_in":0,"humidity":11,"cloud":8,"feelslike_c":33.1,"feelslike_f":91.6,"windchill_c":34.8,"windchill_f":94.6,"heatindex_c":33.1,"heatindex_f":91.6,"dewpoint_c":0,"dewpoint_f":32,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":8.7,"gust_kph":14,"uv":8},{"time_epoch":1625239800,"time":"2021-07-02 20:00","temp_c":33.2,"temp_f":91.8,"is_day":0,"condition":{"text":"Partly cloudy","icon":"//cdn.weatherapi.com/weather/64x64/night/116.png","code":1003},"wind_mph":7.2,"wind_kph":11.5,"wind_degree":79,"wind_dir":"E","pressure_mb":1005,"pressure_in":30.1,"precip_mm":0,"precip_in":0,"humidity":11,"cloud":9,"feelslike_c":31.2,"feelslike_f":88.2,"windchill_c":33.2,"windchill_f":91.8,"heatindex_c":31.2,"heatindex_f":88.2,"dewpoint_c":-0.9,"dewpoint_f":30.4,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":10.5,"gust_kph":16.9,"uv":1},{"time_epoch":1625243400,"time":"2021-07-02 21:00","temp_c":31.6,"temp_f":88.9,"is_day":0,"condition":{"text":"Partly cloudy","icon":"//cdn.weatherapi.com/weather/64x64/night/116.png","code":1003},"wind_mph":7.8,"wind_kph":12.6,"wind_degree":73,"wind_dir":"ENE","pressure_mb":1005,"pressure_in":30.1,"precip_mm":0,"precip_in":0,"humidity":12,"cloud":10,"feelslike_c":29.4,"feelslike_f":84.9,"windchill_c":31.6,"windchill_f":88.9,"heatindex_c":29.4,"heatindex_f":84.9,"dewpoint_c":-1.7,"dewpoint_f":28.9,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":12.5,"gust_kph":20.2,"uv":1},{"time_epoch":1625247000,"time":"2021-07-02 22:00","temp_c":31,"temp_f":87.8,"is_day":0,"condition":{"text":"Partly cloudy","icon":"//cdn.weatherapi.com/weather/64x64/night/116.png","code":1003},"wind_mph":6.9,"wind_kph":11.2,"wind_degree":98,"wind_dir":"E","pressure_mb":1005,"pressure_in":30.1,"precip_mm":0,"precip_in":0,"humidity":13,"cloud":15,"feelslike_c":28.8,"feelslike_f":83.8,"windchill_c":31,"windchill_f":87.8,"heatindex_c":28.8,"heatindex_f":83.8,"dewpoint_c":-0.8,"dewpoint_f":30.6,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":11,"gust_kph":17.6,"uv":1},{"time_epoch":1625250600,"time":"2021-07-02 23:00","temp_c":30.4,"temp_f":86.7,"is_day":0,"condition":{"text":"Partly cloudy","icon":"//cdn.weatherapi.com/weather/64x64/night/116.png","code":1003},"wind_mph":5.8,"wind_kph":9.4,"wind_degree":123,"wind_dir":"ESE","pressure_mb":1005,"pressure_in":30.1,"precip_mm":0,"precip_in":0,"humidity":14,"cloud":20,"feelslike_c":28.2,"feelslike_f":82.8,"windchill_c":30.4,"windchill_f":86.7,"heatindex_c":28.2,"heatindex_f":82.8,"dewpoint_c":0,"dewpoint_f":32,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":9.4,"gust_kph":15.1,"uv":1}]},{"date":"2021-07-03","date_epoch":1625270400,"day":{"maxtemp_c":37.8,"maxtemp_f":100,"mintemp_c":28,"mintemp_f":82.4,"avgtemp_c":33.1,"avgtemp_f":91.5,"maxwind_mph":9.4,"maxwind_kph":15.1,"totalprecip_mm":0,"totalprecip_in":0,"avgvis_km":10,"avgvis_miles":6,"avghumidity":15,"daily_will_it_rain":0,"daily_chance_of_rain":"0","daily_will_it_snow":0,"daily_chance_of_snow":"0","condition":{"text":"Partly cloudy","icon":"//cdn.weatherapi.com/weather/64x64/day/116.png","code":1003},"uv":11},"astro":{"sunrise":"05:53 AM","sunset":"08:24 PM","moonrise":"01:35 AM","moonset":"02:32 PM","moon_phase":"Waning Crescent","moon_illumination":"28"},"hour":[{"time_epoch":1625254200,"time":"2021-07-03 00:00","temp_c":29.8,"temp_f":85.6,"is_day":0,"condition":{"text":"Partly cloudy","icon":"//cdn.weatherapi.com/weather/64x64/night/116.png","code":1003},"wind_mph":4.9,"wind_kph":7.9,"wind_degree":148,"wind_dir":"SSE","pressure_mb":1005,"pressure_in":30.1,"precip_mm":0,"precip_in":0,"humidity":16,"cloud":24,"feelslike_c":27.6,"feelslike_f":81.7,"windchill_c":29.8,"windchill_f":85.6,"heatindex_c":27.6,"heatindex_f":81.7,"dewpoint_c":0.9,"dewpoint_f":33.6,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":7.8,"gust_kph":12.6,"uv":1},{"time_epoch":1625257800,"time":"2021-07-03 01:00","temp_c":29.2,"temp_f":84.6,"is_day":0,"condition":{"text":"Partly cloudy","icon":"//cdn.weatherapi.com/weather/64x64/night/116.png","code":1003},"wind_mph":4,"wind_kph":6.5,"wind_degree":168,"wind_dir":"SSE","pressure_mb":1005,"pressure_in":30.2,"precip_mm":0,"precip_in":0,"humidity":17,"cloud":31,"feelslike_c":27.1,"feelslike_f":80.8,"windchill_c":29.2,"windchill_f":84.6,"heatindex_c":27.1,"heatindex_f":80.8,"dewpoint_c":1.6,"dewpoint_f":34.9,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":6.5,"gust_kph":10.4,"uv":1},{"time_epoch":1625261400,"time":"2021-07-03 02:00","temp_c":28.6,"temp_f":83.5,"is_day":0,"condition":{"text":"Partly cloudy","icon":"//cdn.weatherapi.com/weather/64x64/night/116.png","code":1003},"wind_mph":3.1,"wind_kph":5,"wind_degree":187,"wind_dir":"S","pressure_mb":1005,"pressure_in":30.2,"precip_mm":0,"precip_in":0,"humidity":19,"cloud":39,"feelslike_c":26.5,"feelslike_f":79.7,"windchill_c":28.6,"windchill_f":83.5,"heatindex_c":26.5,"heatindex_f":79.7,"dewpoint_c":2.4,"dewpoint_f":36.3,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":4.9,"gust_kph":7.9,"uv":1},{"time_epoch":1625265000,"time":"2021-07-03 03:00","temp_c":28,"temp_f":82.4,"is_day":0,"condition":{"text":"Partly cloudy","icon":"//cdn.weatherapi.com/weather/64x64/night/116.png","code":1003},"wind_mph":2.2,"wind_kph":3.6,"wind_degree":207,"wind_dir":"SSW","pressure_mb":1006,"pressure_in":30.2,"precip_mm":0,"precip_in":0,"humidity":20,"cloud":46,"feelslike_c":26,"feelslike_f":78.8,"windchill_c":28,"windchill_f":82.4,"heatindex_c":26,"heatindex_f":78.8,"dewpoint_c":3.1,"dewpoint_f":37.6,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":3.6,"gust_kph":5.8,"uv":1},{"time_epoch":1625268600,"time":"2021-07-03 04:00","temp_c":28.7,"temp_f":83.7,"is_day":0,"condition":{"text":"Partly cloudy","icon":"//cdn.weatherapi.com/weather/64x64/night/116.png","code":1003},"wind_mph":3.1,"wind_kph":5,"wind_degree":188,"wind_dir":"S","pressure_mb":1006,"pressure_in":30.2,"precip_mm":0,"precip_in":0,"humidity":21,"cloud":35,"feelslike_c":26.7,"feelslike_f":80.1,"windchill_c":28.7,"windchill_f":83.7,"heatindex_c":26.7,"heatindex_f":80.1,"dewpoint_c":4.2,"dewpoint_f":39.6,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":4.3,"gust_kph":6.8,"uv":1},{"time_epoch":1625272200,"time":"2021-07-03 05:00","temp_c":29.4,"temp_f":84.9,"is_day":0,"condition":{"text":"Partly cloudy","icon":"//cdn.weatherapi.com/weather/64x64/night/116.png","code":1003},"wind_mph":3.8,"wind_kph":6.1,"wind_degree":170,"wind_dir":"S","pressure_mb":1006,"pressure_in":30.2,"precip_mm":0,"precip_in":0,"humidity":22,"cloud":24,"feelslike_c":27.4,"feelslike_f":81.3,"windchill_c":29.4,"windchill_f":84.9,"heatindex_c":27.4,"heatindex_f":81.3,"dewpoint_c":5.2,"dewpoint_f":41.4,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":4.7,"gust_kph":7.6,"uv":1},{"time_epoch":1625275800,"time":"2021-07-03 06:00","temp_c":30.1,"temp_f":86.2,"is_day":1,"condition":{"text":"Partly cloudy","icon":"//cdn.weatherapi.com/weather/64x64/day/116.png","code":1003},"wind_mph":4.7,"wind_kph":7.6,"wind_degree":151,"wind_dir":"SSE","pressure_mb":1007,"pressure_in":30.2,"precip_mm":0,"precip_in":0,"humidity":22,"cloud":12,"feelslike_c":28.1,"feelslike_f":82.6,"windchill_c":30.1,"windchill_f":86.2,"heatindex_c":28.1,"heatindex_f":82.6,"dewpoint_c":6.3,"dewpoint_f":43.3,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":5.4,"gust_kph":8.6,"uv":8},{"time_epoch":1625279400,"time":"2021-07-03 07:00","temp_c":31.2,"temp_f":88.2,"is_day":1,"condition":{"text":"Partly cloudy","icon":"//cdn.weatherapi.com/weather/64x64/day/116.png","code":1003},"wind_mph":5.6,"wind_kph":9,"wind_degree":151,"wind_dir":"SSE","pressure_mb":1007,"pressure_in":30.2,"precip_mm":0,"precip_in":0,"humidity":20,"cloud":12,"feelslike_c":29.2,"feelslike_f":84.6,"windchill_c":31.2,"windchill_f":88.2,"heatindex_c":29.2,"heatindex_f":84.6,"dewpoint_c":5.8,"dewpoint_f":42.4,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":6.3,"gust_kph":10.1,"uv":8},{"time_epoch":1625283000,"time":"2021-07-03 08:00","temp_c":32.3,"temp_f":90.1,"is_day":1,"condition":{"text":"Partly cloudy","icon":"//cdn.weatherapi.com/weather/64x64/day/116.png","code":1003},"wind_mph":6.3,"wind_kph":10.1,"wind_degree":150,"wind_dir":"SSE","pressure_mb":1006,"pressure_in":30.2,"precip_mm":0,"precip_in":0,"humidity":18,"cloud":11,"feelslike_c":30.2,"feelslike_f":86.4,"windchill_c":32.3,"windchill_f":90.1,"heatindex_c":30.2,"heatindex_f":86.4,"dewpoint_c":5.2,"dewpoint_f":41.4,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":7.4,"gust_kph":11.9,"uv":8},{"time_epoch":1625286600,"time":"2021-07-03 09:00","temp_c":33.4,"temp_f":92.1,"is_day":1,"condition":{"text":"Partly cloudy","icon":"//cdn.weatherapi.com/weather/64x64/day/116.png","code":1003},"wind_mph":7.2,"wind_kph":11.5,"wind_degree":149,"wind_dir":"SSE","pressure_mb":1006,"pressure_in":30.2,"precip_mm":0,"precip_in":0,"humidity":17,"cloud":10,"feelslike_c":31.3,"feelslike_f":88.3,"windchill_c":33.4,"windchill_f":92.1,"heatindex_c":31.3,"heatindex_f":88.3,"dewpoint_c":4.7,"dewpoint_f":40.5,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":8.3,"gust_kph":13.3,"uv":8},{"time_epoch":1625290200,"time":"2021-07-03 10:00","temp_c":34.2,"temp_f":93.6,"is_day":1,"condition":{"text":"Partly cloudy","icon":"//cdn.weatherapi.com/weather/64x64/day/116.png","code":1003},"wind_mph":7.8,"wind_kph":12.6,"wind_degree":148,"wind_dir":"SSE","pressure_mb":1005,"pressure_in":30.2,"precip_mm":0,"precip_in":0,"humidity":15,"cloud":12,"feelslike_c":32.3,"feelslike_f":90.1,"windchill_c":34.2,"windchill_f":93.6,"heatindex_c":32.3,"heatindex_f":90.1,"dewpoint_c":4.2,"dewpoint_f":39.6,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":9.2,"gust_kph":14.8,"uv":8},{"time_epoch":1625293800,"time":"2021-07-03 11:00","temp_c":35,"temp_f":95,"is_day":1,"condition":{"text":"Partly cloudy","icon":"//cdn.weatherapi.com/weather/64x64/day/116.png","code":1003},"wind_mph":8.7,"wind_kph":14,"wind_degree":148,"wind_dir":"SSE","pressure_mb":1004,"pressure_in":30.1,"precip_mm":0,"precip_in":0,"humidity":14,"cloud":14,"feelslike_c":33.2,"feelslike_f":91.8,"windchill_c":35,"windchill_f":95,"heatindex_c":33.2,"heatindex_f":91.8,"dewpoint_c":3.6,"dewpoint_f":38.5,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":9.8,"gust_kph":15.8,"uv":9},{"time_epoch":1625297400,"time":"2021-07-03 12:00","temp_c":35.8,"temp_f":96.4,"is_day":1,"condition":{"text":"Partly cloudy","icon":"//cdn.weatherapi.com/weather/64x64/day/116.png","code":1003},"wind_mph":9.4,"wind_kph":15.1,"wind_degree":147,"wind_dir":"SSE","pressure_mb":1004,"pressure_in":30.1,"precip_mm":0,"precip_in":0,"humidity":13,"cloud":17,"feelslike_c":34.2,"feelslike_f":93.6,"windchill_c":35.8,"windchill_f":96.4,"heatindex_c":34.2,"heatindex_f":93.6,"dewpoint_c":3.1,"dewpoint_f":37.6,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":10.7,"gust_kph":17.3,"uv":9},{"time_epoch":1625301000,"time":"2021-07-03 13:00","temp_c":36.5,"temp_f":97.7,"is_day":1,"condition":{"text":"Partly cloudy","icon":"//cdn.weatherapi.com/weather/64x64/day/116.png","code":1003},"wind_mph":8.9,"wind_kph":14.4,"wind_degree":156,"wind_dir":"SSE","pressure_mb":1003,"pressure_in":30.1,"precip_mm":0,"precip_in":0,"humidity":12,"cloud":13,"feelslike_c":35.1,"feelslike_f":95.2,"windchill_c":36.5,"windchill_f":97.7,"heatindex_c":35.1,"heatindex_f":95.2,"dewpoint_c":2.6,"dewpoint_f":36.7,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":10.1,"gust_kph":16.2,"uv":9},{"time_epoch":1625304600,"time":"2021-07-03 14:00","temp_c":37.1,"temp_f":98.8,"is_day":1,"condition":{"text":"Partly cloudy","icon":"//cdn.weatherapi.com/weather/64x64/day/116.png","code":1003},"wind_mph":8.3,"wind_kph":13.3,"wind_degree":165,"wind_dir":"SSE","pressure_mb":1002,"pressure_in":30.1,"precip_mm":0,"precip_in":0,"humidity":11,"cloud":10,"feelslike_c":35.9,"feelslike_f":96.6,"windchill_c":37.1,"windchill_f":98.8,"heatindex_c":35.9,"heatindex_f":96.6,"dewpoint_c":2.2,"dewpoint_f":36,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":9.6,"gust_kph":15.5,"uv":9},{"time_epoch":1625308200,"time":"2021-07-03 15:00","temp_c":37.8,"temp_f":100,"is_day":1,"condition":{"text":"Partly cloudy","icon":"//cdn.weatherapi.com/weather/64x64/day/116.png","code":1003},"wind_mph":7.8,"wind_kph":12.6,"wind_degree":174,"wind_dir":"S","pressure_mb":1001,"pressure_in":30,"precip_mm":0,"precip_in":0,"humidity":11,"cloud":6,"feelslike_c":36.8,"feelslike_f":98.2,"windchill_c":37.8,"windchill_f":100,"heatindex_c":36.8,"heatindex_f":98.2,"dewpoint_c":1.7,"dewpoint_f":35.1,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":8.9,"gust_kph":14.4,"uv":9},{"time_epoch":1625311800,"time":"2021-07-03 16:00","temp_c":37.1,"temp_f":98.8,"is_day":1,"condition":{"text":"Partly cloudy","icon":"//cdn.weatherapi.com/weather/64x64/day/116.png","code":1003},"wind_mph":6.3,"wind_kph":10.1,"wind_degree":173,"wind_dir":"S","pressure_mb":1001,"pressure_in":30,"precip_mm":0,"precip_in":0,"humidity":10,"cloud":6,"feelslike_c":37.5,"feelslike_f":99.5,"windchill_c":37.1,"windchill_f":98.8,"heatindex_c":37.5,"heatindex_f":99.5,"dewpoint_c":1.4,"dewpoint_f":34.5,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":7.2,"gust_kph":11.5,"uv":9},{"time_epoch":1625315400,"time":"2021-07-03 17:00","temp_c":36.5,"temp_f":97.7,"is_day":1,"condition":{"text":"Partly cloudy","icon":"//cdn.weatherapi.com/weather/64x64/day/116.png","code":1003},"wind_mph":4.9,"wind_kph":7.9,"wind_degree":171,"wind_dir":"S","pressure_mb":1001,"pressure_in":30,"precip_mm":0,"precip_in":0,"humidity":10,"cloud":5,"feelslike_c":38.1,"feelslike_f":100.6,"windchill_c":36.5,"windchill_f":97.7,"heatindex_c":38.1,"heatindex_f":100.6,"dewpoint_c":1.1,"dewpoint_f":34,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":5.6,"gust_kph":9,"uv":9},{"time_epoch":1625319000,"time":"2021-07-03 18:00","temp_c":35.8,"temp_f":96.4,"is_day":1,"condition":{"text":"Partly cloudy","icon":"//cdn.weatherapi.com/weather/64x64/day/116.png","code":1003},"wind_mph":3.4,"wind_kph":5.4,"wind_degree":170,"wind_dir":"S","pressure_mb":1001,"pressure_in":30,"precip_mm":0,"precip_in":0,"humidity":9,"cloud":5,"feelslike_c":38.8,"feelslike_f":101.8,"windchill_c":35.8,"windchill_f":96.4,"heatindex_c":38.8,"heatindex_f":101.8,"dewpoint_c":0.8,"dewpoint_f":33.4,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":3.8,"gust_kph":6.1,"uv":9},{"time_epoch":1625322600,"time":"2021-07-03 19:00","temp_c":35.1,"temp_f":95.2,"is_day":1,"condition":{"text":"Partly cloudy","icon":"//cdn.weatherapi.com/weather/64x64/day/116.png","code":1003},"wind_mph":4.3,"wind_kph":6.8,"wind_degree":151,"wind_dir":"SSE","pressure_mb":1001,"pressure_in":30,"precip_mm":0,"precip_in":0,"humidity":10,"cloud":5,"feelslike_c":36.5,"feelslike_f":97.7,"windchill_c":35.1,"windchill_f":95.2,"heatindex_c":36.5,"heatindex_f":97.7,"dewpoint_c":0.7,"dewpoint_f":33.3,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":5.4,"gust_kph":8.6,"uv":9},{"time_epoch":1625326200,"time":"2021-07-03 20:00","temp_c":34.5,"temp_f":94.1,"is_day":0,"condition":{"text":"Partly cloudy","icon":"//cdn.weatherapi.com/weather/64x64/night/116.png","code":1003},"wind_mph":5.4,"wind_kph":8.6,"wind_degree":132,"wind_dir":"SE","pressure_mb":1002,"pressure_in":30,"precip_mm":0,"precip_in":0,"humidity":11,"cloud":4,"feelslike_c":34.1,"feelslike_f":93.4,"windchill_c":34.5,"windchill_f":94.1,"heatindex_c":34.1,"heatindex_f":93.4,"dewpoint_c":0.5,"dewpoint_f":32.9,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":6.7,"gust_kph":10.8,"uv":1},{"time_epoch":1625329800,"time":"2021-07-03 21:00","temp_c":33.8,"temp_f":92.8,"is_day":0,"condition":{"text":"Partly cloudy","icon":"//cdn.weatherapi.com/weather/64x64/night/116.png","code":1003},"wind_mph":6.3,"wind_kph":10.1,"wind_degree":113,"wind_dir":"ESE","pressure_mb":1002,"pressure_in":30.1,"precip_mm":0,"precip_in":0,"humidity":12,"cloud":4,"feelslike_c":31.8,"feelslike_f":89.2,"windchill_c":33.8,"windchill_f":92.8,"heatindex_c":31.8,"heatindex_f":89.2,"dewpoint_c":0.4,"dewpoint_f":32.7,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":8.3,"gust_kph":13.3,"uv":1},{"time_epoch":1625333400,"time":"2021-07-03 22:00","temp_c":32.5,"temp_f":90.5,"is_day":0,"condition":{"text":"Partly cloudy","icon":"//cdn.weatherapi.com/weather/64x64/night/116.png","code":1003},"wind_mph":5.4,"wind_kph":8.6,"wind_degree":136,"wind_dir":"SE","pressure_mb":1002,"pressure_in":30.1,"precip_mm":0,"precip_in":0,"humidity":14,"cloud":12,"feelslike_c":30.4,"feelslike_f":86.7,"windchill_c":32.5,"windchill_f":90.5,"heatindex_c":30.4,"heatindex_f":86.7,"dewpoint_c":1.4,"dewpoint_f":34.5,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":7.4,"gust_kph":11.9,"uv":1},{"time_epoch":1625337000,"time":"2021-07-03 23:00","temp_c":31.2,"temp_f":88.2,"is_day":0,"condition":{"text":"Partly cloudy","icon":"//cdn.weatherapi.com/weather/64x64/night/116.png","code":1003},"wind_mph":4.5,"wind_kph":7.2,"wind_degree":159,"wind_dir":"SSE","pressure_mb":1003,"pressure_in":30.1,"precip_mm":0,"precip_in":0,"humidity":16,"cloud":20,"feelslike_c":29.1,"feelslike_f":84.4,"windchill_c":31.2,"windchill_f":88.2,"heatindex_c":29.1,"heatindex_f":84.4,"dewpoint_c":2.3,"dewpoint_f":36.1,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":6.5,"gust_kph":10.4,"uv":1}]},{"date":"2021-07-04","date_epoch":1625356800,"day":{"maxtemp_c":39.8,"maxtemp_f":103.6,"mintemp_c":27.8,"mintemp_f":82,"avgtemp_c":33.8,"avgtemp_f":92.9,"maxwind_mph":9.6,"maxwind_kph":15.5,"totalprecip_mm":0,"totalprecip_in":0,"avgvis_km":10,"avgvis_miles":6,"avghumidity":15,"daily_will_it_rain":0,"daily_chance_of_rain":"0","daily_will_it_snow":0,"daily_chance_of_snow":"0","condition":{"text":"Partly cloudy","icon":"//cdn.weatherapi.com/weather/64x64/day/116.png","code":1003},"uv":11},"astro":{"sunrise":"05:54 AM","sunset":"08:24 PM","moonrise":"02:00 AM","moonset":"03:29 PM","moon_phase":"Waning Crescent","moon_illumination":"21"},"hour":[{"time_epoch":1625340600,"time":"2021-07-04 00:00","temp_c":29.9,"temp_f":85.8,"is_day":0,"condition":{"text":"Partly cloudy","icon":"//cdn.weatherapi.com/weather/64x64/night/116.png","code":1003},"wind_mph":3.6,"wind_kph":5.8,"wind_degree":182,"wind_dir":"S","pressure_mb":1003,"pressure_in":30.1,"precip_mm":0,"precip_in":0,"humidity":18,"cloud":28,"feelslike_c":27.7,"feelslike_f":81.9,"windchill_c":29.9,"windchill_f":85.8,"heatindex_c":27.7,"heatindex_f":81.9,"dewpoint_c":3.3,"dewpoint_f":37.9,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":5.6,"gust_kph":9,"uv":1},{"time_epoch":1625344200,"time":"2021-07-04 01:00","temp_c":29.2,"temp_f":84.6,"is_day":0,"condition":{"text":"Partly cloudy","icon":"//cdn.weatherapi.com/weather/64x64/night/116.png","code":1003},"wind_mph":3.8,"wind_kph":6.1,"wind_degree":189,"wind_dir":"S","pressure_mb":1004,"pressure_in":30.1,"precip_mm":0,"precip_in":0,"humidity":20,"cloud":25,"feelslike_c":27.1,"feelslike_f":80.8,"windchill_c":29.2,"windchill_f":84.6,"heatindex_c":27.1,"heatindex_f":80.8,"dewpoint_c":3.5,"dewpoint_f":38.3,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":6,"gust_kph":9.7,"uv":1},{"time_epoch":1625347800,"time":"2021-07-04 02:00","temp_c":28.5,"temp_f":83.3,"is_day":0,"condition":{"text":"Partly cloudy","icon":"//cdn.weatherapi.com/weather/64x64/night/116.png","code":1003},"wind_mph":4,"wind_kph":6.5,"wind_degree":195,"wind_dir":"SSW","pressure_mb":1005,"pressure_in":30.1,"precip_mm":0,"precip_in":0,"humidity":21,"cloud":23,"feelslike_c":26.6,"feelslike_f":79.9,"windchill_c":28.5,"windchill_f":83.3,"heatindex_c":26.6,"heatindex_f":79.9,"dewpoint_c":3.8,"dewpoint_f":38.8,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":6.3,"gust_kph":10.1,"uv":1},{"time_epoch":1625351400,"time":"2021-07-04 03:00","temp_c":27.8,"temp_f":82,"is_day":0,"condition":{"text":"Partly cloudy","icon":"//cdn.weatherapi.com/weather/64x64/night/116.png","code":1003},"wind_mph":4.3,"wind_kph":6.8,"wind_degree":202,"wind_dir":"SSW","pressure_mb":1006,"pressure_in":30.2,"precip_mm":0,"precip_in":0,"humidity":22,"cloud":21,"feelslike_c":26,"feelslike_f":78.8,"windchill_c":27.8,"windchill_f":82,"heatindex_c":26,"heatindex_f":78.8,"dewpoint_c":4,"dewpoint_f":39.2,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":6.7,"gust_kph":10.8,"uv":1},{"time_epoch":1625355000,"time":"2021-07-04 04:00","temp_c":28.8,"temp_f":83.8,"is_day":0,"condition":{"text":"Partly cloudy","icon":"//cdn.weatherapi.com/weather/64x64/night/116.png","code":1003},"wind_mph":3.6,"wind_kph":5.8,"wind_degree":160,"wind_dir":"SSE","pressure_mb":1006,"pressure_in":30.2,"precip_mm":0,"precip_in":0,"humidity":21,"cloud":16,"feelslike_c":26.8,"feelslike_f":80.2,"windchill_c":28.8,"windchill_f":83.8,"heatindex_c":26.8,"heatindex_f":80.2,"dewpoint_c":4.5,"dewpoint_f":40.1,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":5.4,"gust_kph":8.6,"uv":1},{"time_epoch":1625358600,"time":"2021-07-04 05:00","temp_c":29.7,"temp_f":85.5,"is_day":0,"condition":{"text":"Partly cloudy","icon":"//cdn.weatherapi.com/weather/64x64/night/116.png","code":1003},"wind_mph":2.9,"wind_kph":4.7,"wind_degree":119,"wind_dir":"ESE","pressure_mb":1006,"pressure_in":30.2,"precip_mm":0,"precip_in":0,"humidity":21,"cloud":11,"feelslike_c":27.7,"feelslike_f":81.9,"windchill_c":29.7,"windchill_f":85.5,"heatindex_c":27.7,"heatindex_f":81.9,"dewpoint_c":5.1,"dewpoint_f":41.2,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":3.8,"gust_kph":6.1,"uv":1},{"time_epoch":1625362200,"time":"2021-07-04 06:00","temp_c":30.7,"temp_f":87.3,"is_day":1,"condition":{"text":"Partly cloudy","icon":"//cdn.weatherapi.com/weather/64x64/day/116.png","code":1003},"wind_mph":2.2,"wind_kph":3.6,"wind_degree":77,"wind_dir":"ENE","pressure_mb":1006,"pressure_in":30.2,"precip_mm":0,"precip_in":0,"humidity":21,"cloud":6,"feelslike_c":28.5,"feelslike_f":83.3,"windchill_c":30.7,"windchill_f":87.3,"heatindex_c":28.5,"heatindex_f":83.3,"dewpoint_c":5.6,"dewpoint_f":42.1,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":2.5,"gust_kph":4,"uv":8},{"time_epoch":1625365800,"time":"2021-07-04 07:00","temp_c":31.9,"temp_f":89.4,"is_day":1,"condition":{"text":"Partly cloudy","icon":"//cdn.weatherapi.com/weather/64x64/day/116.png","code":1003},"wind_mph":4.3,"wind_kph":6.8,"wind_degree":95,"wind_dir":"E","pressure_mb":1006,"pressure_in":30.2,"precip_mm":0,"precip_in":0,"humidity":19,"cloud":8,"feelslike_c":29.8,"feelslike_f":85.6,"windchill_c":31.9,"windchill_f":89.4,"heatindex_c":29.8,"heatindex_f":85.6,"dewpoint_c":5.2,"dewpoint_f":41.4,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":4.9,"gust_kph":7.9,"uv":8},{"time_epoch":1625369400,"time":"2021-07-04 08:00","temp_c":33.1,"temp_f":91.6,"is_day":1,"condition":{"text":"Partly cloudy","icon":"//cdn.weatherapi.com/weather/64x64/day/116.png","code":1003},"wind_mph":6.5,"wind_kph":10.4,"wind_degree":113,"wind_dir":"ESE","pressure_mb":1006,"pressure_in":30.2,"precip_mm":0,"precip_in":0,"humidity":17,"cloud":9,"feelslike_c":31,"feelslike_f":87.8,"windchill_c":33.1,"windchill_f":91.6,"heatindex_c":31,"heatindex_f":87.8,"dewpoint_c":4.9,"dewpoint_f":40.8,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":7.4,"gust_kph":11.9,"uv":8},{"time_epoch":1625373000,"time":"2021-07-04 09:00","temp_c":34.3,"temp_f":93.7,"is_day":1,"condition":{"text":"Partly cloudy","icon":"//cdn.weatherapi.com/weather/64x64/day/116.png","code":1003},"wind_mph":8.5,"wind_kph":13.7,"wind_degree":131,"wind_dir":"SE","pressure_mb":1005,"pressure_in":30.2,"precip_mm":0,"precip_in":0,"humidity":16,"cloud":10,"feelslike_c":32.3,"feelslike_f":90.1,"windchill_c":34.3,"windchill_f":93.7,"heatindex_c":32.3,"heatindex_f":90.1,"dewpoint_c":4.5,"dewpoint_f":40.1,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":9.8,"gust_kph":15.8,"uv":8},{"time_epoch":1625376600,"time":"2021-07-04 10:00","temp_c":35.1,"temp_f":95.2,"is_day":1,"condition":{"text":"Partly cloudy","icon":"//cdn.weatherapi.com/weather/64x64/day/116.png","code":1003},"wind_mph":8.9,"wind_kph":14.4,"wind_degree":136,"wind_dir":"SE","pressure_mb":1005,"pressure_in":30.1,"precip_mm":0,"precip_in":0,"humidity":15,"cloud":11,"feelslike_c":33.3,"feelslike_f":91.9,"windchill_c":35.1,"windchill_f":95.2,"heatindex_c":33.3,"heatindex_f":91.9,"dewpoint_c":4.3,"dewpoint_f":39.7,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":10.3,"gust_kph":16.6,"uv":9},{"time_epoch":1625380200,"time":"2021-07-04 11:00","temp_c":35.9,"temp_f":96.6,"is_day":1,"condition":{"text":"Partly cloudy","icon":"//cdn.weatherapi.com/weather/64x64/day/116.png","code":1003},"wind_mph":9.2,"wind_kph":14.8,"wind_degree":140,"wind_dir":"SE","pressure_mb":1004,"pressure_in":30.1,"precip_mm":0,"precip_in":0,"humidity":14,"cloud":13,"feelslike_c":34.3,"feelslike_f":93.7,"windchill_c":35.9,"windchill_f":96.6,"heatindex_c":34.3,"heatindex_f":93.7,"dewpoint_c":4.2,"dewpoint_f":39.6,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":10.7,"gust_kph":17.3,"uv":9},{"time_epoch":1625383800,"time":"2021-07-04 12:00","temp_c":36.7,"temp_f":98.1,"is_day":1,"condition":{"text":"Partly cloudy","icon":"//cdn.weatherapi.com/weather/64x64/day/116.png","code":1003},"wind_mph":9.6,"wind_kph":15.5,"wind_degree":144,"wind_dir":"SE","pressure_mb":1003,"pressure_in":30.1,"precip_mm":0,"precip_in":0,"humidity":13,"cloud":14,"feelslike_c":35.3,"feelslike_f":95.5,"windchill_c":36.7,"windchill_f":98.1,"heatindex_c":35.3,"heatindex_f":95.5,"dewpoint_c":4,"dewpoint_f":39.2,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":11.2,"gust_kph":18,"uv":9},{"time_epoch":1625387400,"time":"2021-07-04 13:00","temp_c":37.7,"temp_f":99.9,"is_day":1,"condition":{"text":"Sunny","icon":"//cdn.weatherapi.com/weather/64x64/day/113.png","code":1000},"wind_mph":8.9,"wind_kph":14.4,"wind_degree":144,"wind_dir":"SE","pressure_mb":1002,"pressure_in":30.1,"precip_mm":0,"precip_in":0,"humidity":13,"cloud":10,"feelslike_c":36.7,"feelslike_f":98.1,"windchill_c":37.7,"windchill_f":99.9,"heatindex_c":36.7,"heatindex_f":98.1,"dewpoint_c":4.1,"dewpoint_f":39.4,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":10.5,"gust_kph":16.9,"uv":9},{"time_epoch":1625391000,"time":"2021-07-04 14:00","temp_c":38.8,"temp_f":101.8,"is_day":1,"condition":{"text":"Partly cloudy","icon":"//cdn.weatherapi.com/weather/64x64/day/116.png","code":1003},"wind_mph":8.5,"wind_kph":13.7,"wind_degree":143,"wind_dir":"SE","pressure_mb":1001,"pressure_in":30,"precip_mm":0,"precip_in":0,"humidity":12,"cloud":5,"feelslike_c":38.2,"feelslike_f":100.8,"windchill_c":38.8,"windchill_f":101.8,"heatindex_c":38.2,"heatindex_f":100.8,"dewpoint_c":4.3,"dewpoint_f":39.7,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":9.6,"gust_kph":15.5,"uv":9},{"time_epoch":1625394600,"time":"2021-07-04 15:00","temp_c":39.8,"temp_f":103.6,"is_day":1,"condition":{"text":"Sunny","icon":"//cdn.weatherapi.com/weather/64x64/day/113.png","code":1000},"wind_mph":7.8,"wind_kph":12.6,"wind_degree":143,"wind_dir":"SE","pressure_mb":1000,"pressure_in":30,"precip_mm":0,"precip_in":0,"humidity":11,"cloud":0,"feelslike_c":39.6,"feelslike_f":103.3,"windchill_c":39.8,"windchill_f":103.6,"heatindex_c":39.6,"heatindex_f":103.3,"dewpoint_c":4.4,"dewpoint_f":39.9,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":8.9,"gust_kph":14.4,"uv":9},{"time_epoch":1625398200,"time":"2021-07-04 16:00","temp_c":39.1,"temp_f":102.4,"is_day":1,"condition":{"text":"Sunny","icon":"//cdn.weatherapi.com/weather/64x64/day/113.png","code":1000},"wind_mph":6.9,"wind_kph":11.2,"wind_degree":143,"wind_dir":"SE","pressure_mb":1000,"pressure_in":30,"precip_mm":0,"precip_in":0,"humidity":11,"cloud":0,"feelslike_c":40.3,"feelslike_f":104.5,"windchill_c":39.1,"windchill_f":102.4,"heatindex_c":40.3,"heatindex_f":104.5,"dewpoint_c":4.3,"dewpoint_f":39.7,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":8.1,"gust_kph":13,"uv":9},{"time_epoch":1625401800,"time":"2021-07-04 17:00","temp_c":38.5,"temp_f":101.3,"is_day":1,"condition":{"text":"Sunny","icon":"//cdn.weatherapi.com/weather/64x64/day/113.png","code":1000},"wind_mph":6.3,"wind_kph":10.1,"wind_degree":144,"wind_dir":"SE","pressure_mb":1000,"pressure_in":30,"precip_mm":0,"precip_in":0,"humidity":11,"cloud":0,"feelslike_c":41.1,"feelslike_f":106,"windchill_c":38.5,"windchill_f":101.3,"heatindex_c":41.1,"heatindex_f":106,"dewpoint_c":4.3,"dewpoint_f":39.7,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":7.2,"gust_kph":11.5,"uv":9},{"time_epoch":1625405400,"time":"2021-07-04 18:00","temp_c":37.8,"temp_f":100,"is_day":1,"condition":{"text":"Sunny","icon":"//cdn.weatherapi.com/weather/64x64/day/113.png","code":1000},"wind_mph":5.4,"wind_kph":8.6,"wind_degree":145,"wind_dir":"SE","pressure_mb":1000,"pressure_in":30,"precip_mm":0,"precip_in":0,"humidity":10,"cloud":0,"feelslike_c":41.8,"feelslike_f":107.2,"windchill_c":37.8,"windchill_f":100,"heatindex_c":41.8,"heatindex_f":107.2,"dewpoint_c":4.2,"dewpoint_f":39.6,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":6.3,"gust_kph":10.1,"uv":9},{"time_epoch":1625409000,"time":"2021-07-04 19:00","temp_c":36.4,"temp_f":97.5,"is_day":1,"condition":{"text":"Partly cloudy","icon":"//cdn.weatherapi.com/weather/64x64/day/116.png","code":1003},"wind_mph":6.5,"wind_kph":10.4,"wind_degree":139,"wind_dir":"SE","pressure_mb":1000,"pressure_in":30,"precip_mm":0,"precip_in":0,"humidity":11,"cloud":2,"feelslike_c":38.4,"feelslike_f":101.1,"windchill_c":36.4,"windchill_f":97.5,"heatindex_c":38.4,"heatindex_f":101.1,"dewpoint_c":2.8,"dewpoint_f":37,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":8.9,"gust_kph":14.4,"uv":9},{"time_epoch":1625412600,"time":"2021-07-04 20:00","temp_c":35.1,"temp_f":95.2,"is_day":0,"condition":{"text":"Clear","icon":"//cdn.weatherapi.com/weather/64x64/night/113.png","code":1000},"wind_mph":7.6,"wind_kph":12.2,"wind_degree":133,"wind_dir":"SE","pressure_mb":1001,"pressure_in":30,"precip_mm":0,"precip_in":0,"humidity":11,"cloud":5,"feelslike_c":35,"feelslike_f":95,"windchill_c":35.1,"windchill_f":95.2,"heatindex_c":35,"heatindex_f":95,"dewpoint_c":1.4,"dewpoint_f":34.5,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":11.4,"gust_kph":18.4,"uv":1},{"time_epoch":1625416200,"time":"2021-07-04 21:00","temp_c":33.7,"temp_f":92.7,"is_day":0,"condition":{"text":"Partly cloudy","icon":"//cdn.weatherapi.com/weather/64x64/night/116.png","code":1003},"wind_mph":8.7,"wind_kph":14,"wind_degree":127,"wind_dir":"SE","pressure_mb":1001,"pressure_in":30,"precip_mm":0,"precip_in":0,"humidity":12,"cloud":7,"feelslike_c":31.6,"feelslike_f":88.9,"windchill_c":33.7,"windchill_f":92.7,"heatindex_c":31.6,"heatindex_f":88.9,"dewpoint_c":0,"dewpoint_f":32,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":14.1,"gust_kph":22.7,"uv":1},{"time_epoch":1625419800,"time":"2021-07-04 22:00","temp_c":33,"temp_f":91.4,"is_day":0,"condition":{"text":"Partly cloudy","icon":"//cdn.weatherapi.com/weather/64x64/night/116.png","code":1003},"wind_mph":7.8,"wind_kph":12.6,"wind_degree":135,"wind_dir":"SE","pressure_mb":1001,"pressure_in":30,"precip_mm":0,"precip_in":0,"humidity":13,"cloud":10,"feelslike_c":30.9,"feelslike_f":87.6,"windchill_c":33,"windchill_f":91.4,"heatindex_c":30.9,"heatindex_f":87.6,"dewpoint_c":0.5,"dewpoint_f":32.9,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":12.8,"gust_kph":20.5,"uv":1},{"time_epoch":1625423400,"time":"2021-07-04 23:00","temp_c":32.3,"temp_f":90.1,"is_day":0,"condition":{"text":"Partly cloudy","icon":"//cdn.weatherapi.com/weather/64x64/night/116.png","code":1003},"wind_mph":6.9,"wind_kph":11.2,"wind_degree":143,"wind_dir":"SE","pressure_mb":1002,"pressure_in":30,"precip_mm":0,"precip_in":0,"humidity":14,"cloud":13,"feelslike_c":30.1,"feelslike_f":86.2,"windchill_c":32.3,"windchill_f":90.1,"heatindex_c":30.1,"heatindex_f":86.2,"dewpoint_c":1,"dewpoint_f":33.8,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":11.2,"gust_kph":18,"uv":1}]}]}
     */

    private LocationBean location;
    private CurrentBean current;
    private ForecastBean forecast;

    @Bindable
    public LocationBean getLocation() {
        return location;
    }

    public void setLocation(LocationBean location) {
        this.location = location;
        notifyPropertyChanged(BR.location);
    }

    @Bindable
    public CurrentBean getCurrent() {
        return current;
    }

    public void setCurrent(CurrentBean current) {
        this.current = current;
        notifyPropertyChanged(BR.current);
    }

    @Bindable
    public ForecastBean getForecast() {
        return forecast;
    }

    public void setForecast(ForecastBean forecast) {
        this.forecast = forecast;
        notifyPropertyChanged(BR.forecast);
    }

    public static class LocationBean extends BaseObservable {
        /**
         * name : Tehran
         * region : Tehran
         * country : Iran
         * lat : 35.73
         * lon : 51.33
         * tz_id : Asia/Tehran
         * localtime_epoch : 1625217922
         * localtime : 2021-07-02 13:55
         */

        private String name;
        private String region;
        private String country;
        private double lat;
        private double lon;
        private String tz_id;
        private int localtime_epoch;
        private String localtime;

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
        public String getTz_id() {
            return tz_id;
        }

        public void setTz_id(String tz_id) {
            this.tz_id = tz_id;
            notifyPropertyChanged(BR.tz_id);
        }

        @Bindable
        public int getLocaltime_epoch() {
            return localtime_epoch;
        }

        public void setLocaltime_epoch(int localtime_epoch) {
            this.localtime_epoch = localtime_epoch;
            notifyPropertyChanged(BR.localtime_epoch);
        }

        @Bindable
        public String getLocaltime() {
            return localtime;
        }

        public void setLocaltime(String localtime) {
            this.localtime = localtime;
            notifyPropertyChanged(BR.localtime);
        }
    }

    public static class CurrentBean extends BaseObservable {
        /**
         * last_updated_epoch : 1625217300
         * last_updated : 2021-07-02 13:45
         * temp_c : 35.0
         * temp_f : 95.0
         * is_day : 1
         * condition : {"text":"Partly cloudy","icon":"//cdn.weatherapi.com/weather/64x64/day/116.png","code":1003}
         * wind_mph : 13.6
         * wind_kph : 22.0
         * wind_degree : 140
         * wind_dir : SE
         * pressure_mb : 1013.0
         * pressure_in : 30.4
         * precip_mm : 0.0
         * precip_in : 0.0
         * humidity : 12
         * cloud : 25
         * feelslike_c : 33.2
         * feelslike_f : 91.7
         * vis_km : 10.0
         * vis_miles : 6.0
         * uv : 8.0
         * gust_mph : 8.3
         * gust_kph : 13.3
         */

        private int last_updated_epoch;
        private String last_updated;
        private double temp_c;
        private double temp_f;
        private int is_day;
        private ConditionBean condition;
        private double wind_mph;
        private double wind_kph;
        private int wind_degree;
        private String wind_dir;
        private double pressure_mb;
        private double pressure_in;
        private double precip_mm;
        private double precip_in;
        private int humidity;
        private int cloud;
        private double feelslike_c;
        private double feelslike_f;
        private double vis_km;
        private double vis_miles;
        private double uv;
        private double gust_mph;
        private double gust_kph;

        @Bindable
        public int getLast_updated_epoch() {
            return last_updated_epoch;
        }

        public void setLast_updated_epoch(int last_updated_epoch) {
            this.last_updated_epoch = last_updated_epoch;
            notifyPropertyChanged(BR.last_updated_epoch);
        }

        @Bindable
        public String getLast_updated() {
            return last_updated;
        }

        public void setLast_updated(String last_updated) {
            this.last_updated = last_updated;
            notifyPropertyChanged(BR.last_updated);
        }

        @Bindable
        public double getTemp_c() {
            return temp_c;
        }

        public void setTemp_c(double temp_c) {
            this.temp_c = temp_c;
            notifyPropertyChanged(BR.temp_c);
        }

        @Bindable
        public double getTemp_f() {
            return temp_f;
        }

        public void setTemp_f(double temp_f) {
            this.temp_f = temp_f;
            notifyPropertyChanged(BR.temp_f);
        }

        @Bindable
        public int getIs_day() {
            return is_day;
        }

        public void setIs_day(int is_day) {
            this.is_day = is_day;
            notifyPropertyChanged(BR.is_day);
        }

        @Bindable
        public ConditionBean getCondition() {
            return condition;
        }

        public void setCondition(ConditionBean condition) {
            this.condition = condition;
            notifyPropertyChanged(BR.condition);
        }

        @Bindable
        public double getWind_mph() {
            return wind_mph;
        }

        public void setWind_mph(double wind_mph) {
            this.wind_mph = wind_mph;
            notifyPropertyChanged(BR.wind_mph);
        }

        @Bindable
        public double getWind_kph() {
            return wind_kph;
        }

        public void setWind_kph(double wind_kph) {
            this.wind_kph = wind_kph;
            notifyPropertyChanged(BR.wind_kph);
        }

        @Bindable
        public int getWind_degree() {
            return wind_degree;
        }

        public void setWind_degree(int wind_degree) {
            this.wind_degree = wind_degree;
            notifyPropertyChanged(BR.wind_degree);
        }

        @Bindable
        public String getWind_dir() {
            return wind_dir;
        }

        public void setWind_dir(String wind_dir) {
            this.wind_dir = wind_dir;
            notifyPropertyChanged(BR.wind_dir);
        }

        @Bindable
        public double getPressure_mb() {
            return pressure_mb;
        }

        public void setPressure_mb(double pressure_mb) {
            this.pressure_mb = pressure_mb;
            notifyPropertyChanged(BR.pressure_mb);
        }

        @Bindable
        public double getPressure_in() {
            return pressure_in;
        }

        public void setPressure_in(double pressure_in) {
            this.pressure_in = pressure_in;
            notifyPropertyChanged(BR.pressure_in);
        }

        @Bindable
        public double getPrecip_mm() {
            return precip_mm;
        }

        public void setPrecip_mm(double precip_mm) {
            this.precip_mm = precip_mm;
            notifyPropertyChanged(BR.precip_mm);
        }

        @Bindable
        public double getPrecip_in() {
            return precip_in;
        }

        public void setPrecip_in(double precip_in) {
            this.precip_in = precip_in;
            notifyPropertyChanged(BR.precip_in);
        }

        @Bindable
        public int getHumidity() {
            return humidity;
        }

        public void setHumidity(int humidity) {
            this.humidity = humidity;
            notifyPropertyChanged(BR.humidity);
        }

        @Bindable
        public int getCloud() {
            return cloud;
        }

        public void setCloud(int cloud) {
            this.cloud = cloud;
            notifyPropertyChanged(BR.cloud);
        }

        @Bindable
        public double getFeelslike_c() {
            return feelslike_c;
        }

        public void setFeelslike_c(double feelslike_c) {
            this.feelslike_c = feelslike_c;
            notifyPropertyChanged(BR.feelslike_c);
        }

        @Bindable
        public double getFeelslike_f() {
            return feelslike_f;
        }

        public void setFeelslike_f(double feelslike_f) {
            this.feelslike_f = feelslike_f;
            notifyPropertyChanged(BR.feelslike_f);
        }

        @Bindable
        public double getVis_km() {
            return vis_km;
        }

        public void setVis_km(double vis_km) {
            this.vis_km = vis_km;
            notifyPropertyChanged(BR.vis_km);
        }

        @Bindable
        public double getVis_miles() {
            return vis_miles;
        }

        public void setVis_miles(double vis_miles) {
            this.vis_miles = vis_miles;
            notifyPropertyChanged(BR.vis_miles);
        }

        @Bindable
        public double getUv() {
            return uv;
        }

        public void setUv(double uv) {
            this.uv = uv;
            notifyPropertyChanged(BR.uv);
        }

        @Bindable
        public double getGust_mph() {
            return gust_mph;
        }

        public void setGust_mph(double gust_mph) {
            this.gust_mph = gust_mph;
            notifyPropertyChanged(BR.gust_mph);
        }

        @Bindable
        public double getGust_kph() {
            return gust_kph;
        }

        public void setGust_kph(double gust_kph) {
            this.gust_kph = gust_kph;
            notifyPropertyChanged(BR.gust_kph);
        }

        public static class ConditionBean extends BaseObservable {
            /**
             * text : Partly cloudy
             * icon : //cdn.weatherapi.com/weather/64x64/day/116.png
             * code : 1003
             */

            private String text;
            private String icon;
            private int code;

            @Bindable
            public String getText() {
                return text;
            }

            public void setText(String text) {
                this.text = text;
                notifyPropertyChanged(BR.text);
            }

            @Bindable
            public String getIcon() {
                if (icon.startsWith("//")){
                    icon = icon.substring(2);
                    icon = "http://" + icon;
                }
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
                notifyPropertyChanged(BR.icon);
            }

            @Bindable
            public int getCode() {
                return code;
            }

            public void setCode(int code) {
                this.code = code;
                notifyPropertyChanged(BR.code);
            }
        }
    }

    public static class ForecastBean extends BaseObservable {
        private List<ForecastdayBean> forecastday;

        @Bindable
        public List<ForecastdayBean> getForecastday() {
            return forecastday;
        }

        public void setForecastday(List<ForecastdayBean> forecastday) {
            this.forecastday = forecastday;
            notifyPropertyChanged(BR.forecastday);
        }

        public static class ForecastdayBean extends BaseObservable {
            /**
             * date : 2021-07-02
             * date_epoch : 1625184000
             * day : {"maxtemp_c":38.1,"maxtemp_f":100.6,"mintemp_c":27,"mintemp_f":80.6,"avgtemp_c":32.9,"avgtemp_f":91.2,"maxwind_mph":8.9,"maxwind_kph":14.4,"totalprecip_mm":0,"totalprecip_in":0,"avgvis_km":10,"avgvis_miles":6,"avghumidity":16,"daily_will_it_rain":0,"daily_chance_of_rain":"0","daily_will_it_snow":0,"daily_chance_of_snow":"0","condition":{"text":"Partly cloudy","icon":"//cdn.weatherapi.com/weather/64x64/day/116.png","code":1003},"uv":11}
             * astro : {"sunrise":"05:53 AM","sunset":"08:24 PM","moonrise":"01:09 AM","moonset":"01:35 PM","moon_phase":"Waning Crescent","moon_illumination":"34"}
             * hour : [{"time_epoch":1625167800,"time":"2021-07-02 00:00","temp_c":29.5,"temp_f":85.1,"is_day":0,"condition":{"text":"Partly cloudy","icon":"//cdn.weatherapi.com/weather/64x64/night/116.png","code":1003},"wind_mph":3.6,"wind_kph":5.8,"wind_degree":52,"wind_dir":"NE","pressure_mb":1009,"pressure_in":30.3,"precip_mm":0,"precip_in":0,"humidity":19,"cloud":24,"feelslike_c":27.3,"feelslike_f":81.1,"windchill_c":29.5,"windchill_f":85.1,"heatindex_c":27.3,"heatindex_f":81.1,"dewpoint_c":3.6,"dewpoint_f":38.5,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":5.1,"gust_kph":8.3,"uv":1},{"time_epoch":1625171400,"time":"2021-07-02 01:00","temp_c":28.7,"temp_f":83.7,"is_day":0,"condition":{"text":"Partly cloudy","icon":"//cdn.weatherapi.com/weather/64x64/night/116.png","code":1003},"wind_mph":5.4,"wind_kph":8.6,"wind_degree":57,"wind_dir":"ENE","pressure_mb":1009,"pressure_in":30.3,"precip_mm":0,"precip_in":0,"humidity":20,"cloud":19,"feelslike_c":26.6,"feelslike_f":79.9,"windchill_c":28.7,"windchill_f":83.7,"heatindex_c":26.6,"heatindex_f":79.9,"dewpoint_c":3.3,"dewpoint_f":37.9,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":8.3,"gust_kph":13.3,"uv":1},{"time_epoch":1625175000,"time":"2021-07-02 02:00","temp_c":27.8,"temp_f":82,"is_day":0,"condition":{"text":"Partly cloudy","icon":"//cdn.weatherapi.com/weather/64x64/night/116.png","code":1003},"wind_mph":7.2,"wind_kph":11.5,"wind_degree":62,"wind_dir":"ENE","pressure_mb":1009,"pressure_in":30.3,"precip_mm":0,"precip_in":0,"humidity":20,"cloud":14,"feelslike_c":26,"feelslike_f":78.8,"windchill_c":27.8,"windchill_f":82,"heatindex_c":26,"heatindex_f":78.8,"dewpoint_c":3.1,"dewpoint_f":37.6,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":11.4,"gust_kph":18.4,"uv":1},{"time_epoch":1625178600,"time":"2021-07-02 03:00","temp_c":27,"temp_f":80.6,"is_day":0,"condition":{"text":"Partly cloudy","icon":"//cdn.weatherapi.com/weather/64x64/night/116.png","code":1003},"wind_mph":8.9,"wind_kph":14.4,"wind_degree":67,"wind_dir":"ENE","pressure_mb":1009,"pressure_in":30.3,"precip_mm":0,"precip_in":0,"humidity":21,"cloud":9,"feelslike_c":25.3,"feelslike_f":77.5,"windchill_c":27,"windchill_f":80.6,"heatindex_c":25.3,"heatindex_f":77.5,"dewpoint_c":2.8,"dewpoint_f":37,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":14.5,"gust_kph":23.4,"uv":1},{"time_epoch":1625182200,"time":"2021-07-02 04:00","temp_c":28.8,"temp_f":83.8,"is_day":0,"condition":{"text":"Clear","icon":"//cdn.weatherapi.com/weather/64x64/night/113.png","code":1000},"wind_mph":7.4,"wind_kph":11.9,"wind_degree":105,"wind_dir":"ESE","pressure_mb":1009,"pressure_in":30.3,"precip_mm":0,"precip_in":0,"humidity":21,"cloud":6,"feelslike_c":26.9,"feelslike_f":80.4,"windchill_c":28.8,"windchill_f":83.8,"heatindex_c":26.9,"heatindex_f":80.4,"dewpoint_c":4.2,"dewpoint_f":39.6,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":11.4,"gust_kph":18.4,"uv":1},{"time_epoch":1625185800,"time":"2021-07-02 05:00","temp_c":30.5,"temp_f":86.9,"is_day":0,"condition":{"text":"Partly cloudy","icon":"//cdn.weatherapi.com/weather/64x64/night/116.png","code":1003},"wind_mph":5.8,"wind_kph":9.4,"wind_degree":142,"wind_dir":"SE","pressure_mb":1010,"pressure_in":30.3,"precip_mm":0,"precip_in":0,"humidity":21,"cloud":3,"feelslike_c":28.6,"feelslike_f":83.5,"windchill_c":30.5,"windchill_f":86.9,"heatindex_c":28.6,"heatindex_f":83.5,"dewpoint_c":5.6,"dewpoint_f":42.1,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":8.1,"gust_kph":13,"uv":1},{"time_epoch":1625189400,"time":"2021-07-02 06:00","temp_c":32.3,"temp_f":90.1,"is_day":1,"condition":{"text":"Sunny","icon":"//cdn.weatherapi.com/weather/64x64/day/113.png","code":1000},"wind_mph":4.3,"wind_kph":6.8,"wind_degree":180,"wind_dir":"S","pressure_mb":1010,"pressure_in":30.3,"precip_mm":0,"precip_in":0,"humidity":21,"cloud":0,"feelslike_c":30.2,"feelslike_f":86.4,"windchill_c":32.3,"windchill_f":90.1,"heatindex_c":30.2,"heatindex_f":86.4,"dewpoint_c":7,"dewpoint_f":44.6,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":4.9,"gust_kph":7.9,"uv":8},{"time_epoch":1625193000,"time":"2021-07-02 07:00","temp_c":32.6,"temp_f":90.7,"is_day":1,"condition":{"text":"Sunny","icon":"//cdn.weatherapi.com/weather/64x64/day/113.png","code":1000},"wind_mph":4.9,"wind_kph":7.9,"wind_degree":178,"wind_dir":"S","pressure_mb":1010,"pressure_in":30.3,"precip_mm":0,"precip_in":0,"humidity":20,"cloud":0,"feelslike_c":30.5,"feelslike_f":86.9,"windchill_c":32.6,"windchill_f":90.7,"heatindex_c":30.5,"heatindex_f":86.9,"dewpoint_c":6.9,"dewpoint_f":44.4,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":5.6,"gust_kph":9,"uv":8},{"time_epoch":1625196600,"time":"2021-07-02 08:00","temp_c":32.8,"temp_f":91,"is_day":1,"condition":{"text":"Sunny","icon":"//cdn.weatherapi.com/weather/64x64/day/113.png","code":1000},"wind_mph":5.6,"wind_kph":9,"wind_degree":175,"wind_dir":"S","pressure_mb":1010,"pressure_in":30.3,"precip_mm":0,"precip_in":0,"humidity":20,"cloud":0,"feelslike_c":30.7,"feelslike_f":87.3,"windchill_c":32.8,"windchill_f":91,"heatindex_c":30.7,"heatindex_f":87.3,"dewpoint_c":6.9,"dewpoint_f":44.4,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":6.5,"gust_kph":10.4,"uv":8},{"time_epoch":1625200200,"time":"2021-07-02 09:00","temp_c":33.1,"temp_f":91.6,"is_day":1,"condition":{"text":"Sunny","icon":"//cdn.weatherapi.com/weather/64x64/day/113.png","code":1000},"wind_mph":6.3,"wind_kph":10.1,"wind_degree":173,"wind_dir":"S","pressure_mb":1010,"pressure_in":30.3,"precip_mm":0,"precip_in":0,"humidity":20,"cloud":0,"feelslike_c":31,"feelslike_f":87.8,"windchill_c":33.1,"windchill_f":91.6,"heatindex_c":31,"heatindex_f":87.8,"dewpoint_c":6.8,"dewpoint_f":44.2,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":7.2,"gust_kph":11.5,"uv":8},{"time_epoch":1625203800,"time":"2021-07-02 10:00","temp_c":33.7,"temp_f":92.7,"is_day":1,"condition":{"text":"Sunny","icon":"//cdn.weatherapi.com/weather/64x64/day/113.png","code":1000},"wind_mph":7.2,"wind_kph":11.5,"wind_degree":167,"wind_dir":"SSE","pressure_mb":1009,"pressure_in":30.3,"precip_mm":0,"precip_in":0,"humidity":18,"cloud":0,"feelslike_c":31.7,"feelslike_f":89.1,"windchill_c":33.7,"windchill_f":92.7,"heatindex_c":31.7,"heatindex_f":89.1,"dewpoint_c":6.2,"dewpoint_f":43.2,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":8.3,"gust_kph":13.3,"uv":8},{"time_epoch":1625207400,"time":"2021-07-02 11:00","temp_c":34.3,"temp_f":93.7,"is_day":1,"condition":{"text":"Sunny","icon":"//cdn.weatherapi.com/weather/64x64/day/113.png","code":1000},"wind_mph":8.1,"wind_kph":13,"wind_degree":161,"wind_dir":"SSE","pressure_mb":1009,"pressure_in":30.3,"precip_mm":0,"precip_in":0,"humidity":17,"cloud":0,"feelslike_c":32.4,"feelslike_f":90.3,"windchill_c":34.3,"windchill_f":93.7,"heatindex_c":32.4,"heatindex_f":90.3,"dewpoint_c":5.6,"dewpoint_f":42.1,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":9.2,"gust_kph":14.8,"uv":8},{"time_epoch":1625211000,"time":"2021-07-02 12:00","temp_c":34.9,"temp_f":94.8,"is_day":1,"condition":{"text":"Sunny","icon":"//cdn.weatherapi.com/weather/64x64/day/113.png","code":1000},"wind_mph":8.9,"wind_kph":14.4,"wind_degree":155,"wind_dir":"SSE","pressure_mb":1008,"pressure_in":30.2,"precip_mm":0,"precip_in":0,"humidity":16,"cloud":0,"feelslike_c":33.1,"feelslike_f":91.6,"windchill_c":34.9,"windchill_f":94.8,"heatindex_c":33.1,"heatindex_f":91.6,"dewpoint_c":5,"dewpoint_f":41,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":10.3,"gust_kph":16.6,"uv":8},{"time_epoch":1625214600,"time":"2021-07-02 13:00","temp_c":36,"temp_f":96.8,"is_day":1,"condition":{"text":"Sunny","icon":"//cdn.weatherapi.com/weather/64x64/day/113.png","code":1000},"wind_mph":7.8,"wind_kph":12.6,"wind_degree":165,"wind_dir":"SSE","pressure_mb":1007,"pressure_in":30.2,"precip_mm":0,"precip_in":0,"humidity":15,"cloud":0,"feelslike_c":34.5,"feelslike_f":94.1,"windchill_c":36,"windchill_f":96.8,"heatindex_c":34.5,"heatindex_f":94.1,"dewpoint_c":4.7,"dewpoint_f":40.5,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":8.9,"gust_kph":14.4,"uv":9},{"time_epoch":1625218200,"time":"2021-07-02 14:00","temp_c":37,"temp_f":98.6,"is_day":1,"condition":{"text":"Sunny","icon":"//cdn.weatherapi.com/weather/64x64/day/113.png","code":1000},"wind_mph":6.5,"wind_kph":10.4,"wind_degree":174,"wind_dir":"S","pressure_mb":1006,"pressure_in":30.2,"precip_mm":0,"precip_in":0,"humidity":13,"cloud":0,"feelslike_c":35.8,"feelslike_f":96.4,"windchill_c":37,"windchill_f":98.6,"heatindex_c":35.8,"heatindex_f":96.4,"dewpoint_c":4.4,"dewpoint_f":39.9,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":7.6,"gust_kph":12.2,"uv":9},{"time_epoch":1625221800,"time":"2021-07-02 15:00","temp_c":38.1,"temp_f":100.6,"is_day":1,"condition":{"text":"Sunny","icon":"//cdn.weatherapi.com/weather/64x64/day/113.png","code":1000},"wind_mph":5.4,"wind_kph":8.6,"wind_degree":184,"wind_dir":"S","pressure_mb":1005,"pressure_in":30.2,"precip_mm":0,"precip_in":0,"humidity":12,"cloud":0,"feelslike_c":37.2,"feelslike_f":99,"windchill_c":38.1,"windchill_f":100.6,"heatindex_c":37.2,"heatindex_f":99,"dewpoint_c":4.1,"dewpoint_f":39.4,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":6.3,"gust_kph":10.1,"uv":9},{"time_epoch":1625225400,"time":"2021-07-02 16:00","temp_c":37.5,"temp_f":99.5,"is_day":1,"condition":{"text":"Partly cloudy","icon":"//cdn.weatherapi.com/weather/64x64/day/116.png","code":1003},"wind_mph":5.6,"wind_kph":9,"wind_degree":154,"wind_dir":"SSE","pressure_mb":1005,"pressure_in":30.2,"precip_mm":0,"precip_in":0,"humidity":12,"cloud":2,"feelslike_c":36.4,"feelslike_f":97.5,"windchill_c":37.5,"windchill_f":99.5,"heatindex_c":36.4,"heatindex_f":97.5,"dewpoint_c":3,"dewpoint_f":37.4,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":6.5,"gust_kph":10.4,"uv":9},{"time_epoch":1625229000,"time":"2021-07-02 17:00","temp_c":37,"temp_f":98.6,"is_day":1,"condition":{"text":"Sunny","icon":"//cdn.weatherapi.com/weather/64x64/day/113.png","code":1000},"wind_mph":5.6,"wind_kph":9,"wind_degree":123,"wind_dir":"ESE","pressure_mb":1005,"pressure_in":30.1,"precip_mm":0,"precip_in":0,"humidity":11,"cloud":4,"feelslike_c":35.7,"feelslike_f":96.3,"windchill_c":37,"windchill_f":98.6,"heatindex_c":35.7,"heatindex_f":96.3,"dewpoint_c":1.9,"dewpoint_f":35.4,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":6.5,"gust_kph":10.4,"uv":9},{"time_epoch":1625232600,"time":"2021-07-02 18:00","temp_c":36.4,"temp_f":97.5,"is_day":1,"condition":{"text":"Partly cloudy","icon":"//cdn.weatherapi.com/weather/64x64/day/116.png","code":1003},"wind_mph":5.8,"wind_kph":9.4,"wind_degree":92,"wind_dir":"E","pressure_mb":1004,"pressure_in":30.1,"precip_mm":0,"precip_in":0,"humidity":11,"cloud":7,"feelslike_c":34.9,"feelslike_f":94.8,"windchill_c":36.4,"windchill_f":97.5,"heatindex_c":34.9,"heatindex_f":94.8,"dewpoint_c":0.8,"dewpoint_f":33.4,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":6.7,"gust_kph":10.8,"uv":9},{"time_epoch":1625236200,"time":"2021-07-02 19:00","temp_c":34.8,"temp_f":94.6,"is_day":1,"condition":{"text":"Partly cloudy","icon":"//cdn.weatherapi.com/weather/64x64/day/116.png","code":1003},"wind_mph":6.5,"wind_kph":10.4,"wind_degree":86,"wind_dir":"E","pressure_mb":1004,"pressure_in":30.1,"precip_mm":0,"precip_in":0,"humidity":11,"cloud":8,"feelslike_c":33.1,"feelslike_f":91.6,"windchill_c":34.8,"windchill_f":94.6,"heatindex_c":33.1,"heatindex_f":91.6,"dewpoint_c":0,"dewpoint_f":32,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":8.7,"gust_kph":14,"uv":8},{"time_epoch":1625239800,"time":"2021-07-02 20:00","temp_c":33.2,"temp_f":91.8,"is_day":0,"condition":{"text":"Partly cloudy","icon":"//cdn.weatherapi.com/weather/64x64/night/116.png","code":1003},"wind_mph":7.2,"wind_kph":11.5,"wind_degree":79,"wind_dir":"E","pressure_mb":1005,"pressure_in":30.1,"precip_mm":0,"precip_in":0,"humidity":11,"cloud":9,"feelslike_c":31.2,"feelslike_f":88.2,"windchill_c":33.2,"windchill_f":91.8,"heatindex_c":31.2,"heatindex_f":88.2,"dewpoint_c":-0.9,"dewpoint_f":30.4,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":10.5,"gust_kph":16.9,"uv":1},{"time_epoch":1625243400,"time":"2021-07-02 21:00","temp_c":31.6,"temp_f":88.9,"is_day":0,"condition":{"text":"Partly cloudy","icon":"//cdn.weatherapi.com/weather/64x64/night/116.png","code":1003},"wind_mph":7.8,"wind_kph":12.6,"wind_degree":73,"wind_dir":"ENE","pressure_mb":1005,"pressure_in":30.1,"precip_mm":0,"precip_in":0,"humidity":12,"cloud":10,"feelslike_c":29.4,"feelslike_f":84.9,"windchill_c":31.6,"windchill_f":88.9,"heatindex_c":29.4,"heatindex_f":84.9,"dewpoint_c":-1.7,"dewpoint_f":28.9,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":12.5,"gust_kph":20.2,"uv":1},{"time_epoch":1625247000,"time":"2021-07-02 22:00","temp_c":31,"temp_f":87.8,"is_day":0,"condition":{"text":"Partly cloudy","icon":"//cdn.weatherapi.com/weather/64x64/night/116.png","code":1003},"wind_mph":6.9,"wind_kph":11.2,"wind_degree":98,"wind_dir":"E","pressure_mb":1005,"pressure_in":30.1,"precip_mm":0,"precip_in":0,"humidity":13,"cloud":15,"feelslike_c":28.8,"feelslike_f":83.8,"windchill_c":31,"windchill_f":87.8,"heatindex_c":28.8,"heatindex_f":83.8,"dewpoint_c":-0.8,"dewpoint_f":30.6,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":11,"gust_kph":17.6,"uv":1},{"time_epoch":1625250600,"time":"2021-07-02 23:00","temp_c":30.4,"temp_f":86.7,"is_day":0,"condition":{"text":"Partly cloudy","icon":"//cdn.weatherapi.com/weather/64x64/night/116.png","code":1003},"wind_mph":5.8,"wind_kph":9.4,"wind_degree":123,"wind_dir":"ESE","pressure_mb":1005,"pressure_in":30.1,"precip_mm":0,"precip_in":0,"humidity":14,"cloud":20,"feelslike_c":28.2,"feelslike_f":82.8,"windchill_c":30.4,"windchill_f":86.7,"heatindex_c":28.2,"heatindex_f":82.8,"dewpoint_c":0,"dewpoint_f":32,"will_it_rain":0,"chance_of_rain":"0","will_it_snow":0,"chance_of_snow":"0","vis_km":10,"vis_miles":6,"gust_mph":9.4,"gust_kph":15.1,"uv":1}]
             */

            private String date;
            private int date_epoch;
            private DayBean day;
            private AstroBean astro;
            private List<HourBean> hour;

            @Bindable
            public String getDate() {
                return DateUtils.dayName(date);
            }

            public void setDate(String date) {
                this.date = date;
                notifyPropertyChanged(BR.date);
            }

            @Bindable
            public int getDate_epoch() {
                return date_epoch;
            }

            public void setDate_epoch(int date_epoch) {
                this.date_epoch = date_epoch;
                notifyPropertyChanged(BR.date_epoch);
            }

            @Bindable
            public DayBean getDay() {
                return day;
            }

            public void setDay(DayBean day) {
                this.day = day;
                notifyPropertyChanged(BR.day);
            }

            @Bindable
            public AstroBean getAstro() {
                return astro;
            }

            public void setAstro(AstroBean astro) {
                this.astro = astro;
                notifyPropertyChanged(BR.astro);
            }

            @Bindable
            public List<HourBean> getHour() {
                return hour;
            }

            public void setHour(List<HourBean> hour) {
                this.hour = hour;
                notifyPropertyChanged(BR.hour);
            }

            public static class DayBean extends BaseObservable {
                /**
                 * maxtemp_c : 38.1
                 * maxtemp_f : 100.6
                 * mintemp_c : 27.0
                 * mintemp_f : 80.6
                 * avgtemp_c : 32.9
                 * avgtemp_f : 91.2
                 * maxwind_mph : 8.9
                 * maxwind_kph : 14.4
                 * totalprecip_mm : 0.0
                 * totalprecip_in : 0.0
                 * avgvis_km : 10.0
                 * avgvis_miles : 6.0
                 * avghumidity : 16.0
                 * daily_will_it_rain : 0
                 * daily_chance_of_rain : 0
                 * daily_will_it_snow : 0
                 * daily_chance_of_snow : 0
                 * condition : {"text":"Partly cloudy","icon":"//cdn.weatherapi.com/weather/64x64/day/116.png","code":1003}
                 * uv : 11.0
                 */

                private double maxtemp_c;
                private double maxtemp_f;
                private double mintemp_c;
                private double mintemp_f;
                private double avgtemp_c;
                private double avgtemp_f;
                private double maxwind_mph;
                private double maxwind_kph;
                private double totalprecip_mm;
                private double totalprecip_in;
                private double avgvis_km;
                private double avgvis_miles;
                private double avghumidity;
                private int daily_will_it_rain;
                private String daily_chance_of_rain;
                private int daily_will_it_snow;
                private String daily_chance_of_snow;
                private ConditionBeanX condition;
                private double uv;

                @Bindable
                public String getMaxtemp_c() {
                    return ""+maxtemp_c+"°";
                }

                public void setMaxtemp_c(double maxtemp_c) {
                    this.maxtemp_c = maxtemp_c;
                    notifyPropertyChanged(BR.maxtemp_c);
                }

                @Bindable
                public double getMaxtemp_f() {
                    return maxtemp_f;
                }

                public void setMaxtemp_f(double maxtemp_f) {
                    this.maxtemp_f = maxtemp_f;
                    notifyPropertyChanged(BR.maxtemp_f);
                }

                @Bindable
                public String getMintemp_c() {
                    return ""+mintemp_c+"°";
                }

                public void setMintemp_c(double mintemp_c) {
                    this.mintemp_c = mintemp_c;
                    notifyPropertyChanged(BR.mintemp_c);
                }

                @Bindable
                public double getMintemp_f() {
                    return mintemp_f;
                }

                public void setMintemp_f(double mintemp_f) {
                    this.mintemp_f = mintemp_f;
                    notifyPropertyChanged(BR.mintemp_f);
                }

                @Bindable
                public double getAvgtemp_c() {
                    return avgtemp_c;
                }

                public void setAvgtemp_c(double avgtemp_c) {
                    this.avgtemp_c = avgtemp_c;
                    notifyPropertyChanged(BR.avgtemp_c);
                }

                @Bindable
                public double getAvgtemp_f() {
                    return avgtemp_f;
                }

                public void setAvgtemp_f(double avgtemp_f) {
                    this.avgtemp_f = avgtemp_f;
                    notifyPropertyChanged(BR.avgtemp_f);
                }

                @Bindable
                public double getMaxwind_mph() {
                    return maxwind_mph;
                }

                public void setMaxwind_mph(double maxwind_mph) {
                    this.maxwind_mph = maxwind_mph;
                    notifyPropertyChanged(BR.maxwind_mph);
                }

                @Bindable
                public double getMaxwind_kph() {
                    return maxwind_kph;
                }

                public void setMaxwind_kph(double maxwind_kph) {
                    this.maxwind_kph = maxwind_kph;
                    notifyPropertyChanged(BR.maxwind_kph);
                }

                @Bindable
                public double getTotalprecip_mm() {
                    return totalprecip_mm;
                }

                public void setTotalprecip_mm(double totalprecip_mm) {
                    this.totalprecip_mm = totalprecip_mm;
                    notifyPropertyChanged(BR.totalprecip_mm);
                }

                @Bindable
                public double getTotalprecip_in() {
                    return totalprecip_in;
                }

                public void setTotalprecip_in(double totalprecip_in) {
                    this.totalprecip_in = totalprecip_in;
                    notifyPropertyChanged(BR.totalprecip_in);
                }

                @Bindable
                public double getAvgvis_km() {
                    return avgvis_km;
                }

                public void setAvgvis_km(double avgvis_km) {
                    this.avgvis_km = avgvis_km;
                    notifyPropertyChanged(BR.avgvis_km);
                }

                @Bindable
                public double getAvgvis_miles() {
                    return avgvis_miles;
                }

                public void setAvgvis_miles(double avgvis_miles) {
                    this.avgvis_miles = avgvis_miles;
                    notifyPropertyChanged(BR.avgvis_miles);
                }

                @Bindable
                public double getAvghumidity() {
                    return avghumidity;
                }

                public void setAvghumidity(double avghumidity) {
                    this.avghumidity = avghumidity;
                    notifyPropertyChanged(BR.avghumidity);
                }

                @Bindable
                public int getDaily_will_it_rain() {
                    return daily_will_it_rain;
                }

                public void setDaily_will_it_rain(int daily_will_it_rain) {
                    this.daily_will_it_rain = daily_will_it_rain;
                    notifyPropertyChanged(BR.daily_will_it_rain);
                }

                @Bindable
                public String getDaily_chance_of_rain() {
                    return daily_chance_of_rain;
                }

                public void setDaily_chance_of_rain(String daily_chance_of_rain) {
                    this.daily_chance_of_rain = daily_chance_of_rain;
                    notifyPropertyChanged(BR.daily_chance_of_rain);
                }

                @Bindable
                public int getDaily_will_it_snow() {
                    return daily_will_it_snow;
                }

                public void setDaily_will_it_snow(int daily_will_it_snow) {
                    this.daily_will_it_snow = daily_will_it_snow;
                    notifyPropertyChanged(BR.daily_will_it_snow);
                }

                @Bindable
                public String getDaily_chance_of_snow() {
                    return daily_chance_of_snow;
                }

                public void setDaily_chance_of_snow(String daily_chance_of_snow) {
                    this.daily_chance_of_snow = daily_chance_of_snow;
                    notifyPropertyChanged(BR.daily_chance_of_snow);
                }

                @Bindable
                public ConditionBeanX getCondition() {
                    return condition;
                }

                public void setCondition(ConditionBeanX condition) {
                    this.condition = condition;
                    notifyPropertyChanged(BR.condition);
                }

                @Bindable
                public double getUv() {
                    return uv;
                }

                public void setUv(double uv) {
                    this.uv = uv;
                    notifyPropertyChanged(BR.uv);
                }

                public static class ConditionBeanX extends BaseObservable {
                    /**
                     * text : Partly cloudy
                     * icon : //cdn.weatherapi.com/weather/64x64/day/116.png
                     * code : 1003
                     */

                    private String text;
                    private String icon;
                    private int code;

                    @Bindable
                    public String getText() {
                        return text;
                    }

                    public void setText(String text) {
                        this.text = text;
                        notifyPropertyChanged(BR.text);
                    }

                    @Bindable
                    public String getIcon() {
                        if (icon.startsWith("//")){
                            icon = icon.substring(2);
                            icon = "http://" + icon;
                        }
                        return icon;
                    }

                    public void setIcon(String icon) {
                        this.icon = icon;
                        notifyPropertyChanged(BR.icon);
                    }

                    @Bindable
                    public int getCode() {
                        return code;
                    }

                    public void setCode(int code) {
                        this.code = code;
                        notifyPropertyChanged(BR.code);
                    }
                }
            }

            public static class AstroBean extends BaseObservable {
                /**
                 * sunrise : 05:53 AM
                 * sunset : 08:24 PM
                 * moonrise : 01:09 AM
                 * moonset : 01:35 PM
                 * moon_phase : Waning Crescent
                 * moon_illumination : 34
                 */

                private String sunrise;
                private String sunset;
                private String moonrise;
                private String moonset;
                private String moon_phase;
                private String moon_illumination;

                @Bindable
                public String getSunrise() {
                    return sunrise;
                }

                public void setSunrise(String sunrise) {
                    this.sunrise = sunrise;
                    notifyPropertyChanged(BR.sunrise);
                }

                @Bindable
                public String getSunset() {
                    return sunset;
                }

                public void setSunset(String sunset) {
                    this.sunset = sunset;
                    notifyPropertyChanged(BR.sunset);
                }

                @Bindable
                public String getMoonrise() {
                    return moonrise;
                }

                public void setMoonrise(String moonrise) {
                    this.moonrise = moonrise;
                    notifyPropertyChanged(BR.moonrise);
                }

                @Bindable
                public String getMoonset() {
                    return moonset;
                }

                public void setMoonset(String moonset) {
                    this.moonset = moonset;
                    notifyPropertyChanged(BR.moonset);
                }

                @Bindable
                public String getMoon_phase() {
                    return moon_phase;
                }

                public void setMoon_phase(String moon_phase) {
                    this.moon_phase = moon_phase;
                    notifyPropertyChanged(BR.moon_phase);
                }

                @Bindable
                public String getMoon_illumination() {
                    return moon_illumination;
                }

                public void setMoon_illumination(String moon_illumination) {
                    this.moon_illumination = moon_illumination;
                    notifyPropertyChanged(BR.moon_illumination);
                }
            }

            public static class HourBean extends BaseObservable {
                /**
                 * time_epoch : 1625167800
                 * time : 2021-07-02 00:00
                 * temp_c : 29.5
                 * temp_f : 85.1
                 * is_day : 0
                 * condition : {"text":"Partly cloudy","icon":"//cdn.weatherapi.com/weather/64x64/night/116.png","code":1003}
                 * wind_mph : 3.6
                 * wind_kph : 5.8
                 * wind_degree : 52
                 * wind_dir : NE
                 * pressure_mb : 1009.0
                 * pressure_in : 30.3
                 * precip_mm : 0.0
                 * precip_in : 0.0
                 * humidity : 19
                 * cloud : 24
                 * feelslike_c : 27.3
                 * feelslike_f : 81.1
                 * windchill_c : 29.5
                 * windchill_f : 85.1
                 * heatindex_c : 27.3
                 * heatindex_f : 81.1
                 * dewpoint_c : 3.6
                 * dewpoint_f : 38.5
                 * will_it_rain : 0
                 * chance_of_rain : 0
                 * will_it_snow : 0
                 * chance_of_snow : 0
                 * vis_km : 10.0
                 * vis_miles : 6.0
                 * gust_mph : 5.1
                 * gust_kph : 8.3
                 * uv : 1.0
                 */

                private int time_epoch;
                private String time;
                private double temp_c;
                private double temp_f;
                private int is_day;
                private ConditionBeanXX condition;
                private double wind_mph;
                private double wind_kph;
                private int wind_degree;
                private String wind_dir;
                private double pressure_mb;
                private double pressure_in;
                private double precip_mm;
                private double precip_in;
                private int humidity;
                private int cloud;
                private double feelslike_c;
                private double feelslike_f;
                private double windchill_c;
                private double windchill_f;
                private double heatindex_c;
                private double heatindex_f;
                private double dewpoint_c;
                private double dewpoint_f;
                private int will_it_rain;
                private String chance_of_rain;
                private int will_it_snow;
                private String chance_of_snow;
                private double vis_km;
                private double vis_miles;
                private double gust_mph;
                private double gust_kph;
                private double uv;

                @Bindable
                public int getTime_epoch() {
                    return time_epoch;
                }

                public void setTime_epoch(int time_epoch) {
                    this.time_epoch = time_epoch;
                    notifyPropertyChanged(BR.time_epoch);
                }

                @Bindable
                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                    notifyPropertyChanged(BR.time);
                }

                @Bindable
                public double getTemp_c() {
                    return temp_c;
                }

                public void setTemp_c(double temp_c) {
                    this.temp_c = temp_c;
                    notifyPropertyChanged(BR.temp_c);
                }

                @Bindable
                public double getTemp_f() {
                    return temp_f;
                }

                public void setTemp_f(double temp_f) {
                    this.temp_f = temp_f;
                    notifyPropertyChanged(BR.temp_f);
                }

                @Bindable
                public int getIs_day() {
                    return is_day;
                }

                public void setIs_day(int is_day) {
                    this.is_day = is_day;
                    notifyPropertyChanged(BR.is_day);
                }

                @Bindable
                public ConditionBeanXX getCondition() {
                    return condition;
                }

                public void setCondition(ConditionBeanXX condition) {
                    this.condition = condition;
                    notifyPropertyChanged(BR.condition);
                }

                @Bindable
                public double getWind_mph() {
                    return wind_mph;
                }

                public void setWind_mph(double wind_mph) {
                    this.wind_mph = wind_mph;
                    notifyPropertyChanged(BR.wind_mph);
                }

                @Bindable
                public double getWind_kph() {
                    return wind_kph;
                }

                public void setWind_kph(double wind_kph) {
                    this.wind_kph = wind_kph;
                    notifyPropertyChanged(BR.wind_kph);
                }

                @Bindable
                public int getWind_degree() {
                    return wind_degree;
                }

                public void setWind_degree(int wind_degree) {
                    this.wind_degree = wind_degree;
                    notifyPropertyChanged(BR.wind_degree);
                }

                @Bindable
                public String getWind_dir() {
                    return wind_dir;
                }

                public void setWind_dir(String wind_dir) {
                    this.wind_dir = wind_dir;
                    notifyPropertyChanged(BR.wind_dir);
                }

                @Bindable
                public double getPressure_mb() {
                    return pressure_mb;
                }

                public void setPressure_mb(double pressure_mb) {
                    this.pressure_mb = pressure_mb;
                    notifyPropertyChanged(BR.pressure_mb);
                }

                @Bindable
                public double getPressure_in() {
                    return pressure_in;
                }

                public void setPressure_in(double pressure_in) {
                    this.pressure_in = pressure_in;
                    notifyPropertyChanged(BR.pressure_in);
                }

                @Bindable
                public double getPrecip_mm() {
                    return precip_mm;
                }

                public void setPrecip_mm(double precip_mm) {
                    this.precip_mm = precip_mm;
                    notifyPropertyChanged(BR.precip_mm);
                }

                @Bindable
                public double getPrecip_in() {
                    return precip_in;
                }

                public void setPrecip_in(double precip_in) {
                    this.precip_in = precip_in;
                    notifyPropertyChanged(BR.precip_in);
                }

                @Bindable
                public int getHumidity() {
                    return humidity;
                }

                public void setHumidity(int humidity) {
                    this.humidity = humidity;
                    notifyPropertyChanged(BR.humidity);
                }

                @Bindable
                public int getCloud() {
                    return cloud;
                }

                public void setCloud(int cloud) {
                    this.cloud = cloud;
                    notifyPropertyChanged(BR.cloud);
                }

                @Bindable
                public double getFeelslike_c() {
                    return feelslike_c;
                }

                public void setFeelslike_c(double feelslike_c) {
                    this.feelslike_c = feelslike_c;
                    notifyPropertyChanged(BR.feelslike_c);
                }

                @Bindable
                public double getFeelslike_f() {
                    return feelslike_f;
                }

                public void setFeelslike_f(double feelslike_f) {
                    this.feelslike_f = feelslike_f;
                    notifyPropertyChanged(BR.feelslike_f);
                }

                @Bindable
                public double getWindchill_c() {
                    return windchill_c;
                }

                public void setWindchill_c(double windchill_c) {
                    this.windchill_c = windchill_c;
                    notifyPropertyChanged(BR.windchill_c);
                }

                @Bindable
                public double getWindchill_f() {
                    return windchill_f;
                }

                public void setWindchill_f(double windchill_f) {
                    this.windchill_f = windchill_f;
                    notifyPropertyChanged(BR.windchill_f);
                }

                @Bindable
                public double getHeatindex_c() {
                    return heatindex_c;
                }

                public void setHeatindex_c(double heatindex_c) {
                    this.heatindex_c = heatindex_c;
                    notifyPropertyChanged(BR.heatindex_c);
                }

                @Bindable
                public double getHeatindex_f() {
                    return heatindex_f;
                }

                public void setHeatindex_f(double heatindex_f) {
                    this.heatindex_f = heatindex_f;
                    notifyPropertyChanged(BR.heatindex_f);
                }

                @Bindable
                public double getDewpoint_c() {
                    return dewpoint_c;
                }

                public void setDewpoint_c(double dewpoint_c) {
                    this.dewpoint_c = dewpoint_c;
                    notifyPropertyChanged(BR.dewpoint_c);
                }

                @Bindable
                public double getDewpoint_f() {
                    return dewpoint_f;
                }

                public void setDewpoint_f(double dewpoint_f) {
                    this.dewpoint_f = dewpoint_f;
                    notifyPropertyChanged(BR.dewpoint_f);
                }

                @Bindable
                public int getWill_it_rain() {
                    return will_it_rain;
                }

                public void setWill_it_rain(int will_it_rain) {
                    this.will_it_rain = will_it_rain;
                    notifyPropertyChanged(BR.will_it_rain);
                }

                @Bindable
                public String getChance_of_rain() {
                    return chance_of_rain;
                }

                public void setChance_of_rain(String chance_of_rain) {
                    this.chance_of_rain = chance_of_rain;
                    notifyPropertyChanged(BR.chance_of_rain);
                }

                @Bindable
                public int getWill_it_snow() {
                    return will_it_snow;
                }

                public void setWill_it_snow(int will_it_snow) {
                    this.will_it_snow = will_it_snow;
                    notifyPropertyChanged(BR.will_it_snow);
                }

                @Bindable
                public String getChance_of_snow() {
                    return chance_of_snow;
                }

                public void setChance_of_snow(String chance_of_snow) {
                    this.chance_of_snow = chance_of_snow;
                    notifyPropertyChanged(BR.chance_of_snow);
                }

                @Bindable
                public double getVis_km() {
                    return vis_km;
                }

                public void setVis_km(double vis_km) {
                    this.vis_km = vis_km;
                    notifyPropertyChanged(BR.vis_km);
                }

                @Bindable
                public double getVis_miles() {
                    return vis_miles;
                }

                public void setVis_miles(double vis_miles) {
                    this.vis_miles = vis_miles;
                    notifyPropertyChanged(BR.vis_miles);
                }

                @Bindable
                public double getGust_mph() {
                    return gust_mph;
                }

                public void setGust_mph(double gust_mph) {
                    this.gust_mph = gust_mph;
                    notifyPropertyChanged(BR.gust_mph);
                }

                @Bindable
                public double getGust_kph() {
                    return gust_kph;
                }

                public void setGust_kph(double gust_kph) {
                    this.gust_kph = gust_kph;
                    notifyPropertyChanged(BR.gust_kph);
                }

                @Bindable
                public double getUv() {
                    return uv;
                }

                public void setUv(double uv) {
                    this.uv = uv;
                    notifyPropertyChanged(BR.uv);
                }

                public static class ConditionBeanXX extends BaseObservable {
                    /**
                     * text : Partly cloudy
                     * icon : //cdn.weatherapi.com/weather/64x64/night/116.png
                     * code : 1003
                     */

                    private String text;
                    private String icon;
                    private int code;

                    @Bindable
                    public String getText() {
                        return text;
                    }

                    public void setText(String text) {
                        this.text = text;
                        notifyPropertyChanged(BR.text);
                    }

                    @Bindable
                    public String getIcon() {
                        return icon;
                    }

                    public void setIcon(String icon) {
                        this.icon = icon;
                        notifyPropertyChanged(BR.icon);
                    }

                    @Bindable
                    public int getCode() {
                        return code;
                    }

                    public void setCode(int code) {
                        this.code = code;
                        notifyPropertyChanged(BR.code);
                    }
                }
            }
        }
    }
}
