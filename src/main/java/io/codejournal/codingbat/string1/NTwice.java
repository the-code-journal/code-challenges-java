package io.codejournal.codingbat.string1;

public class NTwice {

    public final String nTwice(final String str, final int n) {

        if (str == null || str.length() == 0) {
            return "";
        }

        if (str.length() < n) {
            throw new IllegalArgumentException("Length of the final String is too short");
        }

        final String front = str.substring(0, n);
        final String end = str.substring(str.length() - n);

        return front + end;
    }
}
