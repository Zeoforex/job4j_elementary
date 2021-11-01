package ru.job4j.loop;

public class Symmetry {
    public static boolean check(int i) {
        String str = Integer.toString(i);
        boolean check = true;
        for (int j = 0; j < str.length() / 2; j++) {
            if (str.charAt(j) != str.charAt(str.length() - j - 1)) {
                check = false;
                break;
            }
        }
        return check;
    }
}