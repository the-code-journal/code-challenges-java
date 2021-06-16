package io.codejournal.codingbat.warmup1;

public class Max1020 {

    public final int max1020(final int a, final int b) {

        final boolean isAinRange = (10 <= a && a <= 20);
        final boolean isBinRange = (10 <= b && b <= 20);

        int max = 0;

        if (isAinRange && a > max) {
            max = a;
        }

        if (isBinRange && b > max) {
            max = b;
        }

        return max;
    }
}
