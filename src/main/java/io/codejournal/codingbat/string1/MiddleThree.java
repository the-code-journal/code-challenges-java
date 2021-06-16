package io.codejournal.codingbat.string1;

public class MiddleThree {

    public final String middleThree(final String str) {

        if (str == null || str.isEmpty() || str.length() % 2 == 0) {
            return "";
        }

        final int index = (str.length() - 3) / 2;

        return str.substring(index, index + 3);
    }
}
