package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        percent = percent / 100;
        while (amount > 0) {
            double result = amount * percent;
            amount = amount + result;
            amount = amount - salary;
            year += 1;
        }
        return year;
    }
}