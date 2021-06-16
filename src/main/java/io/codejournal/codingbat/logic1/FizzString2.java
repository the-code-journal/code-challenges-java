package io.codejournal.codingbat.logic1;

public class FizzString2 {

    public String fizzString2(final int n) {

        final boolean divisibleBy3 = (n % 3 == 0);
        final boolean divisibleBy5 = (n % 5 == 0);

        if (divisibleBy3 && divisibleBy5) {
            return "FizzBuzz!";
        } else if (divisibleBy3) {
            return "Fizz!";
        } else if (divisibleBy5) {
            return "Buzz!";
        } else {
            return n + "!";
        }
    }
}
