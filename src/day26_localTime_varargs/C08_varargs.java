package day26_localTime_varargs;

import java.util.Arrays;

public class C08_varargs {
    public static void main(String[] args) {
        topla(6,8,1);
    }
    public static void topla(int... a ){
        System.out.println(Arrays.toString(a));

        int toplam=0;
        for (int each:a
             ) {
            toplam+= each;
        }
        System.out.println("toplam : "+toplam);

    }

    /*
    java da bir method parametrelerine uygun argumente sahip method call oldugunda calısır

    örnegin 2 int parametre varsa
    sadece 2 int argument ile calısır

    java aynı data turune sahip olmak sartıyla
    parametre sayısını esnek tutabilmek için varargs olusturur
     */
}
