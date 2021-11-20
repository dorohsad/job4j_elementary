package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to43then5() {
        double expected = 5;
        int x1 = 0;
        int y1 = 0;
        int x2 = 4;
        int y2 = 3;
        double out = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenMinus4Minus3to00then5() {
        double expected = 5;
        int x1 = -4;
        int y1 = -3;
        int x2 = 0;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, out, 0.01);
    }
}