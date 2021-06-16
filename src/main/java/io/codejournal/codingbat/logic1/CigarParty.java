package io.codejournal.codingbat.logic1;

public class CigarParty {

    public boolean cigarParty(final int cigars, final boolean isWeekend) {
        return (isWeekend) ? (cigars >= 40) : (cigars >= 40 && cigars <= 60);
    }
}
