package com.tasks.older;

import java.math.BigDecimal;
import java.math.RoundingMode;
public class Suite {
    public static double going(int n) {
        BigDecimal help;
        BigDecimal a = BigDecimal.valueOf(0);
        BigDecimal b = BigDecimal.valueOf(1);
        double resulted = 0;
        if (n > 0) {
            for (int i = n; i > 0; i--) {
                b = b.multiply(BigDecimal.valueOf(i));
                help = BigDecimal.valueOf(1);
                for (int j = i; j > 0; j--) {
                    help = help.multiply(BigDecimal.valueOf(j));
                }
                a = a.add(help);
            }
            resulted = a.divide(b, 6, RoundingMode.FLOOR).doubleValue();
        }
        return resulted;
    }
}
