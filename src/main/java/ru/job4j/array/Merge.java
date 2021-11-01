package ru.job4j.array;

public class Merge {
    /**
     * Соединяет два массива в один
     * @param left
     * @param right
     * @return
     */
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        for (int i = 0; i < left.length; i++) {
            rsl[i] = left[i];
        }
        for (int i = 0; i < right.length; i++) {
            rsl[left.length + i] = right[i];
        }
        for (int i = 0; i < (left.length + right.length) - 1; i++) {
            if (rsl[i] > rsl[i + 1]) {
                int temp = rsl[i + 1];
                rsl[i + 1] = rsl[i];
                rsl[i] = temp;
            }
        }
        return rsl;
    }
}