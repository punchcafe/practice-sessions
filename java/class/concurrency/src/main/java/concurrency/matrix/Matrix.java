package concurrency.matrix;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

public class Matrix<T> {
    private boolean beenSet;
    private final int rows;
    private final int columns;
    private final Object[][] internalMatrix;

    public Matrix(int rows, int columns){
        this.rows = rows;
        this.columns = columns;
        internalMatrix = new Object[rows][columns];
    }

    int getNumberOfRows(){
        return rows;
    }

    int getNumberOfColumns(){
        return columns;
    }

    T getElement(int i, int j){
        return (T) internalMatrix[j][i];
    }

    void setElement(T element, int i, int j){
        internalMatrix[j][i] = element;
    }

    T[] getRow(int ithRow){
        return (T[]) internalMatrix[ithRow];
    }

    T[] getColumn(int ithColumn){
        Object[] column = new Object[this.columns];
        for(int i = 0; i < this.rows; i++){
            column[i] = internalMatrix[i][ithColumn];
        }
        return (T[]) column;
    }

    Matrix multiplyOn(Matrix matrix){
        if(this.columns != matrix.getNumberOfRows()){
            return null;
        }
        Matrix<Future<T>> completableMatrix = new Matrix<>(this.columns, matrix.getNumberOfColumns());
        Future<Object> someFuture = new CompletableFuture<>();

    }
}
