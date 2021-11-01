package ru.job4j.array;

public class RandomDream {
    public static String random(String[] prizes, int num) {
        String result = "";
        num -= 1;
        while (num >= prizes.length) {
            num = num % prizes.length;
        }
        for (int i = 0; i < prizes.length; i++) {
            if (i == num) {
                result = prizes[i];
            }
        }
        return result;
    }
}