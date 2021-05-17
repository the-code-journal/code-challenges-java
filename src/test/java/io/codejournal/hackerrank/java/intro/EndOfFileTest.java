package io.codejournal.hackerrank.java.intro;

import static java.nio.charset.StandardCharsets.UTF_8;
import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

public class EndOfFileTest {

    @Test
    public void defaultCase() {

        final ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        // @formatter:off
        final String expected = "1 Hello world\n"
                              + "2 I am a file\n"
                              + "3 Read me until end-of-file.\n";
        // @formatter:on

        EndOfFile.main(null);

        final String actual = output.toString(UTF_8);

        assertThat(actual).isEqualTo(expected);

        new EndOfFile();
    }

}
