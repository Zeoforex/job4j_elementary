package ru.job4j.array;

public class CrossArray {
    /**
     * Находим элемент который есть и в первом и во втором массиве и выводим его
     * @param left
     * @param right
     */
    public static void printCrossEl(int[] left, int[] right) {
        int el;
        for (int k : left) {
            el = k;
            for (int i : right) {
                if (el == i) {
                    System.out.println(el);
                }
            }
        }
    }
}
