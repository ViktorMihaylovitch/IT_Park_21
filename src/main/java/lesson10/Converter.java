package lesson10;

import lesson10.Metod.IdentyConverter;
import lesson10.Metod.CelsiusToFahrenheit;
import lesson10.Metod.FahrenheitToCelsius;
import lesson10.Metod.CelsiusToKelvin;
import lesson10.Metod.FahrenheitToKelvin;
import lesson10.Metod.KelvinToCelsius;
import lesson10.Metod.KelvinToFahrenheit;

public interface Converter {

    double convert(Printer value);

    static double convert(Printer value, Systems toSystem) {
        switch (toSystem) {
            case CELSIUS -> {
                switch (value.getMeasurementSystem()) {
                    case CELSIUS -> {
                        return new IdentyConverter().convert(value);
                    }
                    case KELVIN -> {
                        return new KelvinToCelsius().convert(value);
                    }
                    case FAHRENHEIT -> {
                        double x = new FahrenheitToKelvin().convert(value);
                        return new KelvinToCelsius().convert(x);
                    }
                }
            }
            case KELVIN -> {
                switch (value.getMeasurementSystem()) {
                    case KELVIN -> {
                        return new IdentyConverter().convert(value);
                    }
                    case CELSIUS -> {
                        return new CelsiusToKelvin().convert(value);
                    }
                    case FAHRENHEIT -> {
                        return new FahrenheitToKelvin().convert(value);
                    }
                }
            }
            case FAHRENHEIT -> {
                switch (value.getMeasurementSystem()) {
                    case CELSIUS -> {
                        return new CelsiusToFahrenheit().convert(value);
                    }
                    case FAHRENHEIT -> {
                        return new IdentyConverter().convert(value);
                    }
                    case KELVIN -> {
                        return new KelvinToFahrenheit().convert(value);
                    }
                }
            }
        }
        throw new IllegalStateException("В данный код мы не должны попасть");
    }

    static double convert(double value, Systems fromSystem, Systems toSystem) {
        return Converter.convert(new Printer(value, fromSystem), toSystem);
    }
}
