package io.codejournal.codingbat.string1;

import java.util.Optional;

public class Without2 {

    public final String without2(final String str) {

        final String strNormalized = Optional.ofNullable(str).orElse("");

        if (strNormalized.length() == 0 || strNormalized.length() == 2) {
            return "";
        }

        if (strNormalized.length() > 2
                && strNormalized.substring(0, 2).equals(strNormalized.substring(strNormalized.length() - 2))) {
            return strNormalized.substring(2);
        }

        return strNormalized;
    }
}
