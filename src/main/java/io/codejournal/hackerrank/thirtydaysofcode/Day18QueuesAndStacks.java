package io.codejournal.hackerrank.thirtydaysofcode;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day18QueuesAndStacks {

    private final List<Character> queue = new ArrayList<>();

    private final List<Character> stack = new ArrayList<>();

    public static void main(final String[] args) {

        final String input = "racecar";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        final Scanner scan = new Scanner(System.in);

        final String string = scan.nextLine();

        scan.close();

        new Day18QueuesAndStacks().run(string);
    }

    public void run(final String string) {

        // Convert input String to an array of characters:
        final char[] chars = string.toCharArray();

        // Enqueue/Push all chars to their respective data structures:
        for (final char c : chars) {
            pushCharacter(c);
            enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < chars.length / 2; i++) {
            if (popCharacter() != dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        // Finally, print whether string s is palindrome or not.
        System.out.printf("The word, %s is%s a palindrome.\n", string, ((isPalindrome) ? "" : " not"));
    }

    public void pushCharacter(final char c) {
        stack.add(c);
    }

    public Character popCharacter() {

        if (stack.size() == 0) {
            throw new IllegalStateException("Stack is empty");
        }

        return stack.remove(stack.size() - 1);
    }

    public void enqueueCharacter(char c) {
        queue.add(c);
    }

    public Character dequeueCharacter() {

        if (stack.size() == 0) {
            throw new IllegalStateException("Queue is empty");
        }

        return queue.remove(0);
    }
}
