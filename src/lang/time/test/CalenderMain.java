package lang.time.test;

import java.sql.SQLOutput;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class CalenderMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("년도를 입력하세요: ");
        int yearInput = scanner.nextInt();
        System.out.print("월을 입력하세요: ");
        int monthInput = scanner.nextInt();

        LocalDate firstDateOfMonth = LocalDate.of(yearInput, monthInput, 1);
        System.out.println("ld = " + firstDateOfMonth);
        LocalDate lastDateOfMonth = firstDateOfMonth.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("with = " + lastDateOfMonth);

        DayOfWeek firstDayOfWeek = firstDateOfMonth.getDayOfWeek();
        System.out.println("dayOfWeek = " + firstDayOfWeek);

        System.out.println("Su Mo Tu We Th Fr Sa");
        int[] sunday;
        int[] monday;
        int[] tuesday;
        int[] wednesday;
        int[] thursday;
        int[] friday;
        int[] saturday;

        while(lastDateOfMonth.isAfter(firstDateOfMonth)) {}
        LocalDate ld = firstDateOfMonth.plusWeeks(1);




    }


}
