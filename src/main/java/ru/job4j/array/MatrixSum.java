package ru.job4j.array;

public class MatrixSum {
    /**
     * Находит сумму и в первом и во втором массиве
     * @param array
     * @return
     */
    public static int sum(int[][] array) {
        int rsl = 0;
        for (int[] ints : array) {
            for (int val : ints) {
                rsl += val;
            }
        }
        return rsl;
    }
}