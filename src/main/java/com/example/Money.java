package com.example;

import java.util.Objects;

class Money {
    final int amount;
    final String currency;

    Money(final int amount, final String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    static Dollar dollar(final int amount) {
        return new Dollar(amount, "USD");
    }

    Money times(final int multipleBy) {
        return null;
    }

    static Franc franc(final int amount) {
        return new Franc(amount, "CHF");
    }

    String currency() {
        return currency;
    }
}
