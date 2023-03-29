package day15_doWhileLoop_scope;

public class C06_ClassLevelVeriable {

    /*
    bir class içinde tüm methodların erişebilecegi veriableler istenirse
    class level da ( classın içinde methodun dışında) olusturulmalıdır


    1-class level da olusturulan veriablelerin scopu tüm class dır
    2-

     */

    static int sayi=10;
    static String isim;
    static boolean bl;
    static char ch;

    public static void main(String[] args) {
        System.out.println(sayi);
        System.out.println("boolean :"+bl);

    }

    public static void statikMethod(){
        sayi++;
        System.out.println(sayi);

    }

    public void statikOlmayanMethod(){
        sayi--;
        System.out.println(sayi);

    }
}
