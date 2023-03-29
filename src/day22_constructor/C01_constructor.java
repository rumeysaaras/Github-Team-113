package day22_constructor;

import day21_arrayList_ForEachLoop.C04_kareleriToplami;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C01_constructor {
    public static void main(String[] args) {

        /*
        bir obje ancak bir classdan olusturulabilir
        bir obje yi olusturdugumuz class aynı zamanda o objenin data turudur

         her obje olusturuldugu classısn ozelliklerinşi tasır

         eger bir programda ortak ozelliklere sahip objeler uretmek uzere
         tasarladıgınız bir class varsa maın method olması zorunlu degildir

         yani o cklass dan aynı ozelliklere sahıp objeler uretmemızı saglar


         */

        Scanner scan=new Scanner(System.in);

        List<String> isimler=new ArrayList<>();

        C04_kareleriToplami obje=new C04_kareleriToplami();

        Random rnd=new Random();

        String str=new String("Ali");

        C02_Hemsire hemsire1=new C02_Hemsire();

        System.out.println(hemsire1.mesaiUcretiHesapla(5));

        String str2;
        Random rnd2;
        List<String> harfler;




    }
}
