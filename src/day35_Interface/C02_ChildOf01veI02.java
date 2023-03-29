package day35_Interface;

public class C02_ChildOf01veI02 implements I01_Interface {

    @Override
    public void toplama() {

    }

    @Override
    public void cikarma() {

    }

    @Override
    public String ekleme() {
        return null;
    }

    @Override
    public int faktoryel() {
        return 0;
    }
    public void bolme(){

    }

    public static void main(String[] args) {
        C02_ChildOf01veI02 obj=new C02_ChildOf01veI02();

        System.out.println(I01_Interface.str);
        System.out.println(I03_Interface.str);

        System.out.println(I02_Interface.str);
    }
}
