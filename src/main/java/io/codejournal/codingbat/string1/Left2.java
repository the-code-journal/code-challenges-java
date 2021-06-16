package io.codejournal.codingbat.string1;

import java.util.Optional;

public class Left2 {

    public final String left2(final String str) {

        final String returnStr = Optional.ofNullable(str).orElse("");

        if (returnStr.length() <= 2) {
            return returnStr;
        }

        return returnStr.substring(2) + returnStr.substring(0, 2);
    }
}
