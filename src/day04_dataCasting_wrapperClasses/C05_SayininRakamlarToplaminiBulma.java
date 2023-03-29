package day04_dataCasting_wrapperClasses;

import java.util.Scanner;

public class C05_SayininRakamlarToplaminiBulma {
    public static void main(String[] args) {

        // kullanıcıdan 3 basamaklı bir sayı alın
        // ve sayının rakamlar toplamını yazdırın

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen üç basamaklı pozitif bir sayi giriniz");

        int girilenSayi=scan.nextInt(); // 135

        int rakam=girilenSayi % 10 ;

        int rakamlarToplami= rakam;

        girilenSayi=girilenSayi %10;

        System.out.println(rakam); //5

        girilenSayi=girilenSayi / 10;

        rakam=girilenSayi %10;

        rakamlarToplami= rakamlarToplami + rakam;

        girilenSayi=girilenSayi/10;

        System.out.println("girilen sayının rakamlar toplamı ");





    }
}
