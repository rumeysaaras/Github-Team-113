package day06_bagimsizlikCumleleri;

import java.util.Scanner;

public class C06_ifElseStatemnts {
    public static void main(String[] args) {

        //Soru 3- Kullanicidan yasini isteyin,
        // 65 yas ve uzeri ise “Emekli olabilirsin” yazdirin,
        // yoksa emekli olmasi icin calismasi gereken yil sayisi

        Scanner scan=new Scanner(System.in);

        System.out.println("lutfen yasinizi giriniz");

        double yas=scan.nextDouble();
        if (yas>=65){
            System.out.println("emekli olabilirsin");
        }else {
            System.out.println("emekli olmak için daha" +(65-yas)+"yıl calısmalısın");
        }
    }
}
