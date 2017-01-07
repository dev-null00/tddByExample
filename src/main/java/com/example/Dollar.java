package com.example;

import java.util.Objects;

class Dollar {
    private int amount;

    Dollar(final int amount) {
        this.amount = amount;
    }

    Dollar times(final int multipleBy) {
        return new Dollar(amount * multipleBy);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Dollar dollar = (Dollar) o;
        return amount == dollar.amount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }
}
