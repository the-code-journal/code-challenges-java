package io.codejournal.codingbat.warmup2;

public class FrontTimes {

    public String frontTimes(final String str, final int n) {

        final StringBuilder result = new StringBuilder();

        if (str != null && !str.isEmpty()) {

            final String front = (str.length() < 3) ? str : str.substring(0, 3);

            for (int i = 1; i <= n; i++) {
                result.append(front);
            }
        }

        return result.toString();
    }
}
