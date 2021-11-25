package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SwitchWeekTest {

    @Test
    public void when7ThenSunday() {
        String expected = "Воскресенье";
        Assert.assertEquals(expected, SwitchWeek.nameOfDay(7));
    }

    @Test
    public void when10ThenError() {
        String expected = "Ошибка";
        Assert.assertEquals(expected, SwitchWeek.nameOfDay(10));
    }
}