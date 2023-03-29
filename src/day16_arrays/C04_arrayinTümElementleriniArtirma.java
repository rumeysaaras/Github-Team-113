package day16_arrays;

import java.util.Arrays;

public class C04_arrayinTümElementleriniArtirma {
    public static void main(String[] args) {

        int[] fiyatlar={15,25,30,10,50};

        // tüm ürünlere 3 tl fiyat duzenlemesı yapın

        for (int i = 0; i < fiyatlar.length ; i++) {

            fiyatlar[i] +=3;

            System.out.println(Arrays.toString(fiyatlar));


        }
    }
}
