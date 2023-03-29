package day08_nestedIfElse_ternary;

import java.util.Scanner;

public class C03_NestedIfElse {

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("lütfen yasinizi giriniz");

        double yas= scan.nextDouble();

        System.out.println("lütfen cinsiyrtinizi giriniz.." +
                "\nkadin için : K, erkek için : E giriniz ");

        char cinsiyet=scan.next().charAt(0);

        if (yas<16 || yas>80 ) {
            System.out.println("gecersiz yas");
        } else if (yas<60 ) {  // 16-60 yas arası
        } else if (yas>65 ) {
        } else {



        }

    }
}
