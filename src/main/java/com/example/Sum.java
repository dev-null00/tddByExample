package com.example;

class Sum implements Expression{
    final Expression money1;
    final Expression money2;

    Sum(final Expression money1, final Expression money2) {
        this.money1 = money1;
        this.money2 = money2;
    }

    public Money reduce(final Bank bank, final String currencyTo) {
        final int total = bank.reduce(money1, currencyTo).amount + bank.reduce(money2, currencyTo).amount;
        return new Money(total, currencyTo);
    }

    @Override
    public Expression plus(final Expression expression) {
        return new Sum(this, expression);
    }

    @Override
    public Expression times(final int multipleBy) {
        return new Sum(money1.times(multipleBy), money2.times(multipleBy));
    }
}
