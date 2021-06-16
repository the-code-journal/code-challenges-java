package io.codejournal.codingbat.logic1;

public class BlueTicket {

    public int blueTicket(final int a, final int b, final int c) {

        final int ab = a + b;
        final int bc = b + c;
        final int ac = a + c;

        if ((ab == 10) || (bc == 10) || (ac == 10)) {
            return 10;
        } else if ((ab == (bc + 10)) || (ab == (ac + 10))) {
            return 5;
        } else {
            return 0;
        }
    }
}
