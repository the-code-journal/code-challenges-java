package io.codejournal.codingbat.logic1;

public class DateFashion {

    public int dateFashion(final int you, final int date) {

        if (you <= 2 || date <= 2) {
            return 0;
        } else if (you >= 8 || date >= 8) {
            return 2;
        } else {
            return 1;
        }
    }
}
