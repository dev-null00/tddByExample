package com.example;

import java.util.Objects;

class Dollar extends Money{

    Dollar(final int amount) {
        this.amount = amount;
    }

    Dollar times(final int multipleBy) {
        return Money.dollar(amount * multipleBy);
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
