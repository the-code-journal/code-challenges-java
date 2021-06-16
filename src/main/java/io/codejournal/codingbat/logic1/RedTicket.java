package io.codejournal.codingbat.logic1;

public class RedTicket {

    public int redTicket(final int a, final int b, final int c) {

        if (allSame(a, b, c) && (a == 2)) {
            return 10;
        } else if (allSame(a, b, c)) {
            return 5;
        } else if ((a != b) && (a != c)) {
            return 1;
        }

        return 0;
    }

    private boolean allSame(final int a, final int b, final int c) {
        return (a == b) && (b == c);
    }
}
