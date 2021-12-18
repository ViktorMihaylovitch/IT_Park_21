package lesson10.Metod;

import lesson10.Converter;
import lesson10.Printer;

public class KelvinToFahrenheit implements Converter {

    public static final int DELTA = 32;

    public static final double KOEF2 = 1.8;

    @Override
    public double convert(Printer value) {
        return (value.getValue() - CelsiusToKelvin.DELTA) * KOEF2
                + DELTA;
    }
}