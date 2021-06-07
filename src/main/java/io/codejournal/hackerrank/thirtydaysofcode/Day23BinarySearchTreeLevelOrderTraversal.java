package io.codejournal.hackerrank.thirtydaysofcode;

import java.io.ByteArrayInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Day23BinarySearchTreeLevelOrderTraversal {

    public static void main(final String args[]) {

        String input = "6 3 5 4 7 2 1";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        final Scanner scanner = new Scanner(System.in);

        final int testcases = scanner.nextInt();

        final int[] values = new int[testcases];

        int index = 0;

        while (index < testcases) {
            values[index++] = scanner.nextInt();
        }

        scanner.close();

        new Day23BinarySearchTreeLevelOrderTraversal().run(values);
    }

    public void run(final int[] values) {

        final BinaryTree tree = new BinaryTree();

        Arrays.stream(values).forEach(tree::insert);

        tree.levelOrderTraversal();
    }
}
