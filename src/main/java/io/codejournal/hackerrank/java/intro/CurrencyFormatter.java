package io.codejournal.hackerrank.java.intro;

import java.io.ByteArrayInputStream;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {

    public static void main(final String[] args) {

        final String input = "12324.134";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        final Scanner scanner = new Scanner(System.in);

        final double payment = scanner.nextDouble();

        new CurrencyFormatter().format(payment);

        scanner.close();
    }

    public void format(final double payment) {

        final NumberFormat usFormatter = NumberFormat.getCurrencyInstance(Locale.US);
        final NumberFormat indiaFormatter = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        final NumberFormat chinaFormatter = NumberFormat.getCurrencyInstance(Locale.CHINA);
        final NumberFormat franceFormatter = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.println("US: " + usFormatter.format(payment));
        System.out.println("India: " + indiaFormatter.format(payment));
        System.out.println("China: " + chinaFormatter.format(payment));
        System.out.println("France: " + franceFormatter.format(payment));
    }
}
