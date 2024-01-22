package org.example.Pacet;

import org.example.WeekendsService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WeekendServiceTest {
    @Test
    public void shouldCalculateWeekendService1() {
        int count = WeekendsService.calculate(10000, 3000, 20000);
        int expected = 3;

        Assertions.assertEquals(expected, count);
    }

    @Test
    public void shouldCalculateWeekendService2() {
        int count = WeekendsService.calculate(100000, 60000, 150000);
        int expected = 2;
        Assertions.assertEquals(expected, count);
    }
}
