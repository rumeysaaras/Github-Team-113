package day05_incrementDecrement;

public class C03_concationation {

    public static void main(String[] args) {

        // bir string başka bir string veyabaşka bir data türünden bir veriable ile
        // + işareti ile birleştirilebilir

        String a="java";
        String b="güzeldir";

        System.out.println(a+b); // javagüzeldir
        System.out.println(a+" " + b); // java güzeldir

        int c= 10;
        int d= 20;
        System.out.println(a+c+d); //java1020

        // eğer String ile başka data türündeki bir değer toplanırsa java sonucu
        // String yapar (String=Strong)

        System.out.println(a+(c+d)); //java30

        System.out.println(a+c*d); // java200


    }
}
