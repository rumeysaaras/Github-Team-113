package day03_dataCasting;

import java.util.Scanner;

public class C02_Scanner {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        // isterseniz tek bir açıklama ile 3 bilgigiyi de alabilirsiniz.

        System.out.println("lutfen isminizi,soyisminizi ve yasinizi giriniz" +
                "\nher bilgiden sonra enter'a basiniz");

        char isimİlkHarf= scan.nextLine().charAt(0);

        String soyisim =scan.nextLine();
        double yas =scan.nextDouble();

        System.out.println("Girilen bilgiler :"+ isimİlkHarf +","+ yas);













    }
}
