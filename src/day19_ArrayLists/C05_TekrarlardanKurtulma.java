package day19_ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_TekrarlardanKurtulma {
    public static void main(String[] args) {

        // verilen bir array den tekrar eden sayıları sılıp
        // her bir elementin sadece bir kez
        //kullanıldıgı bir hale dönüşturun

        int [] arr = {3,4,5,5,6,6,9,7,6,3,8,9,7,8,};

        // bir tane boş list olusturalım
        // array daki her bir elemanı ele alalım
        // bu list de varsa ekleyelim yoksa eklemeyelim
        // böylece benzersiz elementlerden olusan bir list olusturalım

        List benzersizElementlerList =new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (!benzersizElementlerList.contains(arr[i])){
                benzersizElementlerList.add(arr[i]);
            }

        }
        System.out.println(benzersizElementlerList); //[3, 4, 5, 6, 9, 7, 8]

        arr= new int[benzersizElementlerList.size()];

        for (int i = 0; i < arr.length; i++) {

           // arr [i] = benzersizElementlerList.get(i);

        }

        System.out.println(Arrays.toString(arr)); //[3, 4, 5, 5, 6, 6, 9, 7, 6, 3, 8, 9, 7, 8]




    }
}
