package day17_arrays;

import java.util.Arrays;

public class C08_sort_biarySearch {
    public static void main(String[] args) {

        // verilen bir array i natural order a göre sıralamak için
        // Arrays.short() kullanılır

        int[] arr1={1,2,3,4,5};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        String [] arr2={"hasan","hüseyin","mert","ali","mercan"};
        // natural (dogal) oldugu ıcın alfabetik siralar

    Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        // sort yapildiktan sonra
        // array'de bir elementin var oldugunu kontrol etmek icin

        System.out.println(Arrays.binarySearch(arr2, "ali")); //



    }
}
