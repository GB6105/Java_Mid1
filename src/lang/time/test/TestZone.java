package lang.time.test;

import java.time.*;

public class TestZone {
    public static void main(String[] args) {
//        //서울
//        LocalDateTime seoulLdt = LocalDateTime.of(2024,1,1,9,0);
//        //런던
//        ZonedDateTime londonLdt = ZonedDateTime.of(seoulLdt, ZoneId.of("Europe/London"));
//        //뉴욕
//        ZonedDateTime newYorkLdt = ZonedDateTime.of(seoulLdt, ZoneId.of("America/New_York"));

        ZonedDateTime seoulLdt = ZonedDateTime.of(LocalDate.of(2024,1,1), LocalTime.of(9,0),ZoneId.of("Asia/Seoul"));
        ZonedDateTime londonLdt = seoulLdt.withZoneSameInstant(ZoneId.of("Europe/London"));
        ZonedDateTime newYorkLdt = seoulLdt.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println("서울의 회의 시간: " + seoulLdt);
        System.out.println("런던의 회의 시간: " + londonLdt);
        System.out.println("뉴욕의 회의 시간: " + newYorkLdt);



    }
}
