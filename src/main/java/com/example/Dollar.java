package com.example;

class Dollar {
    int amount;

    Dollar(final int amount) {
        this.amount = amount;
    }

    void times(final int multipleBy) {
        amount = amount * multipleBy;
    }
}
