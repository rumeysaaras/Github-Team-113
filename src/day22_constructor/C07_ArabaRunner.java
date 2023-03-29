package day22_constructor;

public class C07_ArabaRunner {
    public static void main(String[] args) {

        C06_car car1=new C06_car();
        car1.marka="toyota";
        car1.model="corolla";
        car1.hasarliMi=false;
        car1.yil=2017;
        car1.fiyat=5250;

        System.out.println("marka : " +car1.marka+", model : "+car1.model);
        System.out.println(car1);

       // C06_car car2=new C06_car("Honda","Jazz","true",2010,3000);

    }
}
