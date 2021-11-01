package ru.job4j.array;

public class IndexMaxElement {
    /**
     * Нахождение индекса максимального элемента
     * @param array
     * @return
     */
    public static int getIndexMax(int[] array) {
        int rsl = array[0] > array[array.length - 1] ? 0 : array.length - 1;
        return rsl;
    }
}