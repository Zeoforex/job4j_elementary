package ru.job4j.array;

public class MaxLengthSeria {
    /**
     * Максимальная длина серии которая заканчивается новой серией
     * @param array
     * @return
     */
    public static int find(int[] array) {
        int count = 1;
        if (array.length > 2) {
            for (int i = 0; i < array.length - 2; i++) {
                if (array[i] <= array[i + 1]) {
                    count++;
                }
            }
        } else {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] <= array[i + 1]) {
                    count++;
                }
            }
        }
        return count;
    }

}
