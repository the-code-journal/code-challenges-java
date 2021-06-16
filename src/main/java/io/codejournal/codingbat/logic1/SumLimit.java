package io.codejournal.codingbat.logic1;

public class SumLimit {

    public int sumLimit(final int a, final int b) {

        final int aLength = String.valueOf(a).length();

        final int sum = a + b;

        final int sumLength = String.valueOf(sum).length();

        return (sumLength != aLength) ? a : sum;
    }
}
