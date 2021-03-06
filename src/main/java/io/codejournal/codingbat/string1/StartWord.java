package io.codejournal.codingbat.string1;

import java.util.Optional;

public class StartWord {

    public final String startWord(final String str, final String word) {

        final String strNormalized = Optional.ofNullable(str).orElse("");
        final String wordNormalized = Optional.ofNullable(word).orElse("");

        if (strNormalized.length() == 0 || wordNormalized.length() == 0) {
            return "";
        } else if (strNormalized.length() == 1 && wordNormalized.length() == 1) {
            return strNormalized;
        } else if (strNormalized.length() == 1) {
            return "";
        }

        final String search = wordNormalized.substring(1);

        final int startIndex = 1;
        final int endIndex = Math.min(strNormalized.length(), 1 + search.length());

        final String text = strNormalized.substring(startIndex, endIndex);

        final String matchedText = wordNormalized.length() > 1 ? text : "";

        return text.equals(search) ? strNormalized.charAt(0) + matchedText : "";
    }
}
