package day06_calisma;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class a2 {
    public static void main(String[] args) {

        // odev : verilen bir listede istenen 2 index'deki elmentlerin yerini degistirip
//        yeni listeyi bize donduren bir method olusturun

        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(3);
        sayilar.add(7);
        sayilar.add(9);
        sayilar.add(6);


        System.out.println(sayilar);

        int temp=sayilar.get(2);

        sayilar.set(2,sayilar.get(3));

        sayilar.set(3,temp);
        System.out.println(sayilar);
    }
}
