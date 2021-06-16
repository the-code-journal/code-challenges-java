package io.codejournal.codingbat.string1;

public class MakeAbba {

    public final String makeAbba(final String a, final String b) {

        final StringBuilder result = new StringBuilder();

        final String aNormalized = (a != null && !a.isEmpty()) ? a : "";
        final String bNormalized = (b != null && !b.isEmpty()) ? b : "";

        // @formatter:off
        return result
                .append(aNormalized)
                .append(bNormalized)
                .append(bNormalized)
                .append(aNormalized)
                .toString();
        // @formatter:on
    }
}
