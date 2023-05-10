package com.tasks.older;

import java.util.Arrays;

public class FindOdd {
    public static int findIt(int[] a) {
        int[] b = Arrays.stream(a).sorted().toArray();
        System.out.println(Arrays.toString(b));
        int result = 1;
        int resultF = 0;
        for(int i = 0; i < b.length; i++) {
            if (b.length > 1 &&  i < b.length-1) {
                if (b[i] == b[i + 1]) {
                    result++;
                } else if (!(b[i] == b[i + 1]) && result % 2 != 0) {
                    resultF = b[i];
                    break;
                } else {
                    result = 1;
                }
            }
            else if (b.length == 1) {
                resultF = b[0];
            }
            else {
                resultF = b[b.length-1];
            }
        }
        return resultF;
    }
}
