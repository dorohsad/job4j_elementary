package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SortSelectedTest {

    @Test
    public void when5NumbersThenSort() {
        int[] data = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 4, 5};
        assertArrayEquals(expected, result);
    }

    @Test
    public void when3NumbersThenSort() {
        int[] data = new int[]{3, 4, -3};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{-3, 3, 4};
        assertArrayEquals(expected, result);
    }
}