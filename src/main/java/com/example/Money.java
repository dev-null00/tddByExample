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

    Money times(final int multipleBy) {
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

    Expression plus(final Money money) {
        return new Sum(this, money);
    }

    public Money reduce(final String currencyTo) {
        Integer rate = null;
        if ("CHF".equals(currency) && "USD".equals(currencyTo)) {
            rate = 2;
        }
        else {
            rate = 1;
        }

        return new Money(amount/rate, currencyTo);
    }
}
