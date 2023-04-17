package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
//import ru.netology.services.WorkLifeBalanceService;

public class WorkLifeBalanceServiceTest {

    @ParameterizedTest
//    @CsvSource({
//            "3,10000,3000,20000",
//            "2,100000,60000,150000"
//    })
    @CsvFileSource(files="src/test/resources/WorkLifeBalance.csv")
    void shouldCalculateForHighThreshold(int expected, int income, int expenses, int threshold) {
        WorkLifeBalanceService service = new WorkLifeBalanceService();

        // подготавливаем данные:
        //int expected = 3;

        // вызываем целевой метод:
        int actual = service.calculate(income, expenses, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }
        //   }
 //   @Test
 //   void shouldCalculateForLowThreshold() {
 //       WorkLifeBalanceService service = new WorkLifeBalanceService();

        // подготавливаем данные:
 //       int expected = 3;

        // вызываем целевой метод:
 //       int actual = service.calculate(100_000, 60_000, 150_000);

        // производим проверку (сравниваем ожидаемый и фактический):
//        Assertions.assertEquals(expected, actual);
//   }
}