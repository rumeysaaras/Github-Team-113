package day21_arrayList_ForEachLoop;

public class C02_forEachLoop {
    public static void main(String[] args) {

        int[] arr= {3, 5, 6, 7, 3, 2, 3, 5, 8, 7, 1, 2, 3, 4, 5, 8};

        // array in tum elementlerinin toplamını yazdırın

        // array in elementlerinden 3 ile bölünebilenleri yazdırın

        // arr in elementleri içinde kac tane tek sayı oldugunu bulun

        int toplam=0;
        for (int each:arr
           ){
        toplam+=each;

        }
        System.out.println("Elementler toplamı :" +toplam);


        for (int each:arr
             ) {
            if (each % 3 == 0) System.out.print(each + " ");
        }

            int sayac = 0;


            for (int each: arr
                 ) {
                if (each %2!=0) sayac++;

            }
            System.out.println("Array daki tek sayi adedi :"+sayac);

        }
    }

