package lesson12;

import lesson12.exception.MyArrayDataException;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Matrix {

    public static final int ROWS = 4;
    public static final int COLUMNS = 4;

    private List<List<String>> values;
    private static final List<String> SYMBOLS = List.of("25", "45", "16", "78", "3",
            "7", "28", "5", "8", "12", "54", "30", "44", "15", "22", "11");





    public Matrix(int n, int m) {
        if (n != ROWS || m != ROWS) {
throw new MyArraySizeException(n,m,"Произошла ошибка во время инициализации матрицы");
        }
        this.values = new ArrayList<>(n);
        fillUp(n, m);

    }

    public void fillUp(int n, int m) {
        for (int i = 0; i < n; i++) {
            List<String> lines = new ArrayList<>(m);
            this.values.add(lines);
            for (int j = 0; j < m; j++) {

                int randomIndex = new Random().nextInt(SYMBOLS.size() - 1);

                lines.add(SYMBOLS.get(randomIndex));
            }
        }
    }

      public int sum() throws MyArrayDataException {
        int result = 0;

        for (int i = 0; i<this.values.size(); i++) {
            List<String> row = this.values.get(i);
            for (int j = 0; j < row.size(); j++) {
                String value = row.get(j);
                if (value.matches("\\d+")) {
                    result += Integer.parseInt(value);
                } else {
                    throw new MyArrayDataException(i, j, "Некорректное значение в качестве матрицы");
                }
            }
        }
        return result;
      }

        public void print() {
            for (List<String> lines : this.values) {
                System.out.println(lines);
            }

        }
    }
