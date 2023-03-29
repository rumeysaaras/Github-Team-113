package day25_passByValue_ImmutableClasess;

public class c03_ImmutableClasses {

    public static void main(String[] args) {

        String str ="Java candır";

        str=str.toLowerCase();
        System.out.println(str);

        str=str.toUpperCase();
        System.out.println(str);

        String s="Hava";

        for (int i = 0; i <100 ; i++) {
            s = s + ".";

        }
        System.out.println(s);
    }
}
