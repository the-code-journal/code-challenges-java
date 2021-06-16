package io.codejournal.codingbat.string1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HasBad {

    public final boolean hasBad(final String str) {

        if (str == null || str.isEmpty() || str.length() < 3) {
            return false;
        }

        final Pattern pattern = Pattern.compile("^.{0,1}bad");
        final Matcher matcher = pattern.matcher(str);

        return matcher.find();
    }
}
