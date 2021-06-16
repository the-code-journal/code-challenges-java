package io.codejournal.codingbat.warmup1;

public class ParrotTrouble {

    public final boolean parrotTrouble(final boolean talking, final int hour) {
        return (talking && (hour < 7 || hour > 20));
    }
}
