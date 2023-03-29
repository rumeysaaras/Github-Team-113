package day18_multiDimensionalArrays;

public class C05_MDA {
    public static void main(String[] args) {

        int[][] arr= {{3,5,7},{1,2,3,4},{1,2},{7}};

        // toplam element sayısı kactır

        int elementSayisi=0;

        for (int i = 0; i < arr.length ; i++) {
            elementSayisi += arr[i].length;

        }
        System.out.println("toplam elemet sayısı :" + elementSayisi);

        //tum elementlerın toplamını bulun
        //kat sayısı kadar iç içe nested-forlopp olusturun

        int elementlerToplami=0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
               elementlerToplami+= arr[i][j];

            }

        }

    }
}
