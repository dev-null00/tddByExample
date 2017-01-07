package com.example;

class Bank {
    Money reduce(final Expression expression, final String currencyTo) {
        return expression.reduce(currencyTo);
    }
}
