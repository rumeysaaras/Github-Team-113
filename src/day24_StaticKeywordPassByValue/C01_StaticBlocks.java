package day24_StaticKeywordPassByValue;

public class C01_StaticBlocks {

    C01_StaticBlocks(){
        System.out.println("Constructor çalıstı");

    }
    public static void main(String[] args) {

        System.out.println("main method çalıştı");
        System.out.println("--------------");
        C01_StaticBlocks obj=new C01_StaticBlocks();

    }
    static {
        // static bloc lar class ilk çalısmaya basladıgında calısır
        //genel olarak class için gereklı on ayarlamaları yapmak için kullanılır

        System.out.println("static bloc calıstı");
    }
    static {
        System.out.println("Altdaki static block calisti");
    }
    {
        /*
            static olmayan block'lar ise obje olusturulurken
            constructor'dan once calisir
            obje icin yapilmasi gereken on ayarlamalari yapmak icin kullanilir
         */
        System.out.println("static olmayan blok calisti.");
    }

    {
        System.out.println("static olmayan bloc calıstı");
    }
}
