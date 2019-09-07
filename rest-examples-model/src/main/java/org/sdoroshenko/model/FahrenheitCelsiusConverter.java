package org.sdoroshenko.model;

public class FahrenheitCelsiusConverter {

    public static int toFahrenheit(int temperature) {
        return temperature * 9 / 5 + 32;
    }

    public static int toCelsius(int temperature) {
        return (temperature - 32) * 5 / 9;
    }
}
