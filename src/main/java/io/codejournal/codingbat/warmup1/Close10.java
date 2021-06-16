package io.codejournal.codingbat.warmup1;

public class Close10 {

    public final int close10(final int a, final int b) {

        final int closeA = Math.abs(10 - a);
        final int closeB = Math.abs(10 - b);

        if (closeA < closeB) {
            return a;
        }

        if (closeA > closeB) {
            return b;
        }

        return 0;
    }
}
