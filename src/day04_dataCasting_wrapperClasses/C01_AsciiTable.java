package day04_dataCasting_wrapperClasses;

public class C01_AsciiTable {
    public static void main(String[] args) {

        /*
        24 === 11000
        a === 97 == 10100010
        b=== 98

         */

        System.out.println(5 + 'a');  // 5+97=102

        char ilkHarf=101;

        System.out.println(ilkHarf);

        //  kullanıcının verdiği  harften bir sonrki harfi yazdırın

        char girilenChar='f';

        System.out.println(girilenChar+1); // 102+1=103

        // sayı değil karşılık ifadeyi yazdırmak istersek

        System.out.println("girilen harfin bir sonrası : "+(char)(girilenChar+1));

        girilenChar='M';

        System.out.println(girilenChar-2);

        System.out.println((char) (girilenChar-2));




    }
}
