package ru.job4j.loop;

public class ModWithLoop {
    public static int mod(int n, int d) {
        int result = n - ((n / d) * d);
        return result;
    }
}