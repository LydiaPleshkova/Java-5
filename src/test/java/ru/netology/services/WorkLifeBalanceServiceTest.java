package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//import ru.netology.services.WorkLifeBalanceService;

public class WorkLifeBalanceServiceTest {

    @Test
    void shouldCalculateForHighThreshold() {
        WorkLifeBalanceService service = new WorkLifeBalanceService();

        // подготавливаем данные:
        int expected = 3;

        // вызываем целевой метод:
        int actual = service.calculate(10_000, 3_000, 20_000);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForLowThreshold() {
        WorkLifeBalanceService service = new WorkLifeBalanceService();

        // подготавливаем данные:
        int expected = 2;

        // вызываем целевой метод:
        int actual = service.calculate(100_000, 60_000, 150_000);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }
}