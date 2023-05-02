package com.tasks.dateprogram;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class DateProgram {

    private final String todayName;
    private final long dayOfWeek;
    private final long dayOfMonth;
    private final long dayOfYear;
    private final LocalDate nowDate;
    private final LocalDate birthOfChrist = LocalDate.of(1, 1, 1);
    private final LocalDate year2000 = LocalDate.of(2000, 1, 1);
    private LocalDate christmasEve;

    public DateProgram(int year, int month, int day) {
        this.todayName = LocalDate.of(year,month,day).getDayOfWeek().name().toLowerCase();
        this.dayOfWeek = LocalDate.of(year,month,day).getDayOfWeek().getValue();
        this.dayOfMonth = LocalDate.of(year,month,day).getDayOfMonth();
        this.dayOfYear = LocalDate.now().getDayOfYear();
        this.nowDate = LocalDate.of(year,month,day);
        this.christmasEve = LocalDate.of(LocalDate.of(year,month,day).getYear(), 12, 24);
    }
        public String getDifferentDates() {
            String result;
            long daysSinceBirthOfChrist = ChronoUnit.DAYS.between(birthOfChrist, nowDate);
            long daysSinceYear2000 = ChronoUnit.DAYS.between(year2000, nowDate);
            if (nowDate.isAfter(christmasEve)) {
                christmasEve = christmasEve.plusYears(1);
            }
            long daysToChristmasEve = ChronoUnit.DAYS.between(nowDate, christmasEve);
            if (Objects.equals(todayName, "monday") || Objects.equals(todayName, "thursday")) {
                result = "Day of week: " + dayOfWeek + "\n" + "Day of month: "
                        + dayOfMonth + "\n" + "Day of year: " + dayOfYear + "\n" + "Days since birth of Christ " + daysSinceBirthOfChrist
                        + "\n" + "Days since year 2000: " + daysSinceYear2000 + "\n" + "Days to Christmas Eve: " + daysToChristmasEve;
            } else {
                result = "This program work monday and thursday only";
            }
            return result;
        }
}
