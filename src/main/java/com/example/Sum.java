package com.example;

class Sum implements Expression{
    final Money money1;
    final Money money2;

    Sum(final Money money1, final Money money2) {
        this.money1 = money1;
        this.money2 = money2;
    }
}
