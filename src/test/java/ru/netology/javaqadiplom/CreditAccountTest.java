package ru.netology.javaqadiplom;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class CreditAccountTest {

    @Test
    public void testdAddWithZeroBalance() {
        CreditAccount account = new CreditAccount(
                0,
                5_000,
                15
        );

        account.add(3_000);

        assertEquals(3_000, account.getBalance());
    }

    @Test
    public void testAddWithPositiveBalance() {
        CreditAccount account = new CreditAccount(
                5,
                5_000,
                15
        );

        account.add(3_000);

        assertEquals(3_005, account.getBalance());
    }

    @Test
    public void testAddWithNegativeBalance() {
        CreditAccount account = new CreditAccount(
                -5,
                5_000,
                15
        );

        account.add(3_000);

        assertEquals(2_995, account.getBalance());
    }

    @Test
    public void testPayWithPositiveBalance() {
        CreditAccount account = new CreditAccount(
                5,
                5_000,
                15
        );

        account.pay(3_000);

        assertEquals(-2_995, account.getBalance());
    }

    @Test
    public void testPayWithZeroBalance() {
        CreditAccount account = new CreditAccount(
                0,
                5_000,
                15
        );

        account.pay(3_000);

        assertEquals(-3_000, account.getBalance());
    }

    @Test
    public void testPayWithNegativeBalance() {
        CreditAccount account = new CreditAccount(
                -5,
                5_000,
                15
        );

        account.pay(3_000);

        assertEquals(-3_005, account.getBalance());
    }

    @Test
    public void testyearChangePositiveBalance() {
        CreditAccount account = new CreditAccount(
                200,
                5_000,
                15
        );
        assertEquals(0, account.yearChange());
    }

    @Test
    public void testyearChangeNegativeBalance() {
        CreditAccount account = new CreditAccount(
                -200,
                5_000,
                15
        );
        assertEquals(-30, account.yearChange());
    }

    @Test
    public void testyearChangeZeroBalance() {
        CreditAccount account = new CreditAccount(
                0,
                5_000,
                15
        );
        assertEquals(0, account.yearChange());
    }

}