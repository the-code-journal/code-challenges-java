package io.codejournal.codingbat.warmup2;

public class DoubleX {

    public boolean doubleX(final String str) {

        if (str == null || str.isEmpty()) {
            return false;
        }

        final int strLength = str.length();

        for (int i = 0; i < strLength - 1; i++) {
            if (str.charAt(i) == 'x') {
                return str.charAt(i + 1) == 'x';
            }
        }

        return false;
    }
}
