package io.codejournal.codingbat.string1;

import java.util.Optional;

public class WithoutEnd2 {

    public final String withouEnd2(final String str) {

        final String s = Optional.ofNullable(str).orElse("");

        if (s.length() <= 2) {
            return "";
        }

        final int beginIndex = Math.min(s.length(), 1);
        final int endIndex = Math.max(0, s.length() - 1);

        return s.substring(beginIndex, endIndex);
    }
}
