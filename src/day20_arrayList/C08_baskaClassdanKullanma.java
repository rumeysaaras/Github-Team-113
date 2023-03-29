package day20_arrayList;

public class C08_baskaClassdanKullanma {
    public static void main(String[] args) {
        // verilen sayinin pozitif tam bölenleri listesi 10 dan coksa guzel
        // yoksa ktu yazdırın

        int sayi =1009;

        int pozitifTamBolenlerSayisi=C07_tamBolenler.pozitifBolenleriListele(sayi).size();
        if (pozitifTamBolenlerSayisi>10) {
            System.out.println("Güzel");
        }else {
            System.out.println("Kötü");
        }
    }
}
