package day08_nestedIfElse_ternary;

public class C07_ternary {
    public static void main(String[] args) {

        // kullanıcıdan bir ucgenin uc kenra uzunlugunu al
        // ucgen eskenar ıse "eskensr ucgen"
        // değilse" eskenar değil" yazdır

        int kenar1=12;
        int kenar2=12;
        int kenar3=12;

        System.out.println(kenar1==kenar3 && kenar1==kenar2 ? "eskenar ucgen":" eskenar değil"  );
    }
}
