package io.codejournal.codingbat.logic1;

public class TeaParty {

    public int teaParty(final int tea, final int candy) {

        final boolean isTeaAtLeastDoubleThanCandy = tea >= (2 * candy);
        final boolean isCandyAtLeastDoubleThanTea = candy >= (2 * tea);

        if (tea < 5 || candy < 5) {
            return 0;
        } else if (isTeaAtLeastDoubleThanCandy || isCandyAtLeastDoubleThanTea) {
            return 2;
        } else {
            return 1;
        }
    }
}
