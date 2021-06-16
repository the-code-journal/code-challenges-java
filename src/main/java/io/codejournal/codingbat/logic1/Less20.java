package io.codejournal.codingbat.logic1;

public class Less20 {

    public boolean less20(final int n) {

        final int remainder = n % 20;
        final int twentyMinusRemainder = Math.abs(20 - remainder);

        return twentyMinusRemainder == 1 || twentyMinusRemainder == 2;
    }
}
