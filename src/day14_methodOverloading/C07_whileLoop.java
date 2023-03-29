package day14_methodOverloading;

import java.util.Scanner;

public class C07_whileLoop {
    public static void main(String[] args) {

        // kullanıcıdan bir sifre isteyin
        // asagıdakı sartları saglayana kadar
        // her seferinde hataları soyleyıp yeni sifre soyleyın
        // sartları saglayan sıfre olunca kacıncıda basardıgını acıklama yazın

        // ilk harf kucuk harf olmalı
        // son harf buyuk harf olmalı
        // bosluk içermemeli
        // 8 karakter veya daha uzun olmalı

        Scanner scan = new Scanner(System.in);

        String sifre="";
        int flag=0;
        int deneme=0;


        while (flag!= 4){
            flag=0;

            System.out.println("Lütfen bir şifre giriniz");
            sifre=scan.nextLine();

            if (sifre.charAt(0)>= 'a' && sifre.charAt(0)<'z'){
                flag++;
            }else {
                System.out.println("ilk harf küçük harf olmalı");
            }

            if (sifre.charAt(sifre.length()-1)>= 'A' && sifre.charAt(sifre.length()-1)<='Z'){
                flag++;
            }else {
                System.out.println("Son karakter buyuk olmalı");
            }

            if (sifre.contains(" ")){
                System.out.println("Sifre bosluk içermemeli");
            }else {
                flag++;
            }

            if (sifre.length()>=8){
                flag++;
            }else {
                System.out.println("Uzunluk en az 8 karakter olmalı");
            }
            deneme++;
        }
        System.out.println("Tebrikler " + deneme + " deneme ile şifreniz baarıyla kaydedildi");

    }
}
