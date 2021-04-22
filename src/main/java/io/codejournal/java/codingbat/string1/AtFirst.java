package io.codejournal.java.codingbat.string1;

public class AtFirst {

    public final String atFirst(final String str) {

        if (str == null || str.isEmpty()) {
            return "@@";
        }

        if (str.length() == 1) {
            return str.substring(0, 1) + "@";
        }

        return str.substring(0, 2);
    }
}
