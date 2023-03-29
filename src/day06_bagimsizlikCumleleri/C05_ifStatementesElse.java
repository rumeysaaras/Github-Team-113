package day06_bagimsizlikCumleleri;

import java.util.Scanner;

public class C05_ifStatementesElse {
    public static void main(String[] args) {

        // eğer bir olay için sadece iki olasılık varsa ve bu olasılıklardan birisi
        // mutlaka olacaksa if else kullanılır

        Scanner scan =new Scanner(System.in);

        System.out.println("Ltfen notunuzu giriniz");

        double not= scan.nextDouble();

        if (not>= 50 && not<=100) {
            System.out.println("sınıfı gectın");
        }else {
            System.out.println("maalesef kaldınız");
        }


        // kullanıcıdan pozitif bir tam sayı alın
        // sayının tek veya cift oldugunu yazdırın

        System.out.println("pozitif bir tamsayı giriniz");
        int sayi= scan.nextInt();
        if (sayi %2 == 0) {
            System.out.println("girilen sayi çift sayi");
        } else {
            System.out.println("girilen sayi tek sayi");
        }


        // kullanıcıdan bir tam sayı alın
        // 5 ile bolunup bolunmedıgını yazdırın

        if (sayi %5 ==0) {
            System.out.println("sayi 5 ile bölünebilir");
        }else {
            System.out.println("sayi 5 ile tam bölünmez");
        }





    }
}
