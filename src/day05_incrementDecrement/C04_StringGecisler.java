package day05_incrementDecrement;

public class C04_StringGecisler {
    public static void main(String[] args) {

        String s1= "423";

        //s1 i int a cevirmek

        int sayi= Integer.parseInt(s1);  //423
        System.out.println(sayi++);     //423

        int a =20;
        int b =40;
        // bu iki sayiyi kullanarak 2040 yazdırın

        System.out.println(a+b);
        System.out.println(a+" "+b); // 20 40
        System.out.println(a+""+b);  //2040

    }
}
