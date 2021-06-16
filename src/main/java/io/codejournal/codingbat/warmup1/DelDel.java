package io.codejournal.codingbat.warmup1;

public class DelDel {

    public final String delDel(final String str) {

        if (str.length() >= 4 && "del".equals(str.substring(1, 4))) {
            return str.substring(0, 1) + str.substring(4);
        } else {
            return str;
        }
    }
}
