package io.codejournal.java.codingbat.warmup1;

public class LastDigit {

    public final boolean lastDigit(final int a, final int b) {

        final int lastDigitA = a % 10;
        final int lastDigitB = b % 10;

        return (lastDigitA == lastDigitB);
    }
}
