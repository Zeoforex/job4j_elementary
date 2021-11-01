package ru.job4j.condition;

public class AttackRook {
    public static boolean check(String left, String right) {
        char[] strToArray = left.toCharArray();
        char[] strToArray2 = right.toCharArray();
        return strToArray[0] == strToArray2[0] || strToArray[1] == strToArray2[1];
    }
}