package io.codejournal.hackerrank.thirtydaysofcode;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class Day04ClassVsInstance {

    public static void main(final String[] args) {

        final String input = "4\n-1\n10\n16\n18";
        final ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        final Scanner sc = new Scanner(System.in);

        final int testCases = sc.nextInt();

        for (int i = 0; i < testCases; i++) {

            final int age = sc.nextInt();

            final Person person = new Person(age);

            person.amIOld();

            for (int j = 0; j < 3; j++) {
                person.yearPasses();
            }

            person.amIOld();

            System.out.println();
        }

        sc.close();
    }
}

class Person {

    private int age;

    public Person(final int initialAge) {
        if (initialAge < 0) {
            System.out.println("Age is not valid, setting age to 0.");
            this.age = 0;
        } else {
            this.age = initialAge;
        }
    }

    public void amIOld() {

        String ans = "";

        if (age < 13) {
            ans = "You are young.";
        } else if (age < 18) {
            ans = "You are a teenager.";
        } else {
            ans = "You are old.";
        }

        System.out.println(ans);
    }

    public void yearPasses() {
        age++;
    }
}
