package day02_dataTurleri_Scanner;

import java.util.Scanner;
import java.util.StringJoiner;

public class C04_Scanner {

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);

        System.out.println("lutfen isminizi giriniz");

        String kullaniciIsmi = scan.next();

        System.out.println("girilen isim : " + kullaniciIsmi);




    }
}
