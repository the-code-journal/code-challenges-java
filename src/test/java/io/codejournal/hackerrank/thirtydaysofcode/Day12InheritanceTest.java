package io.codejournal.hackerrank.thirtydaysofcode;

import static java.nio.charset.StandardCharsets.UTF_8;
import static java.util.UUID.randomUUID;
import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Random;

import org.junit.jupiter.api.Test;

import io.codejournal.hackerrank.thirtydaysofcode.Day12Inheritance.Grade;
import io.codejournal.hackerrank.thirtydaysofcode.Day12Inheritance.Student;

public class Day12InheritanceTest {

    private Day12Inheritance fixture = new Day12Inheritance();

    private final Random random = new Random();

    @Test
    public void defaultCase() {

        final ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        final String expected = "Name: Memelli, Heraldo\nID: 8135627\nGrade: O";

        Day12Inheritance.main(null);

        final String actual = output.toString(UTF_8).trim();

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void calculate_ReturnsGradeAsE_WhenAverageIsGreaterThanOrEqualTo80AndLessThan90() {

        final Grade expected = Grade.E;

        final String firstName = randomUUID().toString();
        final String lastName = randomUUID().toString();
        final int id = random.nextInt(1000000);
        final int[] testScores = new int[] { 80 };

        final Student student = fixture.new Student(firstName, lastName, id, testScores);

        final Grade actual = student.calculate();

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void calculate_ReturnsGradeAsA_WhenAverageIsGreaterThanOrEqualTo70AndLessThan80() {

        final Grade expected = Grade.A;

        final String firstName = randomUUID().toString();
        final String lastName = randomUUID().toString();
        final int id = random.nextInt(1000000);
        final int[] testScores = new int[] { 70 };

        final Student student = fixture.new Student(firstName, lastName, id, testScores);

        final Grade actual = student.calculate();

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void calculate_ReturnsGradeAsP_WhenAverageIsGreaterThanOrEqualTo55AndLessThan80() {

        final Grade expected = Grade.P;

        final String firstName = randomUUID().toString();
        final String lastName = randomUUID().toString();
        final int id = random.nextInt(1000000);
        final int[] testScores = new int[] { 55 };

        final Student student = fixture.new Student(firstName, lastName, id, testScores);

        final Grade actual = student.calculate();

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void calculate_ReturnsGradeAsD_WhenAverageIsGreaterThanOrEqualTo40AndLessThan80() {

        final Grade expected = Grade.D;

        final String firstName = randomUUID().toString();
        final String lastName = randomUUID().toString();
        final int id = random.nextInt(1000000);
        final int[] testScores = new int[] { 40 };

        final Student student = fixture.new Student(firstName, lastName, id, testScores);

        final Grade actual = student.calculate();

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void calculate_ReturnsGradeAsT_WhenAverageIsLessThan40() {

        final Grade expected = Grade.T;

        final String firstName = randomUUID().toString();
        final String lastName = randomUUID().toString();
        final int id = random.nextInt(1000000);
        final int[] testScores = new int[] { 39 };

        final Student student = fixture.new Student(firstName, lastName, id, testScores);

        final Grade actual = student.calculate();

        assertThat(actual).isEqualTo(expected);
    }
}
