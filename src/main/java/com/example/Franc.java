package com.example;

class Franc extends Money{
    Franc(final int amount, final String currency) {
        super(amount, currency);
    }

    Franc times(final int multipleBy) {
        return new Franc(amount * multipleBy, "CHF");
    }

    String currency() {
        return currency;
    }
}
