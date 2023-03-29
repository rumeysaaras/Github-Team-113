package day31_inheritance;

public class CToyota extends BAraba{
    protected String str2="Toyota";
    protected CToyota(){
        super("java");
        System.out.println("Parametresiz toyota constuctor'u calisti");
    }
    protected CToyota(int sayi){
        System.out.println("İnt parametreli constructor calisti");
    }
    protected CToyota (String s){
        System.out.println("String parametreli cons calisti");
    }
}
