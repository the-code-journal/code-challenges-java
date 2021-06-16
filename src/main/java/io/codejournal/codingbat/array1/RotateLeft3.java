package io.codejournal.codingbat.array1;

import java.util.Optional;

public class RotateLeft3 {

    public final int[] rotateLeft3(final int[] nums) {

        final int[] numsNormalized = Optional.ofNullable(nums).orElse(new int[] {});

        if (numsNormalized.length > 0) {

            int first = numsNormalized[0];

            for (int i = 0; i < numsNormalized.length - 1; i++) {

                numsNormalized[i] = numsNormalized[i + 1];
            }

            numsNormalized[numsNormalized.length - 1] = first;
        }

        return numsNormalized;
    }
}
