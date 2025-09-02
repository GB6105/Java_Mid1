package lang.time.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class TestLoopPlus {
    public static void main(String[] args) {
        LocalDate dateTime = LocalDate.of(2024,1,1);
        Period period = Period.ofWeeks(2);
        for(int i = 1; i <= 5; i ++){
//            LocalDate nextWeek = dateTime.plus(period);
            System.out.println("날짜" + i +": " + dateTime);
            dateTime = dateTime.plus(period);
        }
    }
}
