package ru.job4j.array;

public class EvenIndexArray {
    /**
     * Идет вывод нечетных элементов
     * @param args
     */
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                System.out.println(array[i]);
            }
        }
    }
}