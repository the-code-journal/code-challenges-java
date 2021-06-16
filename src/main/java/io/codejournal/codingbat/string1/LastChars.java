package io.codejournal.codingbat.string1;

import java.util.Optional;

public class LastChars {

    public final String lastChars(final String a, final String b) {

        final String aNormalized = Optional.ofNullable(a).filter(s -> !s.isEmpty()).orElse("@");
        final String bNormalized = Optional.ofNullable(b).filter(s -> !s.isEmpty()).orElse("@");

        return String.valueOf(aNormalized.charAt(0)) + String.valueOf(bNormalized.charAt(bNormalized.length() - 1));
    }
}
