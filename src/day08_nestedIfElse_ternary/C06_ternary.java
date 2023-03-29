package day08_nestedIfElse_ternary;

public class C06_ternary {
    public static void main(String[] args) {

        // ternary operatörü ya direk sout içinde kullanılır
        // veya bir değişkene atama yapılarak yazılır

        int sayi=20;

        System.out.println(sayi%2==0 ? "sayi çift":"sayi tek");

        String sonuc=sayi%2==0 ? "sayi çift":"sayi tek";

        // eger true oldugumdakı sonuc ile false
        // oldugundaki sonuc farklı data türlerinden olursa
        // yazdırılanilir ama atama yapılamaz


        // sayi "sayi cift " yazdırın
        // değilse ikiyle carpın

        System.out.println(sayi%2==0 ? "sayi çift": 2*sayi);


    }
}
