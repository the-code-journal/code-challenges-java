package io.codejournal.codingbat.array1;

import java.util.Optional;

public class SwapEnds {
    public final int[] swapEnds(final int[] nums) {

        final int[] numsNormalized = Optional.ofNullable(nums).orElse(new int[] {});

        final int[] result = numsNormalized.clone();

        if (result.length >= 2) {

            int temp = result[0];

            result[0] = result[result.length - 1];

            result[result.length - 1] = temp;
        }

        return result;

    }
}
