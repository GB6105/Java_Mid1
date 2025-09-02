package lang.time.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TestLoopPlus {
    public static void main(String[] args) {
//        LocalDate dateTime = LocalDate.of(2024,1,1);
//        Period period = Period.ofWeeks(2);
//        for(int i = 1; i <= 5; i ++){
//            System.out.println("날짜" + i +": " + dateTime);
//            dateTime = dateTime.plus(period);
//        }
        //누적 합이 아닌 반복 횟수 와 chronoUnit의 사용
        LocalDate startDate = LocalDate.of(2024, 1, 1);
        for(int i = 0 ; i < 5; i++){
            //LocalDate nextDate = startDate.plus(2 * i, ChronoUnit.WEEKS);
            LocalDate nextDate = startDate.plusWeeks(2 * i);
            System.out.println("날짜 " + (i+1) + " : " + nextDate);
        }
    }
}
