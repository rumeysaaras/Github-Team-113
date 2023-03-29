package day20_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C05_istenmeyeniSil {
    public static void main(String[] args) {
        //Soru 3- Verilen String bir listede istenmeyen harf iceren elementleri silip, kalan
        //kismini list olarak bize donduren bir method olusturun


        List<String> liste=C04_kullaniciyaIsimOlusturtma.kullaniciyaListOlusturtma();
        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen kullanılmasını istemediğiniz bir harf girin");
        String istenmeyenHarf =scan.next().substring(0,1);

       List<String> ayiklanmisList= istenmeyenHarfcerensil(liste,istenmeyenHarf);

        System.out.println(ayiklanmisList);
    }

    public static List<String> istenmeyenHarfcerensil(List<String> liste, String istenmeyenHarf) {

        List<String> kalanlarinListesi =new ArrayList<>();

        for (int i = 0; i < liste.size(); i++) {

            if (!liste.get(i).contains(istenmeyenHarf)){
                kalanlarinListesi.add(liste.get(i));

            }

        }
        return kalanlarinListesi;
    }
}
