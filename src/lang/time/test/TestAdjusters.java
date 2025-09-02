package lang.time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TestAdjusters {
    public static void main(String[] args) {
        // 첫날 요일과 마지막 날 요일
        int year = 2024;
        int month = 1;
        LocalDate dt = LocalDate.of(year, month, 1);
//        LocalDate firstDay = dt.with(TemporalAdjusters.firstDayOfMonth());
//        LocalDate lastDay = dt.with(TemporalAdjusters.lastDayOfMonth());
//        System.out.println("firstDayOfweek = " + firstDay.getDayOfWeek());
//        System.out.println("lastDayOfWeek = " + lastDay.getDayOfWeek());
        DayOfWeek firstDayOfWeek = dt.getDayOfWeek();
        DayOfWeek lastDayOfWeek = dt.with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek();
        System.out.println("firstDayOfWeek = "  + firstDayOfWeek);
        System.out.println("lastDayOfWeek = " + lastDayOfWeek);
    }
}
