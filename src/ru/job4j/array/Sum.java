package ru.job4j.array;

public class Sum {
    public static int getSum(int[] array) {
        int result = array[0] + array[array.length - 1];
        return result;
    }
}