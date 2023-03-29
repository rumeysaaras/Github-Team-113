package day22_constructor;

public class C04_doctor {

    C04_doctor(){

        System.out.println("parametresiz constructor calıstı");
    }

    String isim;
    String soyisim;
    String telNo;
    String adres;
    int yas;
    boolean izindemi;
    char evlimi;
    int ekMesaiUcreti=30;

    public int mesaiUcretiHesapla(int MesaiSaati){
        return MesaiSaati*ekMesaiUcreti;
    }
}
