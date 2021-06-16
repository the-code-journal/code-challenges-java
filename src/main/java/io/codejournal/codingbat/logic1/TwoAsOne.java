package io.codejournal.codingbat.logic1;

public class TwoAsOne {

    public boolean twoAsOne(final int a, final int b, final int c) {

        final int sum1and2 = a + b;
        final int sum2and3 = b + c;
        final int sum1and3 = a + c;

        return sum1and2 == c || sum2and3 == a || sum1and3 == b;
    }
}
