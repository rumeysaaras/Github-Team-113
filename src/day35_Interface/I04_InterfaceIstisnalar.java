package day35_Interface;

public interface I04_InterfaceIstisnalar {
    void toplama();
    static void aciklama(){
        System.out.println("bu methodu implament etmek mecburi değil");
    }
    default void ekIsler(){
        System.out.println("default");
    }
}
