package ru.job4j.array;

public class ConcatArray {
    /**
     * Соединяем длину двух массивов и получаем итоговый
     * @param a
     * @param b
     * @return
     */
    public static int combineSize(int[] a, int[] b) {
        int[] res = new int[a.length + b.length];
        return res.length;
    }
}