package day13_methodOlusturma;

import java.util.Scanner;

public class C02_ikiSayiToplamaMethodu {
    public static void main(String[] args) {

        //kullanıcıdan 2 sayi alıp
        // toplamlarını yazdıran bir method olusturun

        ikiSayiToplamethodu();
        ikiSayiToplamethodu();


    }

    public static void ikiSayiToplamethodu(){

        Scanner scan=new Scanner(System.in);

        System.out.println("toplamak üzere iki sayı alınız");

        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();
        System.out.println("iki sayinin toplamı :" +(sayi1+sayi2));


        }
    }
