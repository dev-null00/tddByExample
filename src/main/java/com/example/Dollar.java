package com.example;

class Dollar {
    int amount;

    Dollar(final int amount) {
        this.amount = amount;
    }

    Dollar times(final int multipleBy) {
        return new Dollar(amount * multipleBy);
    }
}
