package day36_exeption;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C05_cokluExeption {
    public static void main(String[] args) {

        String str="Java her gecen gün güzelleşiyor";
        int[] arr={3,4,5,6,7,8,4,2,5,7};

        /*
        kullanıcıdan 0 veya pozıtıf bir tamsayı isteyin
        girilen degeri index olarak kullanıp
        str ve arr nin o indexteki elemanlarını yazdırın
         */

        Scanner scan =new  Scanner(System.in);
        System.out.println("index olarak kullanmak için 0 veya pozitif bir tamsayi giriniz ");

        /*
        birbirinden bağımsız 3 farklı exeption riski var
        farklı sekillerde handle edebiliriz
        1- herbirini ayrı ayrı tryCatch yapılabilir
        2- tek bir try birden fazla chatch yapabiliriz
        3- tek bir tryCatch yapıp tum exeptıonları yakalayacak bir exeptıon turu yazabiliriz

         */

        try {
            int index = scan.nextInt(); // InputMismatchException
            System.out.println(str.charAt(index)); // StringIndexOutOfBoundsException
            System.out.println(arr[index]); // ArrayIndexOutOfBoundsException
        } catch (RuntimeException e) {
            // System.out.println("giris hatali olabilir, index String veya array'in disinda olabilir");
            e.printStackTrace();
            // biz mesaj yazacaksak genel bir mesaj yazabiliriz
            // veya javanin hata kodlarini yazdirabiliriz
        }

        try {
            int index =scan.nextInt();//InputMismatchException

            System.out.println(str.charAt(index));//StringIndexOutOfBoundsException

            System.out.println(arr[index]);//ArrayIndexOutOfBoundsException
        } catch (InputMismatchException e) {
            System.out.println("tamsayi girmelisin");
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("girilen index String sınırları dısında");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("girilen index Array sınırları dışında");
        }

    }
}
