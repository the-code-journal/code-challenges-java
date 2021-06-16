package io.codejournal.codingbat.string1;

import java.util.Optional;

public class ConCat {

    public final String conCat(final String a, final String b) {

        final String aNormalized = Optional.ofNullable(a).orElse("");
        final String bNormalized = Optional.ofNullable(b).orElse("");

        if (aNormalized.length() > 0 && bNormalized.length() > 0
                && (aNormalized.charAt(aNormalized.length() - 1) == bNormalized.charAt(0))) {
            return aNormalized.substring(0, aNormalized.length() - 1) + bNormalized;
        }

        return aNormalized + bNormalized;
    }
}
