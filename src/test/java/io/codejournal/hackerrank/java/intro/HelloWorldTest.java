package io.codejournal.hackerrank.java.intro;

import static java.nio.charset.StandardCharsets.UTF_8;
import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HelloWorldTest {

    private ByteArrayOutputStream output;

    private HelloWorld fixture = new HelloWorld();

    @BeforeEach
    public void setUp() {
        output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
    }

    @Test
    public void defaultCase() {

        HelloWorld.main(null);

        final String actual = output.toString(UTF_8);

        assertThat(actual).contains("Hello, World.").contains("Hello, Java.");
    }

    @Test
    public void run_LogsHelloWorldAndHelloJava() {

        fixture.run();

        final String actual = output.toString(UTF_8);

        assertThat(actual).contains("Hello, World.").contains("Hello, Java.");
    }
}
