package io.codejournal.hackerrank.thirtydaysofcode;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day28RegExPattern {

    private static final Pattern EMAIL_WITH_GMAIL = Pattern.compile("^(\\w+) (\\w+)@gmail.com$");

    public static void main(final String[] args) {

        // @formatter:off
        String input = ""
                + "6\n"
                + "riya riya@gmail.com\n"
                + "julia julia@julia.me\n"
                + "julia sjulia@gmail.com\n"
                + "julia julia@gmail.com\n"
                + "samantha samantha@gmail.com\n"
                + "tanya tanya@gmail.com\n";
        // @formatter:on
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        final Scanner scan = new Scanner(System.in);

        final int totalCases = Integer.parseInt(scan.nextLine().replaceAll("\n", ""));

        final List<String> entries = new ArrayList<>();

        for (int i = 0; i < totalCases; i++) {
            entries.add(scan.nextLine());
        }

        scan.close();

        new Day28RegExPattern().run(entries);
    }

    public void run(final List<String> entries) {

        final List<String> filteredNames = new ArrayList<>(entries.size());

        for (final String entry : entries) {

            final Matcher matcher = EMAIL_WITH_GMAIL.matcher(entry);

            if (matcher.find()) {
                filteredNames.add(matcher.group(1));
            }
        }

        Collections.sort(filteredNames);

        filteredNames.forEach(System.out::println);
    }
}
