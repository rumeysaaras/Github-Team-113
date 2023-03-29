package day15_doWhileLoop_scope;

import java.util.Scanner;

public class C01_WhileLoop_RakamlarToplamıBulma {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("rakamları toplanacak pozitif tamsayı giriniz");
        int girilensayi = scan.nextInt();

        int sayi=girilensayi;
        int birlerBasamagi=0;
        int rakamlarToplami=0;

        // sayı sıfır oluncaya kadar birler basamagını bulmak için
        // modulus yaparak kalan buluruz yani 10 a böleriz

        while (sayi>0){

            birlerBasamagi=sayi%10;
            rakamlarToplami+=birlerBasamagi;
            sayi/=10;

        }
        System.out.println("girilen " +girilensayi+ "nin rakamlar toplamı : "+rakamlarToplami);

       // System.out.println("girilen toplam :"+ C02_RakamlarToplamınıBulMethodu);
    }
}
