package io.codejournal.codingbat.array1;

import java.util.Optional;

public class SameFirstLast {

    public boolean sameFirstLast(final int[] nums) {

        final int[] numsNormalized = Optional.ofNullable(nums).orElse(new int[] {});

        return numsNormalized.length > 0 && numsNormalized[0] == numsNormalized[numsNormalized.length - 1];
    }
}
