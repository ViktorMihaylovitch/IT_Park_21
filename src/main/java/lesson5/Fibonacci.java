package lesson5;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println("Введите номер члена последовательности Фибоначчи");
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            scanner.next();
        }
        int n = scanner.nextInt();
        int myList[] = new int[n];
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
            System.out.println(myList[n-1]);
        }
    }
}

