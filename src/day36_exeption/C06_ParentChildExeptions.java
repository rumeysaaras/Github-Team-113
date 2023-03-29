package day36_exeption;

import jdk.internal.util.jar.JarIndex;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C06_ParentChildExeptions {
    public static void main(String[] args) {

    }

    {
        String dosyaYolu = "src/day36_exceptions/text.txt";
        FileInputStream fis = null;
        try {

            fis = new FileInputStream(dosyaYolu);
            int k = 0;
            while ((k = fis.read()) != (-1)) {
                System.out.print((char) k);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        /*
        eger kodumuzda bırden fazla exeptıon ihtimali varsa
        ve bu exeptıon lar arasında parent child ilişkisi varsa

        1- ya sadece parentı yzarız
        cunku parent exeptıon child exeptıonları da kapsar
        2- Veya ikisini de yazmak istiyorsak
               once child exception'i
               sonra parent exception'i yazmaliyiz
         */
    }

    }