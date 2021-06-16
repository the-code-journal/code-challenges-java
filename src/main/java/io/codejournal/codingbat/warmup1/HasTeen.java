package io.codejournal.codingbat.warmup1;

public class HasTeen {

    public final boolean hasTeen(final int a, final int b, final int c) {
        return (13 <= a && a <= 19) || (13 <= b && b <= 19) || (13 <= c && c <= 19);
    }
}
