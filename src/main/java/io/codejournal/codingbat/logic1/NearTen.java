package io.codejournal.codingbat.logic1;

public class NearTen {

    public boolean nearTen(final int num) {

        final int remainder = num % 10;

        final int closeToTen = (remainder > 5) ? 10 - remainder : remainder;

        return (closeToTen <= 2);
    }
}
