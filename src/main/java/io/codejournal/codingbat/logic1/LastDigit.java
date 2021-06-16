package io.codejournal.codingbat.logic1;

public class LastDigit {

    public boolean lastDigit(final int a, final int b, final int c) {

        final int aLastDigit = a % 10;
        final int bLastDigit = b % 10;
        final int cLastDigit = c % 10;

        return (aLastDigit == bLastDigit) || (bLastDigit == cLastDigit) || (aLastDigit == cLastDigit);
    }
}
