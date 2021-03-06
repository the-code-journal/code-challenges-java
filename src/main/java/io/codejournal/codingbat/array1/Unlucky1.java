package io.codejournal.codingbat.array1;

import java.util.Optional;
import java.util.function.Predicate;

import lombok.Getter;
import lombok.Setter;

public class Unlucky1 {

    public boolean unlucky1(final int[] nums) {

        final int[] numsNormalized = Optional.ofNullable(nums).orElse(new int[] {});

        if (numsNormalized.length < 2) {
            return false;
        }

        int i = 0;
        int j = i + 1;

        while (i < numsNormalized.length - 1) {

            final Values v = new Values();
            v.setArrayLength(numsNormalized.length);
            v.setCurrentPosition(i);
            v.setCurrentValue(numsNormalized[i]);
            v.setNextValue(numsNormalized[j]);

            if (isUnlucky1Predicate().test(v)) {
                return true;
            }

            i++;
            j++;
        }

        return false;
    }

    public boolean unlucky1NonPredicate(final int[] nums) {

        final int[] numsNormalized = Optional.ofNullable(nums).orElse(new int[] {});

        if (numsNormalized.length < 2) {
            return false;
        }

        int i = 0;
        int j = i + 1;
        while (i < numsNormalized.length - 1) {

            if ((i < 2 || i >= numsNormalized.length - 2) && (numsNormalized[i] == 1 && numsNormalized[j] == 3)) {
                return true;
            }

            i++;
            j++;
        }

        return false;
    }

    private Predicate<Values> isUnlucky1Predicate() {

        return p -> (p.getCurrentPosition() < 2 || p.getCurrentPosition() >= p.getArrayLength() - 2)
                && (p.getCurrentValue() == 1 && p.getNextValue() == 3);
    }
}

@Getter
@Setter
class Values {

    private int currentPosition;

    private int currentValue;

    private int nextValue;

    private int arrayLength;
}
