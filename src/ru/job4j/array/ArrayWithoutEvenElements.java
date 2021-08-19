package ru.job4j.array;

import java.util.Arrays;

public class ArrayWithoutEvenElements {
    public static int[] changeData(int[] data) {
        int withoutEven = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 != 0) {
                withoutEven++;
            }
        }
        int[] array = new int[withoutEven];
        int index = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 != 0) {
                    array[index] = data[i];
                    index++;
            }
        }
        return array;
    }
}