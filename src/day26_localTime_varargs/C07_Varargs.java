package day26_localTime_varargs;

public class C07_Varargs {
    public static void main(String[] args) {
        // verilen iki sayıyı toplayıp yazdıran bir method olusturun

        topla(3,4,5,9);
    }
    public static void topla(int a , int b ,int c){
        System.out.println(a+b+c);
    }

    public static void topla(int a , int b ,int c ,int d){
        System.out.println(a+b+c+d);
    }

}
