package day06_bagimsizlikCumleleri;

import java.util.Scanner;

public class C03_ifStatemets {
    public static void main(String[] args) {

       // Soru 4- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        // ucgen eskenar ise “Eskenar ucgen” yazdirin.

        Scanner scan =new Scanner(System.in);

        System.out.println("ucgenın üc kenar uzunlugunu giriniz");

        double kenar1=scan.nextDouble();
        double kenar2= scan.nextDouble();
        double kenar3= scan.nextDouble();

        // java da üclü karsılastırma yoktur
        // onun yerine ikili karsılastırma yapıp && ilr birlestirebiliriz

        if (kenar1 == kenar2 && kenar1 == kenar3){
            System.out.println("girilen kenarlar eskenar ucgen olusturur");

        }
    }
}
