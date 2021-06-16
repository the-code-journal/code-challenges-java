package io.codejournal.codingbat.logic1;

public class GreenTicket {

    public int greenTicket(final int a, final int b, final int c) {

        if ((a == b) && (b == c)) {
            return 20;
        } else if ((a == b) || (b == c) || (a == c)) {
            return 10;
        } else {
            return 0;
        }
    }
}
