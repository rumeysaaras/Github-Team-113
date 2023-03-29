package day32_inheritance_dataTypeKullanimi;

import day29_inheritence.C05_child;

public class EChild extends DParent{
    String str="Child";
    void method1(){
        System.out.println("child method1");
    }

    // override: gecersiz kılma
    //overriden: gecersiz kılınan

    public static void main(String[] args) {

        EChild childC = new EChild();
        childC.method1(); //child method1
        System.out.println(childC.str);

        DParent childP= new EChild();
        System.out.println(childP.str);

        childP.method1();
    }
}
