package ru.job4j.loop;

public class OddCount {
    /**
     * Считаем количество нечетных в диапазоне от a до b
     * @param a
     * @param b
     * @return
     */
    public static int count(int a, int b) {
        int count = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 == 1) {
                count += 1;
            }
        }
        return count;
    }
}
