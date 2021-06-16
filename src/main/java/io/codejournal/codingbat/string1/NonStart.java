package io.codejournal.codingbat.string1;

import java.util.Optional;

public class NonStart {

    public final String nonStart(final String a, final String b) {

        final String strA = Optional.ofNullable(a).orElse("");
        final String strB = Optional.ofNullable(b).orElse("");

        final String resultA = strA.substring(Math.min(strA.length(), 1));
        final String resultB = strB.substring(Math.min(strB.length(), 1));

        return resultA + resultB;
    }
}
