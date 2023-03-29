package day10_StringManipulation;

public class C02_contains {
    public static void main(String[] args) {

        String str="java öğren işi yap";

        System.out.println(str.contains("java")); // true

        String s="k";

        System.out.println(str.contains(s));

        System.out.println(str.contains("a"));

        System.out.println(str.contains(" "));

        System.out.println(str.contains(""));

        System.out.println(str.contains("Java"));

        //mı içerir?

    }
}
