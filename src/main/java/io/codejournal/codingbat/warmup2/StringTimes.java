package io.codejournal.codingbat.warmup2;

public class StringTimes {

    public String stringTimes(final String str, final int n) {

        final StringBuilder result = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            result.append(str);
        }

        return result.toString();
    }
}
