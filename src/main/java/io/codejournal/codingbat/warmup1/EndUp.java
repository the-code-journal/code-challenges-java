package io.codejournal.codingbat.warmup1;

public class EndUp {

    public final String endUp(final String str) {

        if (str.length() < 3) {
            return str.toUpperCase();
        }

        return str.substring(0, str.length() - 3) + str.substring(str.length() - 3).toUpperCase();
    }
}
