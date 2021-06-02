package io.codejournal.hackerrank.thirtydaysofcode;

import static java.nio.charset.StandardCharsets.UTF_8;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Day18QueuesAndStacksTest {

    private ByteArrayOutputStream output;

    private Day18QueuesAndStacks fixture = new Day18QueuesAndStacks();

    @BeforeEach
    public void setUp() {
        output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
    }

    @Test
    public void defaultCasePalindrome() {

        final String expected = "The word, racecar is a palindrome.";

        Day18QueuesAndStacks.main(null);

        final String actual = output.toString(UTF_8).trim();

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void defaultCaseNotPalindrome() {

        final String input = "test";

        final String expected = "The word, test is not a palindrome.";

        fixture.run(input);

        final String actual = output.toString(UTF_8).trim();

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void popCharacter_ThrowsException_WhenStackIsEmpty() {
        assertThatExceptionOfType(IllegalStateException.class)
                .isThrownBy(() -> fixture.popCharacter())
                .withMessage("Stack is empty");
    }

    @Test
    public void dequeueCharacter_ThrowsException_WhenQueueIsEmpty() {
        assertThatExceptionOfType(IllegalStateException.class)
                .isThrownBy(() -> fixture.dequeueCharacter())
                .withMessage("Queue is empty");
    }
}
