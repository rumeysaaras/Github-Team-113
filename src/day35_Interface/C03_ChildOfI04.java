package day35_Interface;

public class C03_ChildOfI04 implements I04_InterfaceIstisnalar{
    @Override
    public void toplama() {
    }

    public static void main(String[] args) {
        C03_ChildOfI04 obj=new C03_ChildOfI04();
        obj.ekIsler();

        I04_InterfaceIstisnalar.aciklama();
    }
}
