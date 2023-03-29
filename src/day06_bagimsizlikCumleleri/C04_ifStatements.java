package day06_bagimsizlikCumleleri;

import java.util.Scanner;

public class C04_ifStatements {
    public static void main(String[] args) {
       // Soru 5- Kullanicidan notunu alin
        // 50 veya daha buyukse “Sinifi Gectin”,
        // 50’den kucukse “Maalesef kaldin” yazdirin

        Scanner scan =new Scanner(System.in);

        System.out.println("Ltfen notunuzu giriniz");

        double not= scan.nextDouble();

        if (not>= 50){
            System.out.println("sınıfı gectın");
        }
        if (not<=50){
            System.out.println("maalesef kaldınız");
        }



    }
}
