package day13_methodOlusturma;

import java.util.Scanner;

public class C06_methodKullanma {
    public static void main(String[] args) {

        // verilen bişr stringin palındrome olup olmadıgını yazdırın

        Scanner scan=new Scanner(System.in);

        System.out.println("lütfen bir metin giriniz");
        String metin= scan.nextLine();
        String tersmetin=C05_StringiTerseCevirme.stringTersineCevir(metin);

        if (metin.equals(tersmetin)) {
            System.out.println("girilen mertin palindrome");
        }else {
            System.out.println("girilen metin palındrome değil");
        }
    }
}
