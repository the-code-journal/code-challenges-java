package io.codejournal.codingbat.warmup1;

public class NearHundred {

    public final boolean nearHundred(final int n) {
        return (Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10);
    }
}
