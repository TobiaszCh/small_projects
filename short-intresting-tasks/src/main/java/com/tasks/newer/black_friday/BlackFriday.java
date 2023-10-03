package com.tasks.newer.black_friday;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class BlackFriday {
    public static int unluckyDays(int year) {
        int month = 1;
        int result = 0;
        while (month < 13) {
            if (LocalDate.of(year, month, 13).getDayOfWeek() == DayOfWeek.FRIDAY) {
                result++;
            }
            month++;
        }
        return result;
    }
}
