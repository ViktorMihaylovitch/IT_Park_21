package lesson10.Metod;

import lesson10.Converter;
import lesson10.Printer;
import static lesson10.Metod.CelsiusToKelvin.DELTA;

public class KelvinToCelsius implements Converter {

    @Override
    public double convert(Printer value) {
        return value.getValue() - DELTA;
    }
}