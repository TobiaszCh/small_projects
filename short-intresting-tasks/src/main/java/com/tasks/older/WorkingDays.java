package com.tasks.older;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import static java.time.temporal.TemporalAdjusters.firstInMonth;
import static java.time.temporal.TemporalAdjusters.lastInMonth;

public class WorkingDays {
    static long count(final LocalDate start, final LocalDate end) {

        LocalDate firsMonday = start.with(firstInMonth(DayOfWeek.MONDAY));
        LocalDate lastFriday = end.with(lastInMonth(DayOfWeek.FRIDAY));
        long result = ChronoUnit.DAYS.between(firsMonday, lastFriday);
        return result - (result/7 * 2) + 1;
    }
}
