package ru.job4j.array;

public class Board {
    public static int getCountRow(int[][] array) {
        int result = 0;
        for (int i = 0; i <= array.length; i++) {
            result = i;
        }
        return result;
    }

    public static int getCountCellInRow(int[][] array, int row) {
        int result = 0;
        for (int i = 0; i <= array[row].length; i++) {
            result = i;
        }
        return result;
    }
}