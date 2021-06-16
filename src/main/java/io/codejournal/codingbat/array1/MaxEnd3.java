package io.codejournal.codingbat.array1;

import java.util.Optional;

public class MaxEnd3 {

    public final int[] maxEnd3(final int[] nums) {

        final int[] numsNormalized = Optional.ofNullable(nums).orElse(new int[] {});

        if (numsNormalized.length > 0) {

            int first = numsNormalized[0];
            int last = numsNormalized[numsNormalized.length - 1];

            int max = Math.max(first, last);

            final int[] result = new int[numsNormalized.length];

            for (int i = 0; i < result.length; i++) {
                result[i] = max;
            }

            return result;
        }

        return numsNormalized;
    }
}
