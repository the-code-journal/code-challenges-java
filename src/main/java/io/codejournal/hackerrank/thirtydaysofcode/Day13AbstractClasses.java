package io.codejournal.hackerrank.thirtydaysofcode;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class Day13AbstractClasses {

    public static void main(final String[] args) {

        final String input = "The Alchemist\nPaulo Coelho\n248";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        final Scanner scanner = new Scanner(System.in);

        final String title = scanner.nextLine();
        final String author = scanner.nextLine();

        final int price = scanner.nextInt();

        scanner.close();

        new Day13AbstractClasses().new MyBook(title, author, price).display();
    }

    abstract class Book {

        protected final String title;
        protected final String author;

        public Book(final String title, final String author) {
            this.title = title;
            this.author = author;
        }

        abstract void display();
    }

    class MyBook extends Book {

        private final int price;

        public MyBook(final String title, final String author, final int price) {
            super(title, author);
            this.price = price;
        }

        @Override
        public void display() {
            System.out.printf("Title: %s\nAuthor: %s\nPrice: %d\n", title, author, price);
        }
    }
}
