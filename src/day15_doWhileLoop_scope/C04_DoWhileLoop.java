package day15_doWhileLoop_scope;

import java.util.Scanner;

public class C04_DoWhileLoop {
    public static void main(String[] args) {

        /*
        kullanıcıdan toplanmak uzere sayılar alın
        kullanıcıya bitirmek için sıfıra basmasını söyleyin
        kullanıcı sıfıra basınca sıfır hariç kac sayı girildigini
        ve toplamlarını yazdırın
         */

        Scanner scan = new Scanner(System.in);

        int girilenSayi = 1;
        int toplam = 0;
        int sayiAdedi = 0;

       /* while (girilenSayi != 0) {
            System.out.println("Lütfen bir sayi giriniz" + "bitirmek için 0'a basınız");
            girilenSayi = scan.nextInt();
            if (girilenSayi != 0) {
                toplam += girilenSayi;
                sayiAdedi++;
            }
        }

        */

        do {
            System.out.println("Lütfen bir sayi giriniz" +
                    "\nbitirmek için 0'a basınız");
            girilenSayi = scan.nextInt();
            if (girilenSayi != 0) {
                toplam += girilenSayi;
                sayiAdedi++;
            }
        } while (girilenSayi != 0) ;
        System.out.println("Girilen " + sayiAdedi + " adet sayinin toplami : " + toplam);
        }



}