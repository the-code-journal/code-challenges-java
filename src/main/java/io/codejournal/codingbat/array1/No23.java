package io.codejournal.codingbat.array1;

import java.util.Arrays;
import java.util.Optional;

public class No23 {

    public boolean no23(final int[] nums) {

        final int[] numsNormalized = Optional.ofNullable(nums).orElse(new int[] {});

        if (numsNormalized.length > 0) {
            return Arrays.stream(numsNormalized).filter(n -> n == 2 || n == 3).count() == 0;
        }

        return false;
    }
}
