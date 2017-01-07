package com.example;

class Dollar extends Money{
    Dollar(final int amount, final String currency) {
        super(amount, currency);
    }

    Money times(final int multipleBy) {
        return new Money(amount * multipleBy, currency);
    }

    String currency() {
        return currency;
    }
}
