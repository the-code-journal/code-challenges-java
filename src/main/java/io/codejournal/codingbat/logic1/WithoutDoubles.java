package io.codejournal.codingbat.logic1;

public class WithoutDoubles {

    public int withoutDoubles(final int die1, final int die2, final boolean noDoubles) {

        final int minValueDie = Math.min(die1, die2);
        final int maxValueDie = Math.max(die1, die2);

        if (noDoubles && (minValueDie == maxValueDie)) {

            if (maxValueDie == 6) {
                return minValueDie + 1;
            } else {
                return minValueDie + maxValueDie + 1;
            }
        }

        return minValueDie + maxValueDie;
    }
}
