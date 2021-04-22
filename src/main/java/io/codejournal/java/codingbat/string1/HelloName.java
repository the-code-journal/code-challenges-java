package io.codejournal.java.codingbat.string1;

public class HelloName {

    public final String helloName(final String name) {

        String greeting = "Hello";

        if (name != null && !name.isEmpty()) {
            greeting += " " + name;
        }

        return greeting + "!";
    }
}
