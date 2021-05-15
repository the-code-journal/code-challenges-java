package io.codejournal.hackerrank.java.intro;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import org.junit.jupiter.api.Test;

public class HelloWorldTest {

    @Test
    void main_LogsHelloWorldAndHelloJava() {

        final ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        HelloWorld.main(null);

        final String actual = output.toString(StandardCharsets.UTF_8);

        assertThat(actual).contains("Hello, World.").contains("Hello, Java.");
    }
}
