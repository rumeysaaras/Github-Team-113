package day03_dataCasting;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {

        // kullanıcıdan iki sayı alıp yerlerini değiştiin(swap)

        // kullanıcı sayı1=10 sayı2=20 girdiğinde
        //sayı1 in yeni değeri=20

        Scanner scan=new Scanner(System.in);

        System.out.println("sayi1'i giriniz");

        int sayi1 = scan.nextInt();

        System.out.println("sayı2'yi giriniz");

        int sayi2 = scan.nextInt();

        int temp=0;
        temp=sayi2;
        sayi2=sayi1;
        sayi1=temp;

        System.out.println(" sayi1 :" +sayi1);
        System.out.println("sayi2 :" +sayi2);

    }
}
