package day22_constructor;

public class C02_Hemsire {

    /*
    örnegin bir hastane programında hastanede calısacak hemsirelerin
    hangi bilgilerini tutmak istıyorsak bir hemsire classı olusturup
    tum bu ozellikleri o class da olustururuz

    programda ne zaman bir hemsireye ihtıyac olsa bu hemsıre classın dan obje olustururuz
    böylece otomatık olarak tum ozellıklere sahıp olur

    eger biz istedidiğimiz parametrelere sahip bir consturactor olusturmazsak
    java class dan obje olusturabilmesi için
    classa default bir constructor koyar

    default constructor gorunmez
    parametresi yoktur
    cons. body si bostur

    C02_Hemsire (){

    }


     Biz de istedigimiz parametrelere sahip,
        istedigimiz kadar constructor olusturabiliriz

        COK ONEMLI : Eger biz bir constructor olusturursak
                     yani class'da gozle gorunen bir constructor varsa
                     Java default constructor'i siler
                     Bizim olusturdugumuz hic bir constructor'a default constructor DENEMEZ

     */


    String isim="isim atanmamış";
    String soyisim="soyisim atanmamış";
    String telNo;
    String adres;
    int yas;
    boolean izindemi;
    char evlimi;
    int ekMesaiUcreti=20;



    public int mesaiUcretiHesapla(int mesaiSaati){

        return mesaiSaati*ekMesaiUcreti;
    }
}
