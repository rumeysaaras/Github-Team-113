package day16_arrays;

import java.util.Arrays;

public class C02_arrays {
    public static void main(String[] args) {

        String[] isimler={"Nurefşan","Berk","Mustafa"};
        int[] sayilar={3,4,5,6,7,8,9,4};
        char karakterler[]={'e','a','k'};

        //array non primitive data türlerindendir
        //eger arrayı liste olarak oluşturmayıp
        //new keyword kullanıyorsak uzunlugunu yazmka zorundayız


        String[]arr=new String[5];

        //bir array tanımlanan uzunluktan daha az veya fazla eleman alamaz

        // bir array i yazdırmak istersek
        //arraylar direk yazdırılamaz


        System.out.println(isimler);
        System.out.println(Arrays.toString(sayilar));

        System.out.println(Arrays.toString(arr)); // null null null null null

        int[] a=new int[7];
        System.out.println(Arrays.toString(a));//0 0 0 0 0 0 0

        //array deki elementlere nasıl ulaşırız? indexle

        a[0]=4; //[4, 0, 0, 0, 0, 0, 0]
        a[3]=7; //[4, 0, 0, 7, 0, 0, 0]

        System.out.println(Arrays.toString(a));





    }
}
