package ru.job4j.loop;

public class ModWithLoop {
    public static int mod(int n, int d) {
        int result = n - ((n / d) * d);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(ModWithLoop.mod(0, 3));
    }
}