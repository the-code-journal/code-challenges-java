package io.codejournal.codingbat.string1;

import java.util.Optional;

public class ComboString {

    public final String comboString(final String a, final String b) {

        final String strA = Optional.ofNullable(a).orElse("");
        final String strB = Optional.ofNullable(b).orElse("");

        String shortStr = "";
        String longStr = "";

        if (strA.length() <= strB.length()) {
            shortStr = strA;
            longStr = strB;
        } else {
            shortStr = strB;
            longStr = strA;
        }

        return shortStr + longStr + shortStr;
    }
}
