package day13_methodOlusturma;

public class C05_StringiTerseCevirme {
    public static void main(String[] args) {

        // verilen bir stringi tersine cevirip
        // bize dönduren bir method olusturun

        System.out.println(stringTersineCevir("java candır"));
        System.out.println(stringTersineCevir("anlasıldı mı"));


    }

    public static String stringTersineCevir(String metin) { //java
        String tersmetin = ""; // avaj
        for (int i = metin.length() - 1; i < 0; i++) {
            tersmetin += metin.charAt(i);

        }
        return tersmetin;
    }
}
