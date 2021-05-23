package io.codejournal.hackerrank.thirtydaysofcode;

import java.io.ByteArrayInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day08DictionariesAndMaps {

    public static void main(final String[] args) {

        final String input = "3\nsam 99912222\ntom 11122222\nharry 12299933\nsam\nedward\nharry";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        final Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        final Map<String, Integer> phoneBook = new HashMap<>(n);

        for (int i = 0; i < n; i++) {

            final String name = in.next();
            final int phone = in.nextInt();

            phoneBook.put(name, phone);
        }

        final Day08DictionariesAndMaps runner = new Day08DictionariesAndMaps();

        while (in.hasNext()) {

            final String name = in.next();

            runner.lookUp(phoneBook, name);
        }

        in.close();
    }

    public void lookUp(final Map<String, Integer> phoneBook, final String name) {

        if (phoneBook.containsKey(name)) {
            System.out.printf("%s=%d\n", name, phoneBook.get(name));
        } else {
            System.out.println("Not found");
        }
    }
}
