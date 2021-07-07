package ir.far5had.weather.ui.home;

import ir.far5had.weather.model.Forecast;

public interface ForecastClickCallback {
    void onClick(Forecast.ForecastBean.ForecastdayBean forecastdayBean);
}
