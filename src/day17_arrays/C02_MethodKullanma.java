package day17_arrays;

public class C02_MethodKullanma {
    public static void main(String[] args) {

       /*
        Soru 4- Verilen bir array’de istenen
        bir elemanin var olup olmadigini ve varsa kac kere
        kullanildigini yazdiran bir method olusturun.
        */

        int[]arr1={2,4,3,6,4,5,2,2};

        elemanSayisiYazdir(arr1,3); // 1
        elemanSayisiYazdir(arr1,2); // 3

        String[] arr2 = {"E","H","K","I","E"};

        elemanSayisiYazdir (arr2,"E"); // 2


    }
    public static void elemanSayisiYazdir (int[]arr , int arananElement){

        int sayac=0;

        for (int i = 0; i < arr.length ; i++) {

            if (arr[i] == arananElement){
                sayac++;
            }
        }
        System.out.println(sayac);
    }

    public static void elemanSayisiYazdir (String[]arr , String arananElement){

        int sayac=0;

        for (int i = 0; i < arr.length ; i++) {

            if (arr[i].equals(arananElement)){
                sayac++;
            }
        }
        System.out.println(sayac);
    }


}