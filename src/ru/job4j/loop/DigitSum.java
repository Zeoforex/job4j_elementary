package ru.job4j.loop;

public class DigitSum {
    public static int sum(int num) {
        int sum = 0;
        while (num > 0) {
            int res = num % 10;
            sum += res;
            num /= 10;
        }
        return sum;
    }
}