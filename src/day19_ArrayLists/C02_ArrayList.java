package day19_ArrayLists;

import day17_arrays.C06_ArrayElemanEklemeMethodu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_ArrayList {
    public static void main(String[] args) {

        /*
        ArrayList uzunlugu esnek bir array dir
        Array alt yapısımı kullanır
        ancak ekleme ve silme gibi işlemlerde daha avantajlıdır

        tek dezavantajı elementleri tek tek eklemesi
         */

        int []arr= {3,4};
        arr=C06_ArrayElemanEklemeMethodu.arrayeElementEkle(arr,5);
        arr=C06_ArrayElemanEklemeMethodu.arrayeElementEkle(arr,15);

        System.out.println(Arrays.toString(arr));

        List<String> harfler=new ArrayList<>();
        System.out.println(harfler);
        harfler.add("s");
        harfler.add("l");
        harfler.add("a");
        System.out.println(harfler); //[s, l, a]


    }
}
