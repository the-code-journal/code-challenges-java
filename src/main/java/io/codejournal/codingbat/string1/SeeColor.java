package io.codejournal.codingbat.string1;

import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SeeColor {

    public final String seeColor(final String str) {

        final String strNormalized = Optional.ofNullable(str).orElse("");

        final Pattern pattern = Pattern.compile("^(red|blue)");
        final Matcher matcher = pattern.matcher(strNormalized);

        return matcher.find() ? matcher.group(1) : "";
    }
}
