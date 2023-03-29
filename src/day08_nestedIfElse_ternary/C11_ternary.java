package day08_nestedIfElse_ternary;

import java.util.Scanner;

public class C11_ternary {
    public static void main(String[] args) {

        // kullanıcıdan bir harf isteyin o harfle baslayan gun ismi varsa
        // yazdırın yoksa gecersiz harf yazdırın

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen bir harf giriniz");
        char harf=scan.next().charAt(0);
        harf=Character.toUpperCase(harf);

        if (harf=='P'){
            System.out.println("pazar,pazartesi,persembe");
        } else if (harf=='S') {
            System.out.println("sali");
        } else if (harf=='C') {
            System.out.println("carsamba, cuma,cumartesi ");
        }else {
            System.out.println("gecersiz gün");
    }

        // daha düzenli ve daha kullanıslı olarak swıtch statement kullanabiliriz
        // ama durdurmazsaniz sona kadar yazdırır
        //breakla durdurun

        switch (harf) {
            case 'S' :
                System.out.println("sali");
                break;
            case 'P':
                System.out.println("pazar,pazartesi,persembe");
                break;
            case 'C':
                System.out.println("carsamba, cuma,cumartesi ");
                break;
            default:
                System.out.println("gecersiz gün");


        }
    }
}
