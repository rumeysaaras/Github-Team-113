package day22_constructor;

public class C06_car {


    int yil;
    String marka="Marka belirtilmemiş";
    String model="Mosdel belirtilmemiş";
    boolean hasarliMi;
    int fiyat;

     /*
        Bir obje olusturulurken
        default constructor veya parametresiz gorunur constructor kullanilirsa
        obje ilk atanan degerlere sahip olur
        istedigimiz degerleri atamak icin tek tek tum variable'lara
        atama yapmamiz gerekir
        Bunun yerine
        atamak istedigimiz degerleri parametre olarak
        constructor'a yollayalim
        ve atamalari constructor icinde yapalim
     */

    public C06_car(String mrk, String mdl, boolean hmi ,int yl,int fyt){
        yil = yl;
        marka=mrk;
        model=mdl;
        hasarliMi=hmi;
        fiyat=fyt;
    }
    public C06_car(){

    }


    @Override
    public String toString() {
        return "C06_car{" +
                "yil=" + yil +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", hasarliMi=" + hasarliMi +
                ", fiyat=" + fiyat +
                '}';
    }

    public void yakitTuketimi(String yakitTuru){
        switch (yakitTuru){
            case "benzin":
                System.out.println("benzinli araclar için yakıt tuketımı :6 l/100 km");
                break;
            case "dizel":
                System.out.println("dizel araclar için yakıt tuketımı :5 l/100km");
                break;
            case "elektrik":
                System.out.println("elektrikli araclar için yakıt tuketımı 5w/100km");
                break;
            default:
                System.out.println();

        }
    }
}
