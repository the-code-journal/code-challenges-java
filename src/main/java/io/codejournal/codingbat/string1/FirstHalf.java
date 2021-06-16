package io.codejournal.codingbat.string1;

public class FirstHalf {

    public final String firstHalf(final String str) {

        if (str == null || str.isEmpty()) {
            return "";
        }

        return str.substring(0, (int) Math.ceil(str.length() / 2.0));
    }
}
