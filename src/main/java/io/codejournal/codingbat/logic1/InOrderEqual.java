package io.codejournal.codingbat.logic1;

public class InOrderEqual {

    public boolean inOrderEqual(final int a, final int b, final int c, final boolean equalOk) {

        if (equalOk) {
            return (a <= b) && (b <= c);
        } else {
            return (a < b) && (b < c);
        }
    }
}
