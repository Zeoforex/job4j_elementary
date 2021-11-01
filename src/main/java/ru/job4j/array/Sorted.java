package ru.job4j.array;

public class Sorted {
    public static boolean isSorted(int[] array) {
        boolean check = true;
        int el;
        for (int i = 0; i < array.length - 1; i++) {
            el = array[i];
            if (!(el < array[i + 1])) {
                check = false;
                break;
            }
        }
        return check;
    }
}