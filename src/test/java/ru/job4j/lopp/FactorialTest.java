package ru.job4j.lopp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int in = 5;
        int expected = 120;
        int out = Factorial.calc(in);
        assertEquals(expected, out);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int in = 0;
        int expected = 1;
        int out = Factorial.calc(in);
        assertEquals(expected, out);
    }

    @Test
    public void whenCalculateFactorialForOneThenOne() {
        int in = 1;
        int expected = 1;
        int out = Factorial.calc(in);
        assertEquals(expected, out);
    }
}