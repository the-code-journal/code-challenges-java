package io.codejournal.codingbat.warmup1;

public class PosNeg {

    public final boolean posNeg(final int a, final int b, final boolean negative) {

        if (negative) {
            return (a < 0 && b < 0);
        } else {
            return (a < 0 && b >= 0) || (a >= 0 && b < 0);
        }
    }
}
