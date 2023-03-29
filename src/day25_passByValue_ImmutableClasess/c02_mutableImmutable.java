package day25_passByValue_ImmutableClasess;

import java.util.ArrayList;
import java.util.List;

public class c02_mutableImmutable {
    public static void main(String[] args) {

        /*
        string ve Wrapper class'lar ımmutable oldukları ıcın değiştirilemezler
        ancak array ve list mutable oldukları için
        atama yapmasak da method kullanınca degerleri değişir
         */

        String str="Java gün geçtikçe daha da keyifli oluyor";

        str.substring(5);
        str.substring(3,15);
        str.startsWith("Java");
        str.toLowerCase();

        System.out.println(str);

        List<Integer> sayilar=new ArrayList<>();

        sayilar.add(5);
        sayilar.add(8);
        sayilar.add(9);

        System.out.println(sayilar);

        sayilar.set(0,7);
        sayilar.remove(1);
        sayilar.set(0,1);


        System.out.println(sayilar);
    }
}
