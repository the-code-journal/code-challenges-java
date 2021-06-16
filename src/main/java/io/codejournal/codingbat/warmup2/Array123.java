package io.codejournal.codingbat.warmup2;

import java.util.Arrays;

public class Array123 {

    public boolean array123(final int[] nums) {

        if (nums == null || nums.length < 3) {
            return false;
        }

        final StringBuilder sb = new StringBuilder();

        Arrays.stream(nums).forEach(num -> sb.append(num + ""));

        return sb.toString().contains("123");
    }
}
