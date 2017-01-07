package com.example;

class Bank {
    Money reduce(final Expression expression, final String currencyTo) {
        if (expression instanceof Money) {
            return ((Money) expression).reduce(currencyTo);
        }
        final Sum sum = (Sum) expression;
        return sum.reduce(currencyTo);
    }
}
