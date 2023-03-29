package day35_Interface;

public interface I01_Interface {

    static int sayi=10;
    final String str="java candır";
    public static final boolean b=true;

    // ınterface de tum veriableler (yazılmasa bile) public , static ve finaldır
    //final oldugu ıcın sonradan değiştirme imkanı yoktur, olustururken deger atanmalıdır
    //bu ozellıkler standart olarak tum veriablelere tanımlandıgından
    //bu tanımlamaları yapmak gereklı değildir

    void toplama();
    public void cikarma();
    abstract String ekleme();
    public abstract int faktoryel();

    //tüm methodlarda standart olarak public ve abstractır (yazılmasa bile)
    



    }
