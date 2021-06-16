package io.codejournal.codingbat.string1;

import java.util.Optional;

public class FrontAgain {

    public final boolean frontAgain(final String str) {

        final String strNormalized = Optional.ofNullable(str).orElse("");

        if (strNormalized.length() >= 2) {

            final String firstTwo = strNormalized.substring(0, 2);
            final String lastTwo = strNormalized.substring(strNormalized.length() - 2);

            return firstTwo.equals(lastTwo);
        }

        return false;
    }
}
