package com.example.headfirstdesignpatterns.domain.weatherStation;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ForecastDisplay implements Observer, DisplayElement{

    private float currentPressure = 29.92f;
    private float lastPressure;
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        if (currentPressure > lastPressure) {
            log.info("FORECAST: Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            log.info("FORECAST: More of the same.");
        } else if (currentPressure < lastPressure) {
            log.info("FORECAST: Watch out for cooler, rainy weather");
        }
    }

    @Override
    public void update() {
        lastPressure = currentPressure;
        currentPressure = weatherData.getPressure();
        display();
    }
}
