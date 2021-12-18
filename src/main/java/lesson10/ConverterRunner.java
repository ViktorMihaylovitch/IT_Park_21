package lesson10;

import java.awt.print.Printable;
import java.util.Scanner;
import java.util.concurrent.Callable;
import lesson10.Converter;

public class ConverterRunner {

    public static void main(String[] args) {
        System.out.println("Здравствуйте!\n Введи значение для конвертации:");
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextDouble()) {
            String inputValue = scanner.next();
            System.out.printf("Вместо %s ожидали значение температуры как вещественного числа\n", inputValue);
        }
        double value = scanner.nextDouble();
        System.out.println("Введи пожалуйста исходную единицу измерения (возможные варианты - C, K, F, R):");
        String temperatureSystem = scanner.next();
        System.out.println("Введи пожалуйста единицу измерения, в которую будет переводено введенное значение (возможные варианты - C, K, F, R):");
        String destinationTemperatureSystem = scanner.next();
        System.out.printf("Результат: %.2f\n", Converter.convert(value,
                Systems.of(temperatureSystem),
                Systems.of(destinationTemperatureSystem)));
    }
}


