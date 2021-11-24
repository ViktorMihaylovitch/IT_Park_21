package lesson6;

import java.util.Scanner;

public class FibonacciArray {

    public static void main(String[] args) {
        int number;
        System.out.println("Введите номер члена последовательности Фибоначчи (целое положительное число), для выхода введите 'exit':");
        Scanner sc = new Scanner(System.in);
            while (!sc.hasNext("exit")) {
                do {
                 while (!sc.hasNextInt()) {
                        System.out.println("Укажите целое положительное число:");
                        sc.next();
                    }
                    number = sc.nextInt();
                }
                while (number <= 0);
                System.out.println("Номер члена последовательности Фибоначчи: " + number);
                int n = number;
                int myList[] = new int[n];
                int num = calculat(myList, n);
                System.out.println(num);
            }
    }

    public static int calculat(int[] myList, int n) {
        if (n == 1) {
            System.out.println(0);
        } else if (n == 2) {
            System.out.println(1);
        } else {
            myList[0] = 0;
            myList[1] = 1;
            for (int i = 2; i < myList.length; i++) {
                myList[i] = myList[i - 1] + myList[i - 2];
            }
        }
        int k = myList[n - 1];
        return k;
    }
}

