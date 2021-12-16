package lesson10.Metod;

import lesson10.Converter;
import lesson10.Printer;

import static lesson10.Metod.FahrenheitToCelsius.DELTA;
import static lesson10.Metod.FahrenheitToCelsius.KOEFFICIENT;

public class CelsiusToFahrenheit implements Converter {

    @Override
    public double convert(Printer value) {
        return value.getValue() * KOEFFICIENT + DELTA;
    }
}
