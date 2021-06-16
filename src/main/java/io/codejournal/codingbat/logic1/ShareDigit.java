package io.codejournal.codingbat.logic1;

import java.util.Arrays;

public class ShareDigit {

    public boolean shareDigit(final int a, final int b) {

        final String[] aDigits = (a + "").split("");
        final String[] bDigits = (b + "").split("");

        Arrays.sort(aDigits);
        Arrays.sort(bDigits);

        boolean match = false;

        int i = 0;
        int j = 0;

        boolean iIsNotAtEnd = true;
        boolean jIsNotAtEnd = true;

        while (iIsNotAtEnd || jIsNotAtEnd) {

            final String digitA = aDigits[i];
            final String digitB = bDigits[j];

            final int comparison = digitA.compareTo(digitB);

            iIsNotAtEnd = (i != aDigits.length - 1);
            jIsNotAtEnd = (j != bDigits.length - 1);

            if (comparison == 0) {
                match = true;
                break;
            }

            if (comparison < 0 && iIsNotAtEnd) {
                i++;
            } else if (comparison < 0 && !iIsNotAtEnd && jIsNotAtEnd) {
                j++;
            }

            if (comparison > 0 && jIsNotAtEnd) {
                j++;
            } else if (comparison > 0 && !jIsNotAtEnd && iIsNotAtEnd) {
                i++;
            }
        }

        return match;
    }
}
