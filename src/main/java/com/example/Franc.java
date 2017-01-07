package com.example;

import java.util.Objects;

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

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        final Money money = (Money) o;
        return amount == money.amount && currency == money.currency;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }
}
