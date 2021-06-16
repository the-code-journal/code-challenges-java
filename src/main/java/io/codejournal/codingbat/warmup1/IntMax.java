package io.codejournal.codingbat.warmup1;

public class IntMax {

    public final int intMax(final int a, final int b, final int c) {

        int max = (a > b) ? a : b;

        if (c > max) {
            max = c;
        }

        return max;
    }
}
