package lesson10.Metod;

import lesson10.Converter;
import lesson10.Printer;

public class KelvinToFahrenheit implements Converter {

    @Override
    public double convert(Printer value) {
        return (value.getValue() - CelsiusToKelvin.DELTA) * FahrenheitToCelsius.KOEFFICIENT
                + FahrenheitToCelsius.DELTA;
    }
}