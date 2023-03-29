package day18_multiDimensionalArrays;

import java.util.Arrays;

public class C02_StringSplitMethodu {
    public static void main(String[] args) {

        // bir stringi istediğimiz parcalara ayırmak için kullanılır

        String str= "Java candir can";
        // str kac kelimedir

        String[] kelimeler=str.split(" ");
        System.out.println(Arrays.toString(kelimeler)); // [Java, candir, can]
        System.out.println("kelime sayisi : " + kelimeler.length);
        // en uzun kelime kac harflidir ?
        int enUzunKelimeLength=kelimeler[0].length();
        for (int i = 0; i < kelimeler.length ; i++) {
            if (kelimeler[i].length()>enUzunKelimeLength){
                enUzunKelimeLength= kelimeler[i].length();
            }
        }
        System.out.println("En uzun kelimenin karakter sayisi : " + enUzunKelimeLength);

        // bir string'i karakterlerine ayirmak istersek

        String[] karakterler = str.split(" ");
        System.out.println(Arrays.toString(karakterler));
        System.out.println("Cumledeki karakter sayisi : " + karakterler.length);


    }
}
