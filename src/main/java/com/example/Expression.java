package com.example;

interface Expression {
    Money reduce(final Bank bank, final String currencyTo);
    Expression plus(Expression expression);
}
