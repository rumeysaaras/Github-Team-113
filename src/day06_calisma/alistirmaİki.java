package day06_calisma;

import java.util.Arrays;

public class alistirmaİki {
    public static void main(String[] args) {

        int[][] arr ={{1,2,3,4,5},{7,8,9,9,0,6},{3,3,3,3,3,3}};

        System.out.println(arr[2][4]);
        System.out.println(arr.length);

        int list=0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                list++;
            }
        }

    }
}
