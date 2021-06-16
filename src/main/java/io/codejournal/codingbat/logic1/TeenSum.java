package io.codejournal.codingbat.logic1;

public class TeenSum {

    public int teenSum(final int a, final int b) {

        final boolean aIsTeen = (a >= 13 && a <= 19);
        final boolean bIsTeen = (b >= 13 && b <= 19);

        return (aIsTeen || bIsTeen) ? 19 : a + b;
    }
}
