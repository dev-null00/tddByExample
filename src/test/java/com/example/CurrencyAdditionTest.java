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
    $5 * 2 = $10
     */
    @Test
    public void testMultiplication() throws Exception {
        final Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
    }

}