package io.codejournal.codingbat.warmup2;

public class StringMatch {

    public int stringMatch(final String a, final String b) {

        if (a == null || a.isEmpty() || b == null || b.isEmpty()) {
            return 0;
        }

        final int loopCounter = Math.min(a.length(), b.length());

        int totalMatches = 0;

        for (int i = 0; i < loopCounter - 1; i++) {

            final String subStringA = a.substring(i, i + 2);
            final String subStringB = b.substring(i, i + 2);

            if (subStringA.equals(subStringB)) {
                totalMatches++;
            }
        }

        return totalMatches;
    }
}
