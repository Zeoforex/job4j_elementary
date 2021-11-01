package ru.job4j.array;

import java.util.Arrays;

public class ArrayWithoutEvenElements {
    /**
     * Из обычного массива делаем массив с нечетными элементами
     * @param data
     * @return
     */
    public static int[] changeData(int[] data) {
        int zero = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 != 0) {
                zero++;
            }
        }
        int[] array = new int[zero];
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