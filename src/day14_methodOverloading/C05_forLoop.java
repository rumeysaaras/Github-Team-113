package day14_methodOverloading;

import java.util.Scanner;

public class C05_forLoop {
    public static void main(String[] args) {

        /*
        başlangıuc ve bitiş degeri belli olan
        ve kac kez tekrar edecegi belli olan looplarda
        for loop ideal olarak kullanılır

        ancak belli değilse while loop tercih edilir
         */

        // 50ve 100 arasındaki ( sınırlar dahıl)
        // sayıları toplayın

        int toplam=0;

        for (int i = 50; i <100 ; i++) {
            toplam+=i;

        }

        System.out.println("toplam : "+toplam);



        // aynı soruyu whileloop la yaoalım
        // for loop da 3 şeyi takip ederiz
        // 1- başlangıc degeri
        // 2- bitiş değeri
        // 3- artıs ve azalış sekli

        toplam=0;
        int sayi=50;
        while (sayi<100){
            toplam+=sayi;
            sayi++;

        }
        System.out.println("while ile toplam :" + toplam);




    }
}
