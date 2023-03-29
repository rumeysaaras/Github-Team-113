package day34_abstractClasses;

public abstract class EBalik extends AHayvan{

    public void hareket() {
        System.out.println("Balıklar yüzer");
    }
    public void solunum(){
        System.out.println("balıklar solungac solunumu yapar");
    }
    public void cogalma(){
        System.out.println("Balıklar yumurta ile cogalır");
    }

    public abstract void yuzgec();
    public abstract void yasamAlani();
    public abstract void iskeletYapisi();

}
