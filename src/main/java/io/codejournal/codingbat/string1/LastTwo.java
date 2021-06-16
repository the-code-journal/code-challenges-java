package io.codejournal.codingbat.string1;

import java.util.Optional;

public class LastTwo {

    public final String lastTwo(final String str) {

        final String strNormalized = Optional.ofNullable(str).orElse("");

        if (strNormalized.length() >= 2) {

            final int mid = strNormalized.length() - 2;

            return str.substring(0, mid) + str.substring(mid + 1) + str.substring(mid, mid + 1);
        }

        return strNormalized;
    }
}
