package com.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class CurrencyAdditionTest {
    /*
    1. quickly add a test
    2. Run all tests and see the new on fail
    3. make a little change
    4. run all test and see them all succeed
    5. refactor to remove duplication
     */

    @Test
    public void testMixedAddition() {
        Expression fiveDollars = Money.dollar(5);
        Expression tenFrancs = Money.franc(10);
        Bank bank = new Bank();
        bank.addRate("CHF", "USD", 2);
        final Money result = bank.reduce(fiveDollars.plus(tenFrancs), "USD");
        assertEquals(Money.dollar(10), result);
    }

    @Test
    public void testSumPlusMoney() {
        Expression fiveDollars = Money.dollar(5);
        Expression tenFrancs = Money.franc(10);
        Bank bank = new Bank();
        bank.addRate("CHF", "USD", 2);
        final Expression sum = fiveDollars.plus(tenFrancs);
        final Money result = bank.reduce(sum.plus(Money.dollar(5)), "USD");
        assertEquals(Money.dollar(15), result);
    }

    @Test
    public void testSumTimes() {
        Expression fiveDollars = Money.dollar(5);
        Expression tenFrancs = Money.franc(10);
        Bank bank = new Bank();
        bank.addRate("CHF", "USD", 2);
        final Expression sum = fiveDollars.plus(tenFrancs);
        final Money result = bank.reduce(sum.times(2), "USD");
        assertEquals(Money.dollar(20), result);
    }


    @Test
    public void testExpressionConcept() throws Exception {
        // 5 + (2*5) = 5 + 10
        // 5 is an expression
        // 2*5 is an expression
        // 5 + 10 is an expression
        final Expression sum = Money.dollar(5).plus(Money.dollar(10));
        final Bank bank = new Bank();
        final Money reduced = bank.reduce(sum, "USD");
        assertEquals(Money.dollar(15), reduced);
    }

    @Test
    public void testMoneyReducing() throws Exception {
        final Bank bank = new Bank();
        final Money reduced = bank.reduce(Money.dollar(10), "USD");
        assertEquals(Money.dollar(10), reduced);
    }

    @Test
    public void testMoneyReducingToADifferentCurrency() throws Exception {
        final Bank bank = new Bank();
        bank.addRate("CHF", "USD", 2);
        final Money reduced = bank.reduce(Money.franc(2), "USD");
        assertEquals(Money.dollar(1), reduced);
    }

    @Test
    public void testHoldingRates() throws Exception {
        final Bank bank = new Bank();
        bank.addRate("CHF", "USD", 2);
        assertEquals(2,bank.rate("CHF", "USD"));
    }

    @Test
    public void testIdentity() throws Exception {
        final Bank bank = new Bank();
        assertEquals(1,bank.rate("USD", "USD"));
    }

    @Test
    public void testPlusReturnsSum() throws Exception {
        final Expression result = Money.dollar(5).plus(Money.dollar(10));
        final Sum sum = (Sum) result;
        assertEquals(Money.dollar(5), sum.money1);
        assertEquals(Money.dollar(10), sum.money2);
    }

    @Test
    public void testMultiplication() throws Exception {
        final Money five = Money.dollar(5);
        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15), five.times(3));
    }

    @Test
    public void testFrancMultiplication() throws Exception {
        final Money five = Money.franc(5);
        assertEquals(Money.franc(10), five.times(2));
        assertEquals(Money.franc(15), five.times(3));
    }

    @Test
    public void equals() throws Exception {
        assertTrue(Money.dollar(10).equals(Money.dollar(10)));
        assertFalse(Money.dollar(10).equals(Money.dollar(6)));
        assertTrue(Money.franc(10).equals(Money.franc(10)));
        assertFalse(Money.franc(10).equals(Money.franc(6)));
        assertFalse(Money.dollar(10).equals(Money.franc(10)));
        assertFalse(Money.franc(10).equals(Money.dollar(10)));
    }

    @Test
    public void testCurrency() throws Exception {
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
    }

    @Test
    public void differentClassEquality() {
        assertTrue(new Money(10, "CHF").equals(Money.franc(10)));
        assertTrue(Money.franc(10).equals(new Money(10, "CHF")));
    }
}