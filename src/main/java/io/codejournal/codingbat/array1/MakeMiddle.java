package io.codejournal.codingbat.array1;

import java.util.Optional;

public class MakeMiddle {

    public final int[] makeMiddle(final int[] nums) {

        final int[] numsNormalized = Optional.ofNullable(nums).orElse(new int[] {});

        if (numsNormalized.length == 0) {
            return new int[] {};
        } else if (numsNormalized.length % 2 == 1) {
            throw new IllegalArgumentException();
        }

        final int midLeft = (numsNormalized.length / 2) - 1;
        final int midRight = midLeft + 1;

        return new int[] { numsNormalized[midLeft], numsNormalized[midRight] };
    }
}
