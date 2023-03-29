package day35_Interface;

import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

import static day35_Interface.I01_Interface.sayi;

public class C04_exeptions {
    public static void main(String[] args) {

        int sayi1 = 20;
        int sayi2 = 5;

        System.out.println(sayi1 / sayi2);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir tamsayi giriniz");
        int sayi3 = 0;
       /*
        try {
            sayi3 = scanner.nextInt();
        } catch (InputMismatchException.)
        System.out.println("tam sayı dediiikkkk...")
    }

        if (sayi3==0){
            System.out.println("sifir giremezsiniz");
        }else {
            System.out.println(sayi1 / sayi3);
        }
*/
    }
}
