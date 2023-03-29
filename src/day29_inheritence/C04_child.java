package day29_inheritence;

public class C04_child extends C03_parentClass {

    int c=20;
    int a;

    String s="child class";
    String m;

    public void method1(){
        System.out.println("child class method1");
    }

    public static void main(String[] args) {
        C03_parentClass objC03 =new C03_parentClass();
        objC03.a=20;
        objC03.b=22;
        objC03.s="p";
        objC03.t="k";
        objC03.method1();
        objC03.method2();

        C04_child objC04= new C04_child();
        objC04.a=50;
        objC04.c=20;
        objC04.s="u";
        objC04.m="l";
        objC04.method1();

        // C04 classını C03 e child yapınca ordaki b t ve method2 yi kullanabildik

        objC04.b=8;
        objC04.t="y";
        objC04.method2();


        /*
        java da parent class lar child edilmez
        child classlar parent edilir

        Bir classın baska bir class daki tum ozelliklerini otomatik
        olarak edinmesini istiyorsak class imizi extens keyword ile o classa
        child yaparız
        size baba diyebilir miyim/ sizi babam yaptım



         */
    }
}
