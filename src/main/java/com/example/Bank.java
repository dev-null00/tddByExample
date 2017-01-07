package com.example;

class Bank {
    Money reduce(final Expression expression, final String currency) {
        final Sum sum = (Sum) expression;
        final int total = sum.money1.amount + sum.money2.amount;
        return new Money(total, currency);
    }
}
