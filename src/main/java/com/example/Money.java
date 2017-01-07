package com.example;

abstract class Money {
    final int amount;
    final String currency;

    Money(final int amount, final String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    static Dollar dollar(final int amount) {
        return new Dollar(amount, "USD");
    }

    abstract Money times(final int multipleBy);

    static Franc franc(final int amount) {
        return new Franc(amount, "CHF");
    }

    abstract String currency();
}
