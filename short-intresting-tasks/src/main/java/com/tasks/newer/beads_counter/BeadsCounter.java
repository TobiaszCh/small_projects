package com.tasks.newer.beads_counter;

public class BeadsCounter {

    public static int countRedBeads(final int nBlue) {
        if(nBlue < 2) {
            return 0;
        }
        else {
            return 2*(nBlue -1);
        }
    }
}
