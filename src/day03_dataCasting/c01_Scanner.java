package day03_dataCasting;

import java.util.Scanner;
import java.util.concurrent.ScheduledFuture;

public class c01_Scanner {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("lutfen isminizi giriniz");

        String isim=scan.nextLine();

        System.out.println("lutfen soyisminizi yaziniz");

        String soyisim=scan.nextLine();

        System.out.println("lutfen yasinizi giriniz");

        double yas =scan.nextDouble();

        System.out.print("kaydiniz basariyla tamamlanmıstir");

        /*

        System.out.println("Isminiz :" + isim);
        System.out.println("soyisminiz" + soyisim);
        System.out.println("yasiniz" + yas);
        System.out.println("kaydiniz basariyla tamamlanmıstir");

         */

        /*
        System.out.print("Isminiz :" + isim);
        System.out.print("soyisminiz" + soyisim);
        System.out.print("yasiniz" + yas);
        System.out.print("kaydiniz basariyla tamamlanmıstir");

        ln yazdırma işlemini yaptıktan sonra alt satıra geçmesini sağlar
        sadece print olursa yan yana yazar
         */

        System.out.println("isminiz :" +isim+
                             "\nyasiniz:" +soyisim);

        /* string bir ifadenin içinde \n yazdığımız yerde alt saıra geçirir
         */










    }
}
