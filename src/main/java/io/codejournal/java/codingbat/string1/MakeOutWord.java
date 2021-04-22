package io.codejournal.java.codingbat.string1;

public class MakeOutWord {

    public final String makeOutWord(final String out, final String word) {

        if (word == null || word.isEmpty()) {
            return "";
        }

        String prefix = "";
        String suffix = "";

        if (out != null && out.length() > 0) {
            prefix = out.substring(0, out.length() / 2);
            suffix = out.substring(out.length() / 2);
        }

        return new StringBuilder().append(prefix).append(word).append(suffix).toString();
    }
}
