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
}