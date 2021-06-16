package io.codejournal.codingbat.warmup2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountXX {

    public int countXX(final String str) {

        int count = 0;

        if (str != null && !str.isEmpty()) {

            final Pattern p = Pattern.compile("([x]){2}");
            final Matcher m = p.matcher(str);

            // The trick is to start again at the first matched position
            if (m.find()) {
                do {
                    count++;
                } while (m.find(m.start(1)));
            }
        }

        return count;
    }
}
