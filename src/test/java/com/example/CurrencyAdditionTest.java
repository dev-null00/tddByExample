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
    Money rounding?
    Dollar/Franc duplication
    Common times
     */
    @Test
    public void testMultiplication() throws Exception {
        final Dollar five = new Dollar(5);
        assertEquals(new Dollar(10), five.times(2));
        assertEquals(new Dollar(15), five.times(3));
    }

    @Test
    public void testFrancMultiplication() throws Exception {
        final Franc five = new Franc(5);
        assertEquals(new Franc(10), five.times(2));
        assertEquals(new Franc(15), five.times(3));
    }

    @Test
    public void equals() throws Exception {
        assertTrue(new Dollar(10).equals(new Dollar(10)));
        assertFalse(new Dollar(10).equals(new Dollar(6)));
        assertTrue(new Franc(10).equals(new Franc(10)));
        assertFalse(new Franc(10).equals(new Franc(6)));
        assertFalse(new Dollar(10).equals(new Franc(10)));
    }
}