package day36_exeption;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C02_KullanicininGirdigiDegerleriToplama {

    public static void main(String[] args) {

        /*
        kullanıcıdan istediği kadar tamsayı alıp toplayın
        kullanıcı q ya bastıgında islemi sonlandırıp
        kac sayı girildiğini ve toplamını yazdırın
        q veya Q dısında tamsayı olmayan bir deger girilirse
        hata mesajı verip yeni değer isteyerek işeleme devam edin

         */

        int sayac=0;
        int toplam=0;
        int girilenSayi=0;
        Scanner scan= new Scanner(System.in);

       do{
           System.out.println("Toplamak üzere tamsayi giriniz \n Bitirmek için q ya basın");
           try {
               girilenSayi = scan.nextInt();
               toplam += girilenSayi;
               sayac++;
           }catch (InputMismatchException e){
               char input=scan.next().charAt(0);
               if (input=='q' ||input=='Q'){
                   System.out.println("girilen "+ sayac+ "adet tamsaynin toplamı :"+ toplam);
                   break;
               }else {
                   System.out.println("Hatalı giriş, lütfen tekrar deneyiniz");
               }
           }

       }while (true);
    }
}
