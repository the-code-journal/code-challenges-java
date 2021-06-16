package io.codejournal.codingbat.array1;

import java.util.Arrays;
import java.util.Optional;

public class Sum3 {

    public int sum3(final int[] nums) {

        final int[] numsNormalized = Optional.ofNullable(nums).orElse(new int[] {});

        return Arrays.stream(numsNormalized).limit(3).sum();
    }
}
