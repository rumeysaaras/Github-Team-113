package day26_localTime_varargs;

import java.util.Arrays;

public class C09_VararsDikkatEdilecekler {
    public static void main(String[] args) {
        topla(6,8,1,9,4,8);

        /*
        verilen sayılardan ilki hariç diğerlerini toplasın sonra
        toplam ile ilk sayıyı carpıp yazdırsın


         */
    }

        public static void topla(int... a ){
            System.out.println(Arrays.toString(a));

            int toplam=0;
            for (int each:a
            ) {
                toplam+= each;
            }
            System.out.println("toplam : "+toplam);

        }
    }