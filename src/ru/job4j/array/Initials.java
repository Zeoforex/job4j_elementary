package ru.job4j.array;

public class Initials {
    public static String convert(String[] fio) {
        String result = fio[0] + " ";
        for (int i = 1; i < fio.length; i++) {
            char first = fio[i].charAt(0);
            result  = result + first + ".";
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Initials.convert(new String[]{"Иванов", "Иван", "Иваныч"}));
    }
}