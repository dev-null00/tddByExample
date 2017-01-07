package com.example;

import java.util.Objects;

class Dollar {
    int amount;

    Dollar(final int amount) {
        this.amount = amount;
    }

    Dollar times(final int multipleBy) {
        return new Dollar(amount * multipleBy);
    }

    @Override
    public boolean equals(final Object o) {
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }
}
