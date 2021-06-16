package io.codejournal.codingbat.warmup1;

public class LoneTeen {

    public final boolean loneTeen(final int a, final int b) {
        return (13 <= a && a <= 19) ^ (13 <= b && b <= 19);
    }
}
