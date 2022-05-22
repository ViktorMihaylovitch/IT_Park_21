package lesson18;

import java.io.*;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) {

        InputStream file = Thread.currentThread().getContextClassLoader().getResourceAsStream("test.txt");

        new Thread(() -> {
            Scanner scanner = new Scanner(file);
            int i = 0;
            while (scanner.hasNextLine()) {
                try {
                    PrintWriter pw = new PrintWriter((new FileWriter(i + ".txt")));
                    pw.println(scanner.nextLine());
                    pw.close();
                    i++;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            scanner.close();
        }).start();

        System.out.println("Запись строк в отдельные файлы произведена");

    }
}
