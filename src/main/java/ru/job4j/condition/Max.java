package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left >= right ? left : right;
        return result;
    }

    public int max(int first, int second, int third) {
        return max(max(first, second), third);
    }

    public int max(int first, int second, int third, int four) {
        return max(max(first, second, third), four);
    }

}