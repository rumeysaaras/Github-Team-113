package day35_Interface;

import day34_abstractClasses.CAvciKuslar;

public class C01_ChildOf01 extends CAvciKuslar implements I01_Interface {

    public void toplama(){}
    public void cikarma(){}

    @Override
    public String ekleme() {
        return null;
    }

    @Override
    public int faktoryel() {
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(I01_Interface.str);
    }


}
