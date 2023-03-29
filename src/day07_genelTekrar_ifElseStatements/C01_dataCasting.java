package day07_genelTekrar_ifElseStatements;

import java.util.Scanner;

public class C01_dataCasting {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        // java da bazı data türleri asla başka data türlerne cevrilemez

        // küçük sayısal data türlerindeki veriableler büyüğe atanır
        // ama tersi olması ıçin zorlayarak daraltma(explicit narrowing) yapılır

        // char data türündeki değerler, sayısal işlemlerde kullanılabilir
        // bir matematiksel işlemde kullanılırsa ASCII TABLE daki değeriyle kullanılır

        System.out.println('k' + 1); //108

        // eğer bu işlemin char olarak değerini yazdırmak istersek
        // sayısal değerlee chara cast edilebilir

        System.out.println((char)('k'+1)); // l



    }
}
