package day06_bagimsizlikCumleleri;

import java.util.Scanner;

public class C02_ifStatements {
    public static void main(String[] args) {
         //Soru 1- Kullanicidan bir sayi isteyin,
        // sayiyi kontrol edip 5 ile bolunebiliyorsa “Sayi 5’in tam kati” yazdirin.

        Scanner scan =new Scanner(System.in);

        System.out.println("Lutfen pozıtıf bor tamsayı gırınız");

        int sayi= scan.nextInt();

        if (sayi % 5 == 0){
            System.out.println("sayi 5in tam katı");
        }

        //Soru 3- Kullanicidan bir sayi alin,
        // sayi 3 ile bolunuyorsa “Uc ile bolunebilen sayi”,
        // 5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin.

        if (sayi % 3 == 0){
            System.out.println("uc ıle bolunebilen sayi");
        }




    }
}
