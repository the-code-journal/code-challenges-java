package io.codejournal.codingbat.warmup2;

public class StringSplosion {

    public String stringSplosion(final String str) {

        if (str == null || str.isEmpty()) {
            return "";
        }

        final StringBuilder result = new StringBuilder();

        for (int i = 0; i <= str.length(); i++) {
            result.append(str.substring(0, i));
        }

        return result.toString();
    }
}
