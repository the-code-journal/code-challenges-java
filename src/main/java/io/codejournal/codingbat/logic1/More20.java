package io.codejournal.codingbat.logic1;

public class More20 {

    public boolean more20(final int n) {

        final int remainder = n % 20;

        return remainder == 1 || remainder == 2;
    }
}
