package day08_nestedIfElse_ternary;

import java.util.Scanner;

public class C05_ternary {
    public static void main(String[] args) {

        // kullanıcıdan bir tam sayı alıp mutlak değerine cevirin

        Scanner scan = new Scanner(System.in);
        System.out.println("lütffen bie tamsayi giriniz");
        int sayi = scan.nextInt();

        if (sayi >= 0){
            System.out.println(sayi);
        }else {
            sayi=sayi*(-1);
            System.out.println(sayi);
        }

        sayi=sayi>=0 ? sayi :sayi*(-1);
        System.out.println(sayi);

    }
}
