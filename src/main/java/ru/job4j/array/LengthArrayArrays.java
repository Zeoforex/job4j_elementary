package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] numbers = {{55}, {23, 34}, {1, 28, 9}, {1, 11, 22, 9}};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(
                    "Размер вложенного массива равен: " + numbers[i].length
            );
        }
    }
}