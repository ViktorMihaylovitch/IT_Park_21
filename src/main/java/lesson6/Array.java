package lesson6;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        int number;
        try (Scanner sc = new Scanner(System.in)) {
            do {
                System.out.println("Введите длину массива - целое положительное число:");
                while (!sc.hasNextInt()) {
                    System.out.println("Укажите целое положительное число:");
                    sc.next();
                }
                number = sc.nextInt();
            } while (number <= 0);
        }
        System.out.println("Длина массива " + number);
        int n = number;
            double[] myList = new double[n];
            for (int i = 2; i < myList.length; i++) {
                myList[i] = Math.random();
            }
            double min = minimum(myList);
            System.out.println("Минимальное значение массива: " + min);
            double max = maximum(myList);
            System.out.println("Максимальное значение массива: " + max);
            double avg = mean(myList);
            System.out.println("Среднее значение массива: " + avg);
        }

    public static double minimum(double[] myList) {
        double min = 1;
        for (int i = 0; i < myList.length; i++) {
            if (myList[i] < min) {
                min = myList[i];
            }
        }
        double min1 = min;
        return min1;
    }

    public static double maximum(double[] myList) {
        double max = 0;
        for (int i = 0; i < myList.length; i++) {
            if (myList[i] > max) {
                max = myList[i];
            }
        }
        double max1 = max;
        return max1;
    }

    public static double mean(double[] myList) {
        double result = 0;
        for (double index : myList) {
            result += index;
        }
        double avg = result / myList.length;
        return avg;
    }
}
