package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort2() {
        int[] data = new int[] {78, 4, 12};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {4, 12, 78};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort3() {
        int[] data = new int[] {78, 4, 12, 55, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 4, 12, 55, 78};
        Assert.assertArrayEquals(expected, result);
    }
}