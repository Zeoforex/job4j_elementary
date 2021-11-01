package ru.job4j.loop;

public class Abbreviation {
    public static String collect(String s) {
        String[] words = s.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (String word : words) {
            char first = word.charAt(0);
            stringBuilder.append(first);
        }
        return stringBuilder.toString();
    }
}