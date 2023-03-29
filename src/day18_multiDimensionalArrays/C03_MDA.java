package day18_multiDimensionalArrays;

import java.util.Arrays;

public class C03_MDA {
    public static void main(String[] args) {

        int[][] arr= {{3,4,5},{2,3},{1}};

        //int [][] iki katlı array belitrir
        // ilk köşeli parantez ana arrayi (outerArray) i kontrol eder
        // ikinci ise içerdekileri (innerArray) kontrol eder

        System.out.println(arr[1][1]); //3
        System.out.println(arr[0][2]);//5
        System.out.println(arr[2].length); //1
        System.out.println(arr[1]); //[I@56cbfb61
        System.out.println(Arrays.toString(arr[1]));//2 3

        System.out.println(Arrays.deepToString(arr)); // tüm arrayi yazdırmak için deep.toString

        System.out.println(arr.length); //3
    }
}
