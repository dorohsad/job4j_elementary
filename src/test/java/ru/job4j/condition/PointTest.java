package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to43then5() {
        double expected = 5;
        Point a = new Point(0, 0);
        Point b = new Point(4, 3);
        double out = a.distance(b);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenMinus4Minus3to00then5() {
        double expected = 5;
        Point a = new Point(-4, -3);
        Point b = new Point(0, 0);
        double out = a.distance(b);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenAllZeroAndOneAndTwoZeroThenOne() {
        double expected = 1;
        Point a = new Point(0, 0, 0);
        Point b = new Point(1, 0, 0);
        double out = a.distance3d(b);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenAllFourAndAllZeroThenSixPointNineThree() {
        double expected = 6.93;
        Point a = new Point(0, 0, 0);
        Point b = new Point(4, 4, 4);
        double out = a.distance3d(b);
        assertEquals(expected, out, 0.01);
    }
}