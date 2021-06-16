package io.codejournal.codingbat.string1;

import java.util.Optional;

public class TheEnd {

    public final String theEnd(final String str, final boolean front) {

        final String s = Optional.ofNullable(str).orElse("");

        final String frontChar = s.substring(0, Math.min(s.length(), 1));
        final String lastChar = s.substring(Math.max(0, s.length() - 1));

        return (front) ? frontChar : lastChar;
    }
}
