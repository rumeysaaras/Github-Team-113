package day20_arrayList;

import java.util.List;
import java.util.ArrayList;

public class C10_listElementlerininYeriniDegistirme {
    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(1);
        sayilar.add(4);
        sayilar.add(3);
        sayilar.add(7);
        sayilar.add(10);

        //2. ve 5 yi değiştirin

        System.out.println(sayilar);

        int temp=sayilar.get(2);

        sayilar.set(2,sayilar.get(5));

        sayilar.set(5,temp);
        System.out.println(sayilar);


    }
}
