package day06_bagimsizlikCumleleri;

public class C01_ifStatements {

    public static void main(String[] args) {

        /*
        buradaki şartlar birbirinden bağımsızdır
        uygun sayilar olursa 3 if body'si calişabilir
        bazen de hicir if body devreye giremez
         */

        int a =200;
        int b =30;

        if (a>b);{
            System.out.println("a b'den buyuk");
        }
        if (a%2==0){
            System.out.println("a cift sayidir");
        }
        if (b>100){
            System.out.println("b 100 den büyüktür");
        }
        // sadece ilk ikisini yazdı çünkü diğeri şartı sağlamıyor

        boolean sonuc =a*7 > b ;

        if (sonuc == true){
            System.out.println("istenen sonuc saglandı");
        }


    }
}
