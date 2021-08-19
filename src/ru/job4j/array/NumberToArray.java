package ru.job4j.array;

public class NumberToArray {
    public static int[] resolve(int number) {
        int sizeArray = number;
        int count = 0;
        while (sizeArray > 0) {
            sizeArray /= 10;
            count++;
        }
        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            if (number > 0) {
                array[i] = number % 10;
                number /= 10;
                }
        }
        return array;
    }
}