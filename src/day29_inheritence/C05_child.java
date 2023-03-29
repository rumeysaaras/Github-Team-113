package day29_inheritence;

public class C05_child extends C03_parentClass{

    int c=20;
    int a;

    String s="child class";
    String m;

    public void method1(){
        System.out.println("child class method1");
    }

    public static void main(String[] args) {

        C05_child obj=new C05_child();
        System.out.println(obj.a);//0
        System.out.println(obj.c);//20
        System.out.println(obj.b);//0
        System.out.println(obj.m);//null
        System.out.println(obj.s);//child class
        System.out.println(obj.t);//null

        obj.method1();//child class method1
        obj.method2();//parent method2 calisti




    }
}
