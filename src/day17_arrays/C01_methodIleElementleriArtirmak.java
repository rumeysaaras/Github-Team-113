package day17_arrays;

import java.util.Arrays;

public class C01_methodIleElementleriArtirmak {
    public static void main(String[] args) {

        // Soru 1- Verilen bir int array’in tum elemanlarini 2 artirip
        // bize donduren bir method olusturun. Eski array’i yeni haliyle kaydedin.

        int[] arr={3,4,5,6};

        arr= arrayElementleriniArtirir(arr,2);
        System.out.println(Arrays.toString(arr));

    }

    public static int[] arrayElementleriniArtirir(int[] ilkArr, int artis) {
        for (int i = 0; i < ilkArr.length; i++) {
            ilkArr[i] +=artis;
        }
        return  ilkArr;
    }

}
