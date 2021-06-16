package io.codejournal.codingbat.logic1;

public class InOrder {

    public boolean inOrder(final int a, final int b, final int c, final boolean bOk) {

        if (bOk) {
            return (b < c);
        } else {
            return (a < b) && (b < c);
        }
    }
}
