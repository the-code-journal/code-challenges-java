package io.codejournal.codingbat.array1;

import java.util.Optional;

public class Sum2 {

    public int sum2(final int[] nums) {

        int sum = 0;

        final int[] numsNormalized = Optional.ofNullable(nums).orElse(new int[] {});

        for (int i = 0; i < numsNormalized.length && i < 2; i++) {
            sum = sum + numsNormalized[i];
        }

        return sum;
    }
}
