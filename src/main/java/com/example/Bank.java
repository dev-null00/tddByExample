package com.example;

class Bank {
    Money reduce(final Expression expression, final String currencyTo) {
        final Sum sum = (Sum) expression;
        return sum.reduce(currencyTo);
    }
}
