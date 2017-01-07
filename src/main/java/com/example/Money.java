package com.example;

abstract class Money {
    int amount;

    static Dollar dollar(final int amount) {
        return new Dollar(amount);
    }

    abstract Money times(final int multipleBy);

    static Franc franc(final int amount) {
        return new Franc(amount);
    }

    abstract String currency();
}
