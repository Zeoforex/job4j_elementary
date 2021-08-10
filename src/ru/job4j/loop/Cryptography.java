package ru.job4j.loop;

public class Cryptography {
    public static String code(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        while (!(s.equals(""))) {
            if (s.length() > 0 && s.length() <= 4) {
                return s;
            } else {
                for (int i = 0; i < stringBuilder.length() - 4; i++) {
                    stringBuilder.setCharAt(i, '#');
                }
                return stringBuilder.toString();
            }
        }
        if (s == "") {
            s = "empty";
        }
        return s;
    }
}