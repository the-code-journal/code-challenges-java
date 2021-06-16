package io.codejournal.codingbat.logic1;

public class MaxMod5 {

    public int maxMod5(final int a, final int b) {

        if (a == b) {
            return 0;
        }

        final int minValue = Math.min(a, b);
        final int maxValue = Math.max(a, b);

        final int minValueMod5 = minValue % 5;
        final int maxValueMod5 = maxValue % 5;

        if (minValueMod5 == maxValueMod5) {
            return minValue;
        } else {
            return maxValue;
        }
    }
}
