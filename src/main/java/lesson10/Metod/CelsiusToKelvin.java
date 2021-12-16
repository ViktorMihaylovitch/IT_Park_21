package lesson10.Metod;

import lesson10.Converter;
import lesson10.Printer;

public class CelsiusToKelvin implements Converter {

    public static final double DELTA = 273.15;

    @Override
    public double convert(Printer value) {
        return value.getValue() + DELTA;
    }
}
