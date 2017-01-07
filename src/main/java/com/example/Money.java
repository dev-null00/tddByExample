package com.example;

abstract class Money {
    int amount;

    static Dollar dollar(final int amount) {
        return new Dollar(amount, "USD");
    }

    abstract Money times(final int multipleBy);

    static Franc franc(final int amount) {
        return new Franc(amount, "CHF");
    }

    abstract String currency();
}
