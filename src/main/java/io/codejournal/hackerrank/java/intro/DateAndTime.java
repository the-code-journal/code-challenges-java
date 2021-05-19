package io.codejournal.hackerrank.java.intro;

import java.io.ByteArrayInputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class DateAndTime {

    public static void main(final String[] args) {

        final String input = "08 05 2015";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        final Scanner in = new Scanner(System.in);

        final int month = Integer.parseInt(in.next().trim());
        final int day = Integer.parseInt(in.next().trim());
        final int year = Integer.parseInt(in.next().trim());

        System.out.println(new DateAndTime().findDay(month, day, year));

        in.close();
    }

    public String findDay(final int month, final int day, final int year) {

        Calendar c = Calendar.getInstance();

        c.set(Calendar.YEAR, year);
        c.set(Calendar.MONTH, month - 1);
        c.set(Calendar.DATE, day);

        return new SimpleDateFormat("EEEE").format(c.getTime()).toUpperCase();
    }
}
