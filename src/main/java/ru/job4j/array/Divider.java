package ru.job4j.array;

public class Divider {
    /**
     * Нужно посмотреть делиться ли наше num на все числа в массиве ints и вывести true или false соответственно
     * @param num
     * @param ints
     * @return
     */
    public static boolean check(int num, int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            if (num % ints[i] != 0) {
                return false;
            }
        }
        return true;
    }
}