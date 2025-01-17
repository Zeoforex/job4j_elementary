package ru.job4j.array;

public class MinDiapason {
    private MinDiapason() {
        throw new IllegalStateException("Utility class");
    }

    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int i = start + 1; i < finish; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}