package io.codejournal.codingbat.logic1;

import java.util.Optional;

public class FizzString {

    public String fizzString(final String str) {

        final String strNormalized = Optional.ofNullable(str).orElse("");

        if (strNormalized.isEmpty()) {
            return strNormalized;
        }

        final char firstChar = str.charAt(0);
        final char lastChar = str.charAt(str.length() - 1);

        final StringBuilder result = new StringBuilder();

        if (firstChar == 'f' || firstChar == 'F') {
            result.append("Fizz");
        }

        if (lastChar == 'b' || lastChar == 'B') {
            result.append("Buzz");
        }

        return result.toString().isEmpty() ? str : result.toString();
    }
}
