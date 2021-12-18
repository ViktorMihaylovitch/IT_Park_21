package lesson10.Metod;

import lesson10.Converter;
import lesson10.Printer;

import java.util.spi.ToolProvider;

public class FahrenheitToKelvin implements Converter {

    public static final int DELTA = 32;

    public static final double KOEF1 = 1.8;

    @Override
    public double convert(Printer value) {
        return (value.getValue() - DELTA) / KOEF1 + CelsiusToKelvin.DELTA;
    }
}
