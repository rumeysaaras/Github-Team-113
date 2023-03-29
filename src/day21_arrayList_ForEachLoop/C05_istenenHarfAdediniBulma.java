package day21_arrayList_ForEachLoop;

import java.util.Arrays;

public class C05_istenenHarfAdediniBulma {
    public static void main(String[] args) {

        //Soru 4- Kullanicidan bir cumle ve bir harf alin,
        // harf cumlede kullanilmissa kac kere
        //kullanildigini yazdirin, kullanilmadiysa
        // “harf cumlede kullanilmamis” yazdirin.

        String cumle ="Yatin kalkın java calisin";
        String istenenHarf="a";

        String[] karakterler=cumle.split("");
        System.out.println(Arrays.toString(karakterler));

        int sayac=0;
        for (String each:karakterler
             ) {
            if (each.equalsIgnoreCase(istenenHarf)){
                sayac++;
            }
        }
        if (sayac==0) {
            System.out.println("İstenen harf cümlede kullanılmamıs");
        }else {
            System.out.println("istenen harf cumlede " + sayac + " defa kullanılmıştır");
        }
    }
}
