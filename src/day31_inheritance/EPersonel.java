package day31_inheritance;

public class EPersonel {

    String isim="isim belirtilmemiş";
    String unvan="personel unvan belirtilmemiş";
    boolean izindeMi;


    public void standartMaas(){
        System.out.println("personel asgari ücreti : " +8500);
    }
    public void ozelSigorta(){
        System.out.println("personelden katkı payı alınarak özel sigorta yapılır");

    }
}
