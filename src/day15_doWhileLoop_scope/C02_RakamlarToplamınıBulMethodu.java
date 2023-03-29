package day15_doWhileLoop_scope;

public class C02_RakamlarToplamınıBulMethodu {

    public static void main(String[] args) {

    }


        //  verilen pozitif bir tamsayının rakamlar toplamını bize dönduren
        //method oluşturun
    public static int rakamlarToplaminiBul(int verilensayi){

        int sayi=verilensayi;
        int birlerBasamagi=0;
        int rakamlarToplami=0;

        int basamakSayisi=(sayi+"").length();


        for (int i = 1; i < basamakSayisi; i++) {

            birlerBasamagi=sayi%10;
            rakamlarToplami+=birlerBasamagi;
            sayi/=10;

        }
        return rakamlarToplami;

    }



}
