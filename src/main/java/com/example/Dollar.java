package com.example;

class Dollar extends Money{
    Dollar(final int amount, final String currency) {
        super(amount, currency);
    }

    Dollar times(final int multipleBy) {
        return Money.dollar(amount * multipleBy);
    }

    String currency() {
        return currency;
    }
}
