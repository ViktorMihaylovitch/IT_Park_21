package lesson12;

import static lesson12.Matrix.*;

public class MyArraySizeException extends RuntimeException {

    private final int wrongRows;
    private final int wrongColumns;

    public MyArraySizeException(int wrongRows, int wrongColumns, String message){
        super (message + String.format("%s. Количество строк и колонок ожидалось соответственно: %d", message, ROWS, COLUMNS));
        this.wrongRows = wrongRows;
        this.wrongColumns = wrongColumns;
    }

    public int getWrongRows() {
        return wrongRows;
    }

    public int getWrongColumns() {
        return wrongColumns;
    }
}
