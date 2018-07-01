package com.kortware.wu.apiclient.model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.function.Function;

public class Temperature {

    private Double absoluteTemperatureValue; // Kelvin

    private Temperature(Double absoluteTemperature) {

        this.absoluteTemperatureValue = (absoluteTemperature < 0) ? 0 : absoluteTemperature;
    }

    public Double inKelvin() {

        return new BigDecimal(absoluteTemperatureValue).setScale(3,RoundingMode.HALF_UP).doubleValue();
    }
    public Double inCelsius() {

        return new BigDecimal(kelvinToCelsius.apply(inKelvin())).setScale(3,RoundingMode.HALF_UP).doubleValue();
    }
    public Double inFahrenheit() {

        return new BigDecimal(kelvinToFahrenheit.apply(inKelvin())).setScale(3,RoundingMode.HALF_UP).doubleValue();
    }

    @Override
    public String toString() {

        return inFahrenheit() + " F (" + inCelsius() + " C)";
    }

    @Override
    public boolean equals(Object obj) {

        return obj instanceof Temperature && ((Temperature)obj).absoluteTemperatureValue.equals(absoluteTemperatureValue);
    }

    public static Function<Double,Double> kelvinToCelsius = k -> k - 273.15;
    public static Function<Double,Double> celsiusToKelvin = c -> c + 273.15;

    public static Function<Double,Double> celsiusToFahrenheit = c -> (c * 1.8) + 32;
    public static Function<Double,Double> fahrenheitToCelsius = f -> (f - 32)/1.8;

    public static Function<Double,Double> fahrenheitToKelvin = fahrenheitToCelsius.andThen(celsiusToKelvin);
    public static Function<Double,Double> kelvinToFahrenheit = kelvinToCelsius.andThen(celsiusToFahrenheit);

    public static Temperature fromCelsius(Double celsius) {

        return new Temperature(celsiusToKelvin.apply(celsius));
    }
    public static Temperature fromCelsius(String celsius) {

        if (celsius == null) return null;
        if (celsius.isEmpty()) return null;
        if (celsius.toLowerCase().equals("na")) return null;

        return fromCelsius(Double.parseDouble(celsius));
    }

    public static Temperature fromFahrenheit(Double fahrenheit) {

        return new Temperature(fahrenheitToKelvin.apply(fahrenheit));
    }
    public static Temperature fromFahrenheit(String fahrenheit) {

        if (fahrenheit == null) return null;
        if (fahrenheit.isEmpty()) return null;
        if (fahrenheit.toLowerCase().equals("na")) return null;

        return fromFahrenheit(Double.parseDouble(fahrenheit));
    }

}
