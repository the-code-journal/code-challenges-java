package io.codejournal.codingbat.string1;

public class MakeTags {

    public final String makeTags(final String tag, final String word) {

        if (tag == null || tag.isEmpty()) {
            return "";
        }

        final String wordNormalized = (word != null && !word.isEmpty()) ? word : "";

        return String.format("<%s>%s</%s>", tag, wordNormalized, tag);
    }
}
