package com.tasks.newer.happy_year;

import java.util.Arrays;
import java.util.stream.Collectors;

public class HappyYear {
    static public int nextHappyYear(int year) {
        int yearNext = year + 1;
        while (String.valueOf(year).length() > Arrays.stream(String.valueOf(yearNext)
                .split("")).distinct().collect(Collectors.joining()).length()) {
            yearNext++;
        }
        return yearNext;
    }
}
