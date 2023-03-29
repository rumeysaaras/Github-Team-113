package day19_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class C06_get {
    public static void main(String[] args) {

        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(2);
        System.out.println(sayilar);

        System.out.println(sayilar.get(0)); //3

        // son elementi yazdırın

        System.out.println(sayilar.get(sayilar.size() - 1)); //2

        // 2 yi 12 yap

        System.out.println(sayilar.set(2, 12)); //2
        System.out.println(sayilar.set(1,7)); //5 ( eski değiştirdiği elemaı verir)
        System.out.println(sayilar); //[3, 7, 12]

    }
}
