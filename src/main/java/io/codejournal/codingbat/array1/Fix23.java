package io.codejournal.codingbat.array1;

import java.util.Optional;

public class Fix23 {

    public final int[] fix23(final int[] nums) {

        final int[] numsNormalized = Optional.ofNullable(nums).orElse(new int[] {});

        if (numsNormalized.length <= 1) {
            return numsNormalized;
        }

        final int[] result = numsNormalized.clone();

        int i = 0;
        int j = 1;

        for (; i < result.length - 1;) {

            int current = result[i];
            int next = result[j];

            if (current == 2 && next == 3) {
                result[j] = 0;
                i++;
            }

            i++;
            j = i + 1;
        }

        return result;
    }
}
