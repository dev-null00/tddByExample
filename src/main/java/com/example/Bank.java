package com.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Bank {
    private final Map<Pair, Integer> exchangeRates = new HashMap<>();
    Money reduce(final Expression expression, final String currencyTo) {
        return expression.reduce(this, currencyTo);
    }

    void addRate(final String from, final String to, final int rate) {
        exchangeRates.put(new Pair(from, to), rate);
    }

    int rate(final String from, final String to) {
        if(from.equals(to)) return 1;
        return exchangeRates.get(new Pair(from, to));
    }

    private class Pair {
        private final String from;
        private final String to;

        private Pair(final String from, final String to) {
            this.from = from;
            this.to = to;
        }

        @Override
        public boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            final Pair pair = (Pair) o;
            return Objects.equals(from, pair.from) &&
                    Objects.equals(to, pair.to);
        }

        @Override
        public int hashCode() {
            return Objects.hash(from, to);
        }
    }
}
