package day03_dataCasting;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {

        // kullanıcıdan bir çemberin yaricapını alıp, çevresini ve alanını yazdırın.

        Scanner scan =new Scanner(System.in);

        System.out.println("Lutfen cemberin yaricapini girirniz");

        // kullanıcının girdidiği bilgiyi kaydedebilecek data türünde bir veriable oluşturun
        // bilgiyiy almak için scan objesini ve ilgili next methodu kullan


        double yaricap = scan.nextDouble();

        // çevre ve alanı yazdır

        System.out.println("çemberin çevresi : "+2*3.14* yaricap);

        System.out.println("dairenin alanı : " +3.14 * yaricap *yaricap );





    }


}
