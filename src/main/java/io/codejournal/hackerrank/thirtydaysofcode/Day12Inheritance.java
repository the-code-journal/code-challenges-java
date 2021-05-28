package io.codejournal.hackerrank.thirtydaysofcode;

import java.io.ByteArrayInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Day12Inheritance {

    public static void main(final String[] args) {

        // @formatter:off
        final String input = "Heraldo Memelli 8135627\n"
                           + "2\n"
                           + "100 80";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        // @formatter:on

        final Scanner scan = new Scanner(System.in);

        final String firstName = scan.next();
        final String lastName = scan.next();
        final int id = scan.nextInt();

        final int numScores = scan.nextInt();
        final int[] testScores = new int[numScores];

        for (int i = 0; i < numScores; i++) {
            testScores[i] = scan.nextInt();
        }

        scan.close();

        final Day12Inheritance runner = new Day12Inheritance();

        final Student student = runner.new Student(firstName, lastName, id, testScores);

        student.printPerson();
        System.out.println("Grade: " + student.calculate());
    }

    class Person {

        protected final String firstName;

        protected final String lastName;

        protected final int idNumber;

        public Person(final String firstName, final String lastName, final int idNumber) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.idNumber = idNumber;
        }

        public void printPerson() {
            System.out.println("Name: " + lastName + ", " + firstName + "\nID: " + idNumber);
        }

    }

    class Student extends Person {

        private final int[] testScores;

        public Student(final String firstName, final String lastName, final int id, final int[] testScores) {
            super(firstName, lastName, id);
            this.testScores = testScores;
        }

        public Grade calculate() {

            final double average = Arrays.stream(testScores).average().getAsDouble();

            if (average >= 90.0) {
                return Grade.O;
            } else if (average >= 80.0) {
                return Grade.E;
            } else if (average >= 70.0) {
                return Grade.A;
            } else if (average >= 55.0) {
                return Grade.P;
            } else if (average >= 40.0) {
                return Grade.D;
            } else {
                return Grade.T;
            }
        }
    }

    enum Grade {
        O, E, A, P, D, T
    }
}
