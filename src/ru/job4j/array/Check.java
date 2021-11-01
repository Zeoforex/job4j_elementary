package ru.job4j.array;

public class Check {
    /**
     * Проверяем что все значения являются одним типом
     * @param data
     * @return
     */
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 1; i < data.length; i++) {
            if (data[0] != data[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}