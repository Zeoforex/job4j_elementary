package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when18200to620then21dot63() {
        double expected = 21.63;
        Point a = new Point(18, 20, 0);
        Point b = new Point(6, 2, 0);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

}