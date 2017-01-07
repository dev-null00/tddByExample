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
        return new Money(amount * multipleBy, currency);
    }

    static Franc franc(final int amount) {
        return new Franc(amount, "CHF");
    }

    String currency() {
        return currency;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        final Money money = (Money) o;
        return amount == money.amount &&
                Objects.equals(currency, money.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, currency);
    }
}
