package day26_localTime_varargs;

import java.time.LocalTime;

public class C01_LocalTime {
    public static void main(String[] args) {

        LocalTime saat=LocalTime.now();
        System.out.println(saat);

        System.out.println(saat.getHour());

        System.out.println(saat.plusHours(2).plusMinutes(10));

        System.out.println(saat.minusMinutes(10).minusSeconds(20));

        System.out.println(saat.minusSeconds(10).withNano(20));

        System.out.println(saat.compareTo(saat));

        System.out.println(saat.isAfter(saat));

        System.out.println(saat.toSecondOfDay());
    }
}
