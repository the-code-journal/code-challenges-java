package io.codejournal.codingbat.warmup2;

public class StringBits {

    public String stringBits(final String str) {

        if (str == null || str.isEmpty()) {
            return "";
        }

        final StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i += 2) {
            result.append(str.charAt(i));
        }

        return result.toString();
    }
}
