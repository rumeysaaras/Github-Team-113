package day04_dataCasting_wrapperClasses;

public class C03_dataCasting {
    public static void main(String[] args) {

        int a= 20;
        int b=6;

        System.out.println(a/b); // 20/6=3

        double c=6;
        System.out.println(a/c); // 20/6=3,33333333335

        float d= 6f;

        System.out.println(a/d); // 20/6=3,33333

        //System.out.println(double) (a/b) );

        int e=1467;

        System.out.println(e=e/10); // 146

        System.out.println(e);   // 146

        System.out.println(e/10); // 14

        e=e/10;
        System.out.println(e);

        e=e/10;
        System.out.println(e);

    }
}
