package io.codejournal.codingbat.string1;

public class FirstTwo {

    public final String firstTwo(final String str) {

        if (str == null || str.isEmpty()) {
            return "";
        }

        return str.substring(0, Math.min(str.length(), 2));
    }
}
