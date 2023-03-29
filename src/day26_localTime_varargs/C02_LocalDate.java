package day26_localTime_varargs;

import java.time.LocalDate;
import java.time.LocalTime;

public class C02_LocalDate {
    public static void main(String[] args) {

        LocalDate tarih =LocalDate.now();
        System.out.println(tarih);

        System.out.println(tarih.isLeapYear()); // artık yıl mı dıye bakar

        LocalDate tarih2=LocalDate.of(2020,10,10);
        System.out.println(tarih2.isLeapYear());

        System.out.println(tarih.plusWeeks(20).plusDays(2));

        System.out.println(tarih.getMonth());

        System.out.println(tarih.getMonthValue());
    }
}
