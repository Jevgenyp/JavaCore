package org.Lesson2;

/*
    Создать квадратный целочисленный массив (количество строк и
столбцов одинаковое), заполнить его диагональные элементы единицами,
используя цикл(ы)
 */

public class SqrMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        fillMatrixDiagonalsOnes(matrix);
        printMatrix(matrix);
    }

    public static void fillMatrixDiagonalsOnes(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][i] = 1;
            matrix[i][matrix.length - 1 - i] = 1;
        }
    }

    public static void printMatrix(int[][] matrix){
        for(int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}