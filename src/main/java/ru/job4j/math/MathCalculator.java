package ru.job4j.math;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return MathFunction.sum(first, second) + MathFunction.multiply(first, second);
    }

    public static double differenceAndDivision(double first, double second) {
        return MathFunction.difference(first, second) + MathFunction.division(first, second);
    }

    public static double sumAll(double first, double second) {
        return MathFunction.sum(first, second) + MathFunction.difference(first, second) + MathFunction.multiply(first, second) + MathFunction.division(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + differenceAndDivision(15, 30));
        System.out.println("Результат расчета равен: " + sumAll(15, 30));
    }
}