package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxTest {

    @Test
    public void whenLeftMaxThenReturnLeft() {
        int left = 3;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 3;
        assertEquals(result, expected);
    }

    @Test
    public void whenRightMaxThenReturnRight() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertEquals(result, expected);
    }

    @Test
    public void whenLeftEqualsRightThenReturnLeft() {
        int left = 7;
        int right = 7;
        int result = Max.max(left, right);
        int expected = 7;
        assertEquals(result, expected);
    }

    @Test
    public void whenAllFromFourNumbersEqualsThenReturnAny() {
        int a = 7;
        int b = 7;
        int c = 7;
        int d = 7;
        int result = Max.max(a, b, c, d);
        int expected = 7;
        assertEquals(result, expected);
    }

    @Test
    public void whenOneMaxFromThreeNumbersThenReturnOne() {
        int a = 1;
        int b = 0;
        int c = 0;
        int result = Max.max(a, b, c);
        int expected = 1;
        assertEquals(result, expected);
    }

    @Test
    public void whenOneMaxFromFourNumbersThenReturnOne() {
        int a = 1;
        int b = 0;
        int c = -10;
        int d = -5;
        int result = Max.max(a, b, c, d);
        int expected = 1;
        assertEquals(result, expected);
    }
}