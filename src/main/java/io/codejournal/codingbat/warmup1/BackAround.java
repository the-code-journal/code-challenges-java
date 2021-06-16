package io.codejournal.codingbat.warmup1;

public class BackAround {

    public final String backAround(final String str) {

        final String prefixSuffix;

        if (str.length() >= 1) {
            prefixSuffix = str.substring(str.length() - 1);
        } else {
            prefixSuffix = str;
        }

        return prefixSuffix + str + prefixSuffix;
    }
}
