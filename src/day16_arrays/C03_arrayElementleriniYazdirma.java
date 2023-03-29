package day16_arrays;

import java.util.Arrays;

public class C03_arrayElementleriniYazdirma {
    public static void main(String[] args) {

        int[] arr={3,4,5,5,4,5,5};

        //tüm array i yazdırın

        System.out.println(Arrays.toString(arr));

        //array in tüm elementlerini yanyana aralarında boşluk olarak yazdırın

        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]+" ");

        }
    }
}
