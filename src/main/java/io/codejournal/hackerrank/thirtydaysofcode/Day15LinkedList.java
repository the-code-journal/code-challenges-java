package io.codejournal.hackerrank.thirtydaysofcode;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import lombok.Getter;

public class Day15LinkedList {

    public static void main(final String args[]) {

        final String input = "4 2 3 4 1";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        final Scanner sc = new Scanner(System.in);

        final int nodeCount = sc.nextInt();

        final int[] values = new int[nodeCount];

        for (int index = 0; index < nodeCount; index++) {
            values[index] = sc.nextInt();
        }

        sc.close();

        new Day15LinkedList().run(values);
    }

    public void run(final int[] values) {

        final NodeLinkedList list = new NodeLinkedList();

        for (int index = 0; index < values.length; index++) {
            list.insert(values[index]);
        }

        list.display();
    }
}

class NodeLinkedList {

    private Node head;

    public void insert(final int data) {
        insert(head, data);
    }

    private void insert(final Node node, final int data) {

        Node current = node;

        if (current != null) {

            while (current.getNext() != null) {
                current = current.getNext();
            }

            current.setNext(new Node(data));

        } else {
            head = new Node(data);
        }
    }

    public void display() {
        display(head);
    }

    private void display(final Node node) {

        Node current = node;

        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
    }

    public void removeDuplicates() {
        removeDuplicates(head);
    }

    private void removeDuplicates(final Node node) {

        if (node == null) {
            return;
        }

        Node current = node;

        while (current.getNext() != null) {

            if (current.getData() == current.getNext().getData()) {
                current.setNext(current.getNext().getNext());
            } else {
                current = current.getNext();
            }
        }
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
