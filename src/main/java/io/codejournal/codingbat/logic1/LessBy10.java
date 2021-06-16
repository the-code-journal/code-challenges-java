package io.codejournal.codingbat.logic1;

public class LessBy10 {

    public boolean lessBy10(final int a, final int b, final int c) {

        final int abDifference = Math.abs(a - b);
        final int bcDifference = Math.abs(b - c);
        final int acDifference = Math.abs(a - c);

        return (abDifference >= 10) || (bcDifference >= 10) || (acDifference >= 10);
    }
}
