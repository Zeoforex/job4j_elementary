package ru.job4j.array;

public class Fibonacci {
    /**
     * Является ли последовательность чисел, числами Фибоначчи
     * @param data
     * @return
     */
    public static boolean checkArray(int[] data) {
        boolean rsl = true;
        for (int i = 2; i < data.length - 1; i++) {
            if (data[i] + data[i - 1] != data[i + 1]) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}