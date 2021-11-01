package ru.job4j.array;

public class MaxFirstOrLastElement {
    /**
     * Нахождение максимального элемента
     * @param array
     * @return
     */
    public static int getMaxValue(int[] array) {
        int result = array[0] > array[array.length - 1] ? array[0] : array[array.length - 1];
        return result;
    }
}