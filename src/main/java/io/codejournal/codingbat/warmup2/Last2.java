package io.codejournal.codingbat.warmup2;

public class Last2 {

    public int last2(final String str) {

        if (str == null || str.isEmpty() || str.length() < 2) {
            return 0;
        }

        final int strLength = str.length();
        final String last2 = str.substring(strLength - 2, strLength);

        int count = 0;

        for (int i = 0; i < strLength - 2; i++) {
            final String currentSubstring = str.substring(i, i + 2);

            if (currentSubstring.equals(last2)) {
                count++;
            }
        }

        return count;
    }
}
