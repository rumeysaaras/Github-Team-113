package day14_methodOverloading;

import java.util.Scanner;

public class C06_whileLoop {
    public static void main(String[] args) {

        // kullanıcıdan toplamak üzere sayıkar alın
        // toplam 500 ü aşınca
        // kac sayı girdiğini ve sayılar toplamını yazdırın

        Scanner scan=new Scanner(System.in);

        int girilenSayi=0;
        int toplam=0;
        int girilenSayiAdedi=0;

        while (toplam<500) {

            System.out.println("Toplamak üzere bir tamsayı giriniz");

            girilenSayi= scan.nextInt();

            toplam+=girilenSayi;

            girilenSayiAdedi++;
        }

        System.out.println(" toplam " + girilenSayiAdedi + " adet sayı girildi " + toplam);



    }
}
