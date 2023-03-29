package day32_inheritance_dataTypeKullanimi;

public class CAvciKuslar extends BKuslar {

    String hareket = "ucarlar";
    String beslenme = "et yerler";
    String pence = "pencelidirler";
    String gaga = "sivri gagali";

    public static void main(String[] args) {

        CAvciKuslar kartalAvci= new CAvciKuslar();
        System.out.println(kartalAvci.hareket);
        System.out.println(kartalAvci.beslenme);
        System.out.println(kartalAvci.pence);
        System.out.println(kartalAvci.gaga);

        System.out.println(kartalAvci.kanat);
        System.out.println(kartalAvci.solunum);
        System.out.println(kartalAvci.cogalma);

        System.out.println(kartalAvci.omur);

        BKuslar child2=new CAvciKuslar();
        // kuslar classındaki kartalın özellikleri


        BKuslar kartalKus= new CAvciKuslar();

        System.out.println(kartalKus.hareket);// A hareket ederler
        System.out.println(kartalKus.beslenme);// A beslenirler
        //System.out.println(kartalKus.pence);// CTE
        System.out.println(kartalKus.gaga);// B gagalari vardir
        System.out.println(kartalKus.kanat);// B kanatlidir
        System.out.println(kartalKus.solunum);// B akciger
        System.out.println(kartalKus.cogalma);// B yumurtayla
        System.out.println(kartalKus.omur); // A yasar ve olurler

        AHayvanlar kartalHayvan= new CAvciKuslar();

        System.out.println(kartalHayvan.hareket);// A hareket ederler
        System.out.println(kartalHayvan.beslenme);// A beslenirler
        //System.out.println(kartalHayvan.pence);// CTE
        //System.out.println(kartalHayvan.gaga);// CTE
        //System.out.println(kartalHayvan.kanat);// CTE
        System.out.println(kartalHayvan.solunum);// A nefes alirlar
        System.out.println(kartalHayvan.cogalma);// A cogalirlar
        System.out.println(kartalHayvan.omur); // A yasar ve olurler
        // Variable olarak ozellikleri olusturursak

        BKuslar kuslar= new BKuslar();
        BKuslar avciKuslar= new CAvciKuslar();

        // bu iki obje arasinda bir fark goremeyiz

        /*
            Eger bir obje olusturulurken
            Data turu ve constructor ayni ise
            aradigimiz ozellikler icin direk o class'a gider
            ve ozellikleri arariz
            Eger data turu ve constructor farkli ise
            variable ve method'lar farkli davranirlar

            variable'lar

            - once data turunun oldugu class'a bakar
              o variable'i bulursa degerini yazdirir
              bulamazsa data turunun parent'larina bakar
              orada bulursa degerini yazdirir
              orada da bulamazsa CTE verir
              Ozetle bir ozelligi variable olarak olusturursaniz
              data turu olan class ve parentlarindaki ortak ozelliklere bakar
              ortak bilgileri arar,
              en guncel bilgiyi aramaz
         */


    }
}
