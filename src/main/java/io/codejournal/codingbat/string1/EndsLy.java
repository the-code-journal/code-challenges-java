package io.codejournal.codingbat.string1;

import java.util.Optional;

public class EndsLy {

    public final boolean endsLy(final String str) {
        return Optional.ofNullable(str).orElse("").endsWith("ly");
    }
}
