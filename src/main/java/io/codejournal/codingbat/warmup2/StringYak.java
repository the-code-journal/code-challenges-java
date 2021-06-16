package io.codejournal.codingbat.warmup2;

public class StringYak {

    public String stringYak(final String str) {

        if (str == null) {
            return "";
        }

        if (str.isEmpty() || str.length() < 3) {
            return str;
        }

        return str.replaceAll("y[a-zA-Z0-9]{1}k", "");
    }
}
