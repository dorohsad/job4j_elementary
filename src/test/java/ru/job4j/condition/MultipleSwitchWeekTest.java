package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultipleSwitchWeekTest {

    @Test
    public void whenRussianSundayThen7() {
        int result = MultipleSwitchWeek.numberOfDay("Воскресенье");
        int expected = 7;
        assertEquals(result, expected);
    }

    @Test
    public void whenEnglishMondayThen1() {
        int result = MultipleSwitchWeek.numberOfDay("Monday");
        int expected = 1;
        assertEquals(result, expected);
    }

    @Test
    public void whenNotExistsDayThenMinus1() {
        int result = MultipleSwitchWeek.numberOfDay("Mon");
        int expected = -1;
        assertEquals(result, expected);
    }
}