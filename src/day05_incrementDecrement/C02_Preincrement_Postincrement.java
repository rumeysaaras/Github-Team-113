package day05_incrementDecrement;

public class C02_Preincrement_Postincrement {
    public static void main(String[] args) {

        // a nın değerini 1 artırın ve yeni değerini oluşturacagınız b veriable ina atayın

        int a=20;
        int b= ++a;

       /* a++;
        int b=a;

        */
        System.out.println("a:"+a+"b:"+b); // a:21 b:21

        // a nın değerini b ye atayın , sonra a nın değerini 1 artırın
        a=20;
        b=a++;

       /* b=a;
        a++;

        */

        System.out.println("a:"+a+",b:"+b);

    }
}
