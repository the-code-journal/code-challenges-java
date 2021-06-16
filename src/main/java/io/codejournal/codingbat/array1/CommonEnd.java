package io.codejournal.codingbat.array1;

import java.util.Optional;

public class CommonEnd {

    public boolean commonEnd(final int[] a, final int[] b) {
        
        final int[] aNormalized = Optional.ofNullable(a).orElse(new int[] {});
        final int[] bNormalized = Optional.ofNullable(b).orElse(new int[] {});

        return aNormalized.length > 0 && bNormalized.length > 0
                && (aNormalized[aNormalized.length - 1] == bNormalized[bNormalized.length - 1]
                        || aNormalized[0] == bNormalized[0]);
    }
}
