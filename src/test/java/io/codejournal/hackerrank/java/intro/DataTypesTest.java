package io.codejournal.hackerrank.java.intro;

import static java.nio.charset.StandardCharsets.UTF_8;
import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DataTypesTest {

    private ByteArrayOutputStream output;

    private DataTypes fixture = new DataTypes();

    @BeforeEach
    public void setUp() {
        output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
    }

    @Test
    public void defaultCase() {

        // @formatter:off
        final String expected = "-150 can be fitted in:\n"
                              + "* short\n"
                              + "* int\n"
                              + "* long\n"
                              + "150000 can be fitted in:\n"
                              + "* int\n"
                              + "* long\n"
                              + "1500000000 can be fitted in:\n"
                              + "* int\n"
                              + "* long\n"
                              + "213333333333333333333333333333333333 can't be fitted anywhere.\n"
                              + "-100000000000000 can be fitted in:\n"
                              + "* long\n";
        // @formatter:on

        DataTypes.main(null);

        final String actual = output.toString(UTF_8);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void checkType_PrintFitTypeByteShortIntegerLong_WhenValueIsByte() {

        final String input = "1";

        // @formatter:off
        final String expected = "1 can be fitted in:\n"
                              + "* byte\n"
                              + "* short\n"
                              + "* int\n"
                              + "* long\n";
        // @formatter:on

        fixture.checkType(input);

        final String actual = output.toString(UTF_8);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void checkType_PrintFitTypeShortIntegerLong_WhenValueIsShort() {

        final String input = "1000";

        // @formatter:off
        final String expected = "1000 can be fitted in:\n"
                              + "* short\n"
                              + "* int\n"
                              + "* long\n";
        // @formatter:on

        fixture.checkType(input);

        final String actual = output.toString(UTF_8);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void checkType_PrintFitTypeIntegerLong_WhenValueIsInteger() {

        final String input = "100000";

        // @formatter:off
        final String expected = "100000 can be fitted in:\n"
                              + "* int\n"
                              + "* long\n";
        // @formatter:on

        fixture.checkType(input);

        final String actual = output.toString(UTF_8);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void checkType_PrintFitTypeLong_WhenValueIsLong() {

        final String input = "10000000000";

        // @formatter:off
        final String expected = "10000000000 can be fitted in:\n"
                              + "* long\n";
        // @formatter:on

        fixture.checkType(input);

        final String actual = output.toString(UTF_8);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void checkType_PrintFitTypeNone_WhenValueCannotFitByteShortIntegerLong() {

        final String input = "1000000000000000000000000";

        final String expected = "1000000000000000000000000 can't be fitted anywhere.\n";

        fixture.checkType(input);

        final String actual = output.toString(UTF_8);

        assertThat(actual).isEqualTo(expected);
    }
}
