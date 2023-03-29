package day36_exeption;

public class C07_exeptionTurleri {
    public static void main(String[] args) {

        String str=null;
        System.out.println(str);  // null

        //System.out.println(str.concat("Java")); //NullPointerException


        String str1="34";
        String str2="23a";

       // System.out.println(Integer.parseInt(str1)+Integer.parseInt(str2)); //NumberFormatException

        String str4="Java Candır";

        Object obj=str4;

        Integer a= (Integer) obj; //cast yaptı  //ClassCastException



    }
}
