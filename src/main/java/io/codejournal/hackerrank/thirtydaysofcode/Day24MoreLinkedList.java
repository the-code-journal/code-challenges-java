package io.codejournal.hackerrank.thirtydaysofcode;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class Day24MoreLinkedList {

    public static void main(final String args[]) {

        final String input = "6 1 2 2 3 3 4";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        final Scanner sc = new Scanner(System.in);

        final int nodeCount = sc.nextInt();

        final int[] values = new int[nodeCount];

        for (int index = 0; index < nodeCount; index++) {
            values[index] = sc.nextInt();
        }

        sc.close();

        new Day24MoreLinkedList().run(values);
    }

    public void run(final int[] values) {

        final NodeLinkedList list = new NodeLinkedList();

        for (int index = 0; index < values.length; index++) {
            list.insert(values[index]);
        }

        list.removeDuplicates();

        list.display();
    }
}
