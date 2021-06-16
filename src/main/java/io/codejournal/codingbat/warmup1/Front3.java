package io.codejournal.codingbat.warmup1;

public class Front3 {

    public final String front3(final String str) {

        final String front;

        if (str.length() < 3) {
            front = str;
        } else {
            front = str.substring(0, 3);
        }

        return front + front + front;
    }
}
