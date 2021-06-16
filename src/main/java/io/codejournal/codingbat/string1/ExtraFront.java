package io.codejournal.codingbat.string1;

import java.util.Optional;

public class ExtraFront {

    public final String extraFront(final String str) {

        final String strNormalized = Optional.ofNullable(str).orElse("");

        final int endIndex = Math.min(strNormalized.length(), 2);

        return strNormalized.substring(0, endIndex)
                + strNormalized.substring(0, endIndex)
                + strNormalized.substring(0, endIndex);
    }
}
