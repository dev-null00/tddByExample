package com.example;

import java.util.Objects;

class Franc extends Money{
    private final String currency;
    Franc(final int amount) {
        this.amount = amount;
        this.currency = "CHF";
    }

    Franc times(final int multipleBy) {
        return Money.franc(amount * multipleBy);
    }

    String currency() {
        return currency;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Money money = (Money) o;
        return amount == money.amount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }
}
