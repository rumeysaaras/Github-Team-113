package day13_methodOlusturma;

public class C03_Faktoryel {
    public static void main(String[] args) {

       //verdiğimiz bir sayının faktoryelini hesaplayıp
        // sonucu bize bildiren bir method olustur

        int sonuc=faktoryelHesapla(5);

        System.out.println(sonuc);
        /*
         method olusturma aşamaları
         1- publıc statıc standart
         2- olusturdugumuz method bize bir sonu dondurecekse
             döndürecegi sonucun data turunu yazarız
         3- method ismi
         4- method parantezi () içine methoda göndermemiz gereken bilgileri hangi
            veriable ile göderecegimşzi yaz (parametre)
         5- döndurulmrsi istnen işlemi yap
         6- return keyword kullanarak döndurulmesi istenen degeri döndur



         */
    }

    public static int faktoryelHesapla(int sayi){  //5

        int faktoryel=1;
        for (int i =sayi; i>1; i--) {
            faktoryel *=1;
        }
        return  faktoryel;

    }
}
