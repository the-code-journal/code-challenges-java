package io.codejournal.codingbat.warmup1;

public class Front22 {

    public final String front22(final String str) {

        final String prefixSuffix;

        if (str.length() >= 2) {
            prefixSuffix = str.substring(0, 2);
        } else {
            prefixSuffix = str;
        }

        return prefixSuffix + str + prefixSuffix;
    }
}
