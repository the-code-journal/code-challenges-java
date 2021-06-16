package io.codejournal.codingbat.string1;

import java.util.Optional;

public class Right2 {

    public final String right2(final String str) {

        final String returnStr = Optional.ofNullable(str).orElse("");

        if (returnStr.length() <= 2) {
            return returnStr;
        }

        return returnStr.substring(returnStr.length() - 2) + returnStr.substring(0, returnStr.length() - 2);
    }
}
