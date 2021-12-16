package lesson10.Metod;

import lesson10.Converter;
import lesson10.Printer;

import java.util.spi.ToolProvider;

public class FahrenheitToKelvin implements Converter {
    @Override
    public double convert(Printer value) {
        return (value.getValue() - FahrenheitToCelsius.DELTA) / FahrenheitToCelsius.KOEFFICIENT + CelsiusToKelvin
                .DELTA;
    }
}
