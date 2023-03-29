package day06_bagimsizlikCumleleri;

import java.util.Scanner;

public class C07_ifElseStatements {
    public static void main(String[] args) {

        //Soru 4- Kullanicidan bir karakter girmesini isteyin,
        // girilen karakterin buyuk harf olup olmadigini yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("bir karakter giriniz");
        char krk = scan.next().charAt(0);

        // r === a ile z arasında mı?

        if ('A'<= krk && krk <= 'Z') {
            System.out.println("girilen karakter büyük harf");
        }else{
            System.out.println("girilrn karkter büyük harf değil");

        }
    }
}
