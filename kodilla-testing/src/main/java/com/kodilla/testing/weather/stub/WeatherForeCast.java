package com.kodilla.testing.weather.stub;

import java.util.HashMap;
import java.util.Map;

public class WeatherForeCast {
    private Temperatures temperatures;

    public WeatherForeCast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }

    public double calculateAverageTemperature() {
        Map<String, Double> resultMap = new HashMap<>();
        double tempSum = 0;

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }

        for (Map.Entry<String, Double> entry : resultMap.entrySet()) {
            tempSum += entry.getValue();
        }

        double average = tempSum / resultMap.size();

        return average;
    }
}