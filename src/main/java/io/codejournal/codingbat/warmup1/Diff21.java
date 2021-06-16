package io.codejournal.codingbat.warmup1;

public class Diff21 {

    public final int diff21(final int n) {

        final int diff = n - 21;

        return (diff >= 0) ? (2 * diff) : -(diff);
    }
}
