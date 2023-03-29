package day05_incrementDecrement;

public class C01_incrementDecrement {

    public static void main(String[] args) {

        int a = 20;
        // a nın değerini 3 artırın ve yeni değerini oluşturacagınız b veriable ina atayın

        // a=+3
        a +=3;

        //a++;
        //a++;
        //a++;

        int b = a;

        System.out.println("a : " + a + " b : " + b); // a:23 b:23

        a=20;
        // a nın değerini b ye atayın , sonra a nın değerini 3 artırın

        b=a;
        a+=3;
        System.out.println("a : " + a + " b : " + b); // a:23 b:20

        a=20;

        // anın değerini yazdırın sonra a yı 5 artırın

        System.out.println("a:"+a);
        a+=5;

        // burada a yı yazdırsak  25 yazar cünkü kod yukardan aşagı yazar

        a=20;

        // anın degerini 2 azaltın ve sonra a nın degerini yazdırın

        a-=2;

        System.out.println("a:"+a);









    }
}
