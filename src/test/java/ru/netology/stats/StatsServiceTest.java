package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    private int[] array = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    StatsService service = new StatsService();

    @Test
    void calculateSum() {
        int expected = 180;
        int actual = service.sum(array);
        assertEquals(expected,actual);
    }

    @Test
    void calculateAverageSum() {
        assertEquals(15,service.calculateAverageSum(array));
    }

    @Test
    void withMax() {
        assertEquals(8, service.withMax(array));
    }

    @Test
    void withMin() {
        assertEquals(9, service.withMin(array));
    }

    @Test
    void moreThanAverageSum() {
        assertEquals(5, service.moreThanAverageSum(array));
    }

    @Test
    void lessThanAverageSum() {
        assertEquals(5, service.lessThanAverageSum(array));
    }
}

