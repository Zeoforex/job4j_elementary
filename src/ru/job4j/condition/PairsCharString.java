package ru.job4j.condition;

public class PairsCharString {
    public static boolean check(String l, String r) {
        int last = l.length() - 1;
        int last1 = r.length() - 1;
        if (l.isEmpty() && r.isEmpty()) {
            return true;
        } else {
            return l.charAt(0) == r.charAt(last1) && l.charAt(last) == r.charAt(0);
        }
    }
}
