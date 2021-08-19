package ru.job4j.array;

public class IndexOfWithCount {
    public static int indexOf(char[] string, char c, int number) {
        int index = 0;
        for (int i = 0; i < string.length; i++) {
            if (c == string[i]) {
                if (number != 1) {
                    index = i;
                    continue;
                }
                index = i;
            } else {
                index = -1;
            }
        }
        return index;
    }
}