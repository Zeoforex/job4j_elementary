package ru.job4j.array;

public class TriangleMatrix {
    public static int[][] rows(int count) {
        int[][] triangle = new int[count][];
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                triangle[i][j] = count;
            }
        }
        return triangle;
    }

    public static void main(String[] args) {
        System.out.println(TriangleMatrix.rows(1));
    }
}
