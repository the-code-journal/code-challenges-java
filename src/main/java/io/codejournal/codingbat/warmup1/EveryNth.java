package io.codejournal.codingbat.warmup1;

public class EveryNth {

    public final String everyNth(final String str, final int n) {

        if (str.length() < n) {
            return str.charAt(0) + "";
        }

        String output = str.charAt(0) + "";

        for (int i = 1; (i * n) < str.length(); i++) {
            output += str.charAt(i * n);
        }

        return output;
    }
}
