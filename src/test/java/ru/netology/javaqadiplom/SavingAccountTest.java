package ru.netology.javaqadiplom;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SavingAccountTest {

    @Test
    public void shouldAddLessThanMaxBalance() {
        SavingAccount account = new SavingAccount(
                2_000,
                1_000,
                10_000,
                5
        );

        account.add(3_000);

        Assertions.assertEquals(2_000 + 3_000, account.getBalance());  // Тест не проходит
    }                                                                          // В 73 строке кода ошибка

    @Test
    public void shouldAddMoreThanMaxBalance() {
        SavingAccount account = new SavingAccount(
                2_000,
                1_000,
                10_000,
                5
        );

        account.add(8_001);

        Assertions.assertEquals(2_000, account.getBalance());   // Тест проходит
    }

    @Test
    public void shouldAddEqualToMaxBalance() {
        SavingAccount account = new SavingAccount(
                2_000,
                1_000,
                10_000,
                5
        );

        account.add(8_000);

        Assertions.assertEquals(10_000, account.getBalance());  // Тест не проходит
    }                                                                   // В 73 строке кода ошибка

    @Test
    public void payTest() {
        SavingAccount account = new SavingAccount(100, 10, 200, 4);

        account.pay(90);

        Assertions.assertEquals(10, account.getBalance());  // Тест проходит
    }

    @Test
    public void payLessMinTest() {
        SavingAccount account = new SavingAccount(100, 10, 200, 4);

        account.pay(91);

        Assertions.assertEquals(100, account.getBalance());     // Тест не проходит
    }                                                                   // В 48 строке кода ошибка

    @Test
    public void payMoreBalanceTest() {
        SavingAccount account = new SavingAccount(100, 10, 200, 4);

        account.pay(101);

        Assertions.assertEquals(100, account.getBalance());     // Тест не проходит
    }                                                                   // В 48 строке кода ошибка

    @Test
    public void yearChangeTest() {
        SavingAccount account = new SavingAccount(
                200,
                100,
                10_000,
                15
        );

        account.yearChange();

        Assertions.assertEquals(30, account.getBalance());   // Тест не проходит
    }                                                                // В 89 строке кода ошибка

    /*   @Test
    public void yearChangeNegativePercentTest() {
        SavingAccount account = new SavingAccount(
                200,
                100,
                10_000,
                -5
        );

        account.yearChange();

        Assertions.assertEquals(0, account.getBalance());   // Тест не проходит
    }  */                                                              // В 89 строке кода ошибка

    @Test
    public void yearChangeZeroPercentTest() {
        SavingAccount account = new SavingAccount(
                200,
                100,
                10_000,
                0
        );

        account.yearChange();

        Assertions.assertEquals(0, account.getBalance());   // Тест не проходит
    }                                                                // В 89 строке кода ошибка
}