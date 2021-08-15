package ru.job4j.array;

public class MaxFirstOrLastElement {
    public static int getMaxValue(int[] array) {
        int result = array[0] > array[array.length - 1] ? array[0] : array[array.length - 1];
        return result;
    }
}