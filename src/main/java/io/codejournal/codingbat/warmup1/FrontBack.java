package io.codejournal.codingbat.warmup1;

public class FrontBack {

    public final String frontBack(final String str) {

        if (str.length() <= 1) {
            return str;
        } else {
            return str.substring(str.length() - 1) + str.substring(1, str.length() - 1) + str.substring(0, 1);
        }
    }
}
