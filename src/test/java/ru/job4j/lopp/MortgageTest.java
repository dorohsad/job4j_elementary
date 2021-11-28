package ru.job4j.lopp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MortgageTest {

    @Test
    public void when1Year() {
        int amount = 1000;
        int salary = 1200;
        double percent = 1;
        int result = Mortgage.year(amount, salary, percent);
        int expected = 1;
        assertEquals(expected, result);
    }

    @Test
    public void when2Year() {
        int amount = 100;
        int salary = 120;
        double percent = 50;
        int result = Mortgage.year(amount, salary, percent);
        int expected = 2;
        assertEquals(expected, result);
    }

    @Test
    public void when4Year() {
        int amount = 100;
        int salary = 26;
        double percent = 0;
        int result = Mortgage.year(amount, salary, percent);
        int expected = 4;
        assertEquals(expected, result);
    }
}