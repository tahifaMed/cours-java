import java.time.*;
import java.time.format.DateTimeFormatter;

public class Exercise01 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate fromValues = LocalDate.of(2025,12,7);
        System.out.println(fromValues);

        fromValues = fromValues.plusMonths(1);
        System.out.println(fromValues);
        System.out.println(fromValues.isAfter(today));

        LocalTime now = LocalTime.now();
        System.out.println(now);

        System.out.println(LocalTime.parse("12:00:01"));
        LocalDateTime dt3 = LocalDateTime.parse("2024-12-25T14:30:45");
        System.out.println(dt3);

        // 24 octobre 2025 11:00:00--> heure d'été 24 octobre 2025 11:00:00 +2:00
        // 25 octobre 2025 11:00:00--> heure d'hiver 25 octobre 2025 11:00:00 +1:00

        ZonedDateTime dateTimeUSA = ZonedDateTime.now(ZoneId.of("America/New_York"));
        ZonedDateTime dateTimeUTC = ZonedDateTime.now(ZoneId.of("UTC"));
        ZonedDateTime dateTimeParis = ZonedDateTime.now();

        dateTimeUTC = dateTimeUTC.withNano(0).withSecond(0);
        dateTimeParis = dateTimeParis.withNano(0).withSecond(0);
        System.out.println(dateTimeUSA);
        System.out.println(dateTimeUTC);
        System.out.println(dateTimeParis);
        System.out.println(dateTimeParis.isAfter(dateTimeUTC));
        System.out.println(dateTimeParis.isBefore(dateTimeUTC));


        LocalDate date1 = LocalDate.of(2024, 1, 15);
        LocalDate date2 = LocalDate.of(2025, 3, 25);

        Period period = Period.between(date1, date2);

        System.out.println(period);

        System.out.println("Années : " + period.getYears());    // 1
        System.out.println("Mois : " + period.getMonths());     // 2
        System.out.println("Jours : " + period.getDays());

        LocalTime time1 = LocalTime.of(10, 0, 0);
        LocalTime time2 = LocalTime.of(15, 30, 45);

        Duration duration = Duration.between(time1, time2);

        LocalTime time3 = LocalTime.now().plus(duration);
        System.out.println(time3);

        DateTimeFormatter formatter6 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

        LocalDateTime dateTime1 = LocalDateTime.parse("2024/12/25 14:30:45", formatter6);
        System.out.println(dateTime1);
    }
}

