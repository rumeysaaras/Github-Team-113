package day25_passByValue_ImmutableClasess;

import java.time.LocalTime;
import java.util.Locale;

public class C05_DateTime {
    public static void main(String[] args) {

        LocalTime saat=LocalTime.now();
        System.out.println(saat);

        System.out.println(saat.getNano());// nano saniye verir

        // bir loop ile  den 10000 e kadar olan sayıları toplayın
        //ve bu işlemin kac nanosanoıye surdugunu bulun

        int toplam=0;

        int baslamaSuresiNano= saat.getNano();
        for (int i = 1; i < 10000; i++) {
            toplam+=i;
        }
        int bitisSuresiNano=saat.getNano();

        System.out.println("iişlem süresi :"+(bitisSuresiNano-baslamaSuresiNano));
    }
}
