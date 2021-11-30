package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax10To2Then10() {
        int left = 10;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 10;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax6To6Then6() {
        int left = 6;
        int right = 6;
        int result = Max.max(left, right);
        int expected = 6;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax3To4To7To122Then122() {
        int first = 3;
        int second = 4;
        int third = 7;
        int four = 122;
        Max max = new Max();
        int result = max.max(first, second, third, four);
        int expected = 122;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax72To15To189Then189() {
        int first = 72;
        int second = 15;
        int third = 189;
        Max max = new Max();
        int result = max.max(first, second, third);
        int expected = 189;
        Assert.assertEquals(result, expected);
    }
}