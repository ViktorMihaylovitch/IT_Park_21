package lesson10.Metod;

import lesson10.Converter;
import lesson10.Printer;

public class RoomeraToKelvin implements Converter {

    public static final double DELTA = 273.15;

    public static final double KOEFFIC = 1.25;

    @Override
    public double convert(Printer value) {
        return (value.getValue() * KOEFFIC + DELTA);
    }
}
