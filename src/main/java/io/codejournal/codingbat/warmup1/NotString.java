package io.codejournal.codingbat.warmup1;

public class NotString {

    public final String notString(final String str) {

        if (str.startsWith("not")) {
            return str;
        } else {
            return "not " + str;
        }
    }
}
