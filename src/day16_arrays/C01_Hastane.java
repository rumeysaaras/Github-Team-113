package day16_arrays;

public class C01_Hastane {
    public static void main(String[] args) {

        ADoktor dok1=new ADoktor();

        System.out.println(dok1.askerYil); //false


        ADoktor dok2=new ADoktor();
        System.out.println(dok2.isim); //null
        dok2.soyisim="çelik";
        System.out.println(dok2.soyisim);

        System.out.println(dok1);

        dok1.isim="burcu";
        System.out.println(dok2.isim); //null

        dok1.fakulte="tip fakültesi";
        System.out.println(dok2.fakulte); // tip fakültesi

        System.out.println(ADoktor.fakulte);

    }
}
