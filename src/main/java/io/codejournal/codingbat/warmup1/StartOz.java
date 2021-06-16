package io.codejournal.codingbat.warmup1;

public class StartOz {

    public final String startOz(final String str) {

        if (str.length() >= 2) {

            String output = "";

            final String first = str.substring(0, 1);
            final String second = str.substring(1, 2);

            if ("o".equals(first)) {
                output += first;
            }

            if ("z".equals(second)) {
                output += second;
            }

            return output;

        } else {
            return str;
        }
    }
}
