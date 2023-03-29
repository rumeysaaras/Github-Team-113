package day08_nestedIfElse_ternary;

import java.util.Scanner;

public class C04_ternary {
    public static void main(String[] args) {

        // kullanıcıdan bi sayı alın
        // sayı cifft ise "sayı cıft"
        // sayı tek ise "sayı tek" yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen pozıtıf bır tamsayı giriniz");
        int sayi = scan.nextInt();

        if (sayi%2==0) {
            System.out.println("çift sayi");
        }else {
            System.out.println("tek sayi");
        }

        System.out.println(sayi%2==0 ? " çift sayi" : "tek sayi");

    }
}
