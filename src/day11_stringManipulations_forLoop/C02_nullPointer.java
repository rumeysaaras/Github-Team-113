package day11_stringManipulations_forLoop;

public class C02_nullPointer {
    public static void main(String[] args) {

        // null bir değer değildir , null bir pointer dir
        // yanına yazıldığı non-primitive veriable ye değer atanmadıgını işaret eder

        String str; // str olusturuldu ama değer atanmadı

        // java method içerisine deger atamadan veriable olusturulmasına ızın verir
        //ama değer atamadan kullanılmasına ızın vermez

        //System.out.println(str); CTE(hata)
       // str.concat("java"); CTE(hata)

        // bazen programlarda veriableler olusturulur ama
        // daha sonra değer atanacagı ıcın değer atması yapılmaz
        // değer atamadan listeleme bile yapılamayacagı icin
        //bir cözum olarak null-pointer olusturulur

        str=null;

        System.out.println(str); // null


    }
}
