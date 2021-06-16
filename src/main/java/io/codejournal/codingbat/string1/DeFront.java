package io.codejournal.codingbat.string1;

import java.util.Optional;

public class DeFront {

    public final String deFront(final String str) {

        final String strNormalized = Optional.ofNullable(str).orElse("");

        final String first = (strNormalized.length() > 0 && 'a' == strNormalized.charAt(0)) ? "a" : "";
        final String second = (strNormalized.length() > 1 && 'b' == strNormalized.charAt(1)) ? "b" : "";
        final String rest = (strNormalized.length() > 2) ? strNormalized.substring(2) : "";

        return first + second + rest;
    }
}
