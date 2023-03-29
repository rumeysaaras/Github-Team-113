package day31_inheritance;

public class DCorolla extends CToyota{
    String str3="Corolla";

    DCorolla(){
        System.out.println("Parametresiz Corolla constructoru calisti");
    }
    DCorolla(int sayi){
        this();
        System.out.println("int parametreli constructor calisti");
    }

    public static void main(String[] args) {
        DCorolla obj1=new DCorolla(5);
    }
}

/*
biz görünür bir const olusturdugumuzda java nın default consu
silmesine benzer olarak
extens keyword kullanılmıs bir class daki herhangi bir constructorun ilk satırında
gözle görünür bie const call yazılmıssa java default olarak koydugu super() i siler

bir cons ta bir tane const olabilir o da ilk satırda olmak zorundadır

eger thıs() veya super() ile const call yaptıgımızda
yazdıgımız argument ile uyumlu parametreye sahip cons yoksa java CTE verir



 */
