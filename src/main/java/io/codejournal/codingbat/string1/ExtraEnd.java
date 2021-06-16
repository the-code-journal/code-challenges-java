package io.codejournal.codingbat.string1;

public class ExtraEnd {

    public final String extraEnd(final String str) {

        if (str == null || str.isEmpty()) {
            return "";
        }

        final String suffix = str.substring(Math.max(str.length() - 2, 0));

        final StringBuilder result = new StringBuilder();

        for (int i = 3; i > 0; i--) {
            result.append(suffix);
        }

        return result.toString();
    }
}
