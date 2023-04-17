package org.example;

import ru.netology.services.WorkLifeBalanceService;

public class Main {
    public static void main(String[] args) {
        WorkLifeBalanceService service = new WorkLifeBalanceService();
        int count = service.calculate(100_000,60_000, 150_000);
        System.out.println(count);
    }
}
