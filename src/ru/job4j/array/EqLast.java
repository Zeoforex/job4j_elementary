package ru.job4j.array;

public class EqLast {
    /**
     * Проверка на последний элемент
     * @param left
     * @param right
     * @return
     */
    public static boolean check(int[] left, int[] right) {
        return left[left.length - 1] == right[right.length - 1];
    }
}