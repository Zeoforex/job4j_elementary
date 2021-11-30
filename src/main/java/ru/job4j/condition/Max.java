package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left >= right ? left : right;
        return result;
    }

    public int max(int first, int second, int third) {
        if (first > second) {
            if (first > third) {
                return first;
            } else {
                return third;
            }
        } else if (second > third) {
            return third;
        } else {
            return second;
        }
    }

    public int max(int first, int second, int third, int four) {
        return max(max(first, second, third), four);
    }

}