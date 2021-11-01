package ru.job4j.loop;

public class DegreeLoop {
    public static int calculate(int a, int n) {
        int result = 1;
        while (n > 0) {
            result = result * a;
            n -= 1;
        }
        return result;
    }
}
