package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindLoopTest {
    @Test
    public void whenArrayHasLength0ThenMinus1() {
        int[] data = new int[0];
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        assertEquals(expected, result);
    }

    @Test
    public void whenFind3() {
        int[] data = new int[] {5, 2, 10, 2, 4};
        int el = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = 3;
        assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 4, 3, 2};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        assertEquals(expected, result);
    }

    @Test
    public void whenArrayHasNot5ThenMinus1() {
        int[] data = {10, 4, 3, 2};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        assertEquals(expected, result);
    }
}