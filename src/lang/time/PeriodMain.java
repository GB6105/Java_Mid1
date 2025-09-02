package lang.time;

import javax.lang.model.SourceVersion;
import java.time.LocalDate;
import java.time.Period;

public class PeriodMain {
    public static void main(String[] args) {
        //생성
        Period period = Period.ofDays(10);
        System.out.println("period = " + period);

        // 직접 테스트

        Period periodOf = Period.of(2025,9,2);
        System.out.println("periodOf = " + periodOf);

        Period periodOfDays = Period.ofDays(12);
        System.out.println("periodOfDays = " + periodOfDays);

        Period periodOfMonths = Period.ofMonths(12);
        System.out.println("periodOfMonths = " + periodOfMonths);

        Period periodOfYears = Period.ofYears(3);
        System.out.println("periodOfYears = " + periodOfYears);


        // 계산에 사용
        LocalDate currentDate = LocalDate.of(2030,1,1);
        LocalDate plusDate = currentDate.plus(period);
        System.out.println("현재 날짜 : " + currentDate);
        System.out.println("더한 날짜 : " + plusDate);

        //직접 테스트
        System.out.println("of 더한 날짜 : " + currentDate.plus(periodOf)); // 현재 기간에 년 월일 더해줌
        System.out.println("ofDays 더한 날짜 : " + currentDate.plus(periodOfDays));
        System.out.println("ofMonths 더한 날짜 :" + currentDate.plus(periodOfMonths));
        System.out.println("ofYears 더한 날짜 : " + currentDate.plus(periodOfYears));

        //기간 차이
        LocalDate startDate = LocalDate.of(2023,1,1);
        LocalDate endDate = LocalDate.of(2023,4,2);
        Period between = Period.between(startDate, endDate);
        System.out.println("기간 = " + between.getMonths() + "개월 " + between.getDays() + "일");
    }
}
