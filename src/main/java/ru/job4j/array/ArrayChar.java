package ru.job4j.array;

public class ArrayChar {
    /**
     * Смотрим есть ли значения и в одном и в другом массиве
     * @param word
     * @param pref
     * @return
     */
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int i = 0; i < pref.length; i++) {
            if (word[i] != pref[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}