package com.example;

class Sum implements Expression{
    final Money money1;
    final Money money2;

    Sum(final Money money1, final Money money2) {
        this.money1 = money1;
        this.money2 = money2;
    }

    public Money reduce(final Bank bank, final String currencyTo) {
        final int total = money1.amount + money2.amount;
        return new Money(total, currencyTo);
    }
}
