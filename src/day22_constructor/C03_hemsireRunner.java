package day22_constructor;

public class C03_hemsireRunner {
    public static void main(String[] args) {

        /*
            bir obje olustururken parametre olarak hic bir deger girilmezse
            olusturulan obje, olusturuldugu class'daki variable'lara atanan degerleri alir
            eger obje olusturulan class'da deger atamasi yoksa, Java default degerleri atar
         */



        C02_Hemsire hemsire1=new C02_Hemsire();

        System.out.println(hemsire1.isim);
        System.out.println(hemsire1.soyisim);
        System.out.println(hemsire1.yas);
        System.out.println(hemsire1.izindemi);

        hemsire1.isim="Tuba";
        hemsire1.yas=29;

        System.out.println(hemsire1.isim);
        System.out.println(hemsire1.yas);


    }
}
