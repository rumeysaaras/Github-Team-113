package day10_StringManipulation;

public class C01_substring {
    public static void main(String[] args) {

        String str="java ne kadar güzel";

        System.out.println(str.substring(8)); //kadar güzel

        System.out.println(str.substring(0)); // java ne kadar güzel

        System.out.println(str.substring(str.length()-3)); // hiçlik

        System.out.println(str.substring(5,7)); //ne

        System.out.println(str.charAt(5)); //n
        System.out.println(str.substring(5,6)); //n



    }
}
