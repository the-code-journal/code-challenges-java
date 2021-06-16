package io.codejournal.codingbat.warmup1;

public class IcyHot {

    public final boolean icyHot(final int temp1, final int temp2) {
        return (temp1 < 0 && temp2 > 100) || (temp2 < 0 && temp1 > 100);
    }
}
