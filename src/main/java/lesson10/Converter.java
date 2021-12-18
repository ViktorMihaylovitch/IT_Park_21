package lesson10;

import lesson10.Metod.*;

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
                        return new KelvinToCelsius().convert(new Printer(x, Systems.CELSIUS));
                    }
                    case ROOMERA -> {
                        double x = new RoomeraToKelvin().convert(value);
                        return new KelvinToCelsius().convert(new Printer(x, Systems.CELSIUS));
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
                    case ROOMERA -> {
                        return new RoomeraToKelvin().convert(value);
                    }
                }
            }
            case FAHRENHEIT -> {
                switch (value.getMeasurementSystem()) {
                    case CELSIUS -> {
                        double x = new CelsiusToKelvin().convert(value);
                        return new KelvinToFahrenheit().convert(new Printer(x, Systems.FAHRENHEIT));
                    }
                    case FAHRENHEIT -> {
                        return new IdentyConverter().convert(value);
                    }
                    case KELVIN -> {
                        return new KelvinToFahrenheit().convert(value);
                    }
                    case ROOMERA -> {
                        double x = new RoomeraToKelvin().convert(value);
                        return new KelvinToFahrenheit().convert(new Printer(x, Systems.FAHRENHEIT));
                    }
                }
            }
            case ROOMERA -> {
                switch (value.getMeasurementSystem()) {
                    case CELSIUS -> {
                        double x = new CelsiusToKelvin().convert(value);
                        return new KelvinToRoomera().convert(new Printer(x, Systems.ROOMERA));
                    }
                    case ROOMERA -> {
                        return new IdentyConverter().convert(value);
                    }
                    case KELVIN -> {
                        return new KelvinToRoomera().convert(value);
                    }
                    case FAHRENHEIT -> {
                        double x = new FahrenheitToKelvin().convert(value);
                        return new KelvinToRoomera().convert(new Printer(x, Systems.ROOMERA));
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
