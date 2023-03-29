package day31_inheritance;

public class FMuhasebe extends EPersonel {

    String sgkNo="calisan sgk no belirtilmemiş";
    boolean raporluMu;

    public void fazlaMesai(
            int fazlaMesaiSaati){
        System.out.println(fazlaMesaiSaati);
    }
    public void nobetUcreti(int nobetSayisi){
        System.out.println(nobetSayisi*100);
    }
}
