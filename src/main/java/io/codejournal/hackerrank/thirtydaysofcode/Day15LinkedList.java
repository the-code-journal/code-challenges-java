package io.codejournal.hackerrank.thirtydaysofcode;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import lombok.Getter;

public class Day15LinkedList {

    public Node insert(final Node head, final int data) {

        Node start = head;

        if (start != null) {

            while (start.getNext() != null) {
                start = start.getNext();
            }

            start.setNext(new Node(data));

            return head;
        } else {
            return new Node(data);
        }
    }

    public void display(final Node head) {

        Node start = head;

        while (start != null) {
            System.out.print(start.getData() + " ");
            start = start.getNext();
        }
    }

    public static void main(final String args[]) {

        final String input = "4 2 3 4 1";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        final Scanner sc = new Scanner(System.in);

        Node head = null;

        int nodeCount = sc.nextInt();

        final Day15LinkedList runner = new Day15LinkedList();

        while (nodeCount-- > 0) {
            int element = sc.nextInt();
            head = runner.insert(head, element);
        }

        runner.display(head);

        sc.close();
    }
}

@Getter
class Node {

    private int data;

    private Node next;

    public Node(final int data) {
        this.data = data;
        this.next = null;
    }

    public void setNext(final Node next) {
        this.next = next;
    }
}
