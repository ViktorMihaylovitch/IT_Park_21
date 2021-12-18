package lesson10.Metod;

import lesson10.Converter;
import lesson10.Printer;

public class KelvinToRoomera implements Converter {

    public static final double DELTA = 273.15;

    public static final double KOEF = 0.8;

    @Override
    public double convert(Printer value) {
        return ((value.getValue() - DELTA) * KOEF);
    }
}
