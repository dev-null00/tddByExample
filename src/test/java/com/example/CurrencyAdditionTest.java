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

    /*
    TODO
    $5 + 10 CHF = $10 if CHF:USD is 2:1
    Make "amount" private
    Money rounding?
    Equals()
    Hashcode()
     */
    @Test
    public void testMultiplication() throws Exception {
        final Dollar five = new Dollar(5);
        final Dollar ten = five.times(2);
        assertEquals(10, ten.amount);
        final Dollar fifteen = five.times(3);
        assertEquals(15, fifteen.amount);
    }

    @Test
    public void equals() throws Exception {
        assertTrue(new Dollar(10).equals(new Dollar(10)));
        assertFalse(new Dollar(10).equals(new Dollar(6)));
    }
}