package com.tasks.newer.reduce;

public class Reduce {
    public static int[] myFraction(int[] fractions) {
        int divider = fractions[0];
        int a = 0;
        int b = 0;
        while (divider != 0) {
            if (fractions[0] % divider == 0 && fractions[1] % divider == 0) {
                a = fractions[0] / divider;
                b = fractions[1] / divider;
                divider = 0;
            } else {
                divider--;
            }
        }
        return new int[]{a, b};
    }
}