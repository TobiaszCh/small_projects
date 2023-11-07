package com.tasks.newer.lucky_number;

import java.util.Arrays;

public class LuckyNumber {
    public static boolean isLucky(long n) {
        long a = Arrays.stream(String.valueOf(n).split("")).mapToLong(Long::valueOf).sum();
        return a % 9 == 0;
    }
}
