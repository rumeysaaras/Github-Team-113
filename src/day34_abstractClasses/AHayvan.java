package day34_abstractClasses;

public abstract class AHayvan {

    /*
    bir classı abstract class yapmak için
    declarasyona abstract keywordunu yazmak yeterlidir

    abstract classlar class oldukları için constructorları vardır
    ama abstract classlardan obje olusturulmaz

    abstract classlarda bugune kadar kullandıgımız yapıda methodlar
    olusturabiliriz ancak bunlar child class lar tarafından
    uyarlamak (override)  zorunda olmaz

    child class ları uyarlamaya mecbur etmek istediğimiz methodları da
    abstact yapmalıyız

    bir methodu abstact yapmak için
    declarationa abstract yazmamız yeterli

     */

    public abstract void hareket();
    public abstract void solunum();
    public abstract void beslenme();
    public abstract void cogalma();
    public abstract void omur();
}
