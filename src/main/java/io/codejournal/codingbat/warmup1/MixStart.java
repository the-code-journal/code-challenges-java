package io.codejournal.codingbat.warmup1;

public class MixStart {

    public final boolean mixStart(final String str) {
        return (str.length() >= 3 && str.substring(1, 3).equals("ix"));
    }
}
