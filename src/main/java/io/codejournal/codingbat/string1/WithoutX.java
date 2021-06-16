package io.codejournal.codingbat.string1;

import java.util.Optional;

public class WithoutX {

    public final String withoutX(final String str) {
        return Optional
                .ofNullable(str)
                .orElse("")
                .replaceAll("^x", "")
                .replaceAll("x$", "");
    }
}
