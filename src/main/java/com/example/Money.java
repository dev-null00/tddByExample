package com.example;

import java.util.Objects;

class Money implements Expression{
    final int amount;
    final String currency;

    Money(final int amount, final String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    static Money dollar(final int amount) {
        return new Money(amount, "USD");
    }

    public Expression times(final int multipleBy) {
        return new Money(amount * multipleBy, currency);
    }

    static Money franc(final int amount) {
        return new Money(amount, "CHF");
    }

    String currency() {
        return currency;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        final Money money = (Money) o;
        return amount == money.amount &&
                Objects.equals(currency, money.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, currency);
    }

    public Expression plus(final Expression money) {
        return new Sum(this, money);
    }

    public Money reduce(final Bank bank, final String currencyTo) {
        final int rate = bank.rate(currency, currencyTo);
        return new Money(amount/rate, currencyTo);
    }
}
