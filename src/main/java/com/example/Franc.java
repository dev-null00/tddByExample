package com.example;

import java.util.Objects;

class Franc {
    private int amount;

    Franc(final int amount) {
        this.amount = amount;
    }

    Franc times(final int multipleBy) {
        return new Franc(amount * multipleBy);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Franc franc = (Franc) o;
        return amount == franc.amount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }
}
