package day11_stringManipulations_forLoop;

public class C03_replace {
    public static void main(String[] args) {

        String  str="java candır";
        System.out.println(str.replace('J', 'H')); //hava candır
        System.out.println(str.replace("a","")); //jv candır

        System.out.println(str.replace("java","X")); // x candır

        str.replace("va","lala"); // yapılan değişiklik bu satır ıcındır
                                                   //yazdırılmadıgı ıcın gorulmez


        //str daki speaceleri yok edin

        str=str.replace(" ","");
        System.out.println(str); //javacandır

        System.out.println(str.replaceFirst("a","")); //jva candır



    }
}
