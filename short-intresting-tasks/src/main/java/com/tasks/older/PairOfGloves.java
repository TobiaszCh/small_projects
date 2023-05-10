package com.tasks.older;

import java.util.Arrays;
import java.util.Objects;

public class PairOfGloves {

    public static int numberOfPairs(String[] gloves) {
        int resultAdd = 1;
        int result = 0;
        Arrays.sort(gloves);
        System.out.println(Arrays.toString(gloves));
        for(int i = 1; i < gloves.length; i++) {
            if (Objects.equals(gloves[i], gloves[i - 1])) {
                result = resultAdd++;
                System.out.println(gloves[i] + " " + gloves[i - 1]);
                System.out.println(result);
                i++;
            }
        }
        System.out.println("Result: " + result);
        return result;
    }
}
