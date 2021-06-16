package io.codejournal.codingbat.array1;

import java.util.Optional;

public class Reverse3 {

    public final int[] reverse3(final int[] nums) {

        final int[] numsNormalized = Optional.ofNullable(nums).orElse(new int[] {});

        final int[] reversed = new int[numsNormalized.length];

        for (int i = 0; i < numsNormalized.length; i++) {
            reversed[i] = numsNormalized[numsNormalized.length - 1 - i];
        }

        return reversed;
    }
}
