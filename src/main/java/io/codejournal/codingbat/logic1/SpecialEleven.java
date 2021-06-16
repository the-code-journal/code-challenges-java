package io.codejournal.codingbat.logic1;

public class SpecialEleven {

    private static final int ELEVEN = 11;

    public boolean specialEleven(final int n) {

        final int remainder = n % ELEVEN;

        return (remainder == 0) || (remainder == 1);
    }
}
