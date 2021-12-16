package lesson10.Metod;

import lesson10.Converter;
import lesson10.Printer;

public class IdentyConverter implements Converter {

    @Override
    public double convert(Printer value) {
        return value.getValue();
    }
}
