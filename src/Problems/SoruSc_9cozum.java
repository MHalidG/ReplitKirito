package Problems;

public class SoruSc_9cozum {
    /*
    Girilen zamanı saniyeye çeviren bir program yazınız.

Örnek Çıktı:

1 saat 10 dakika 50 saniye ==>

4250 saniye
     */
    public static void main(String[] args) {

        int saat = 1;
        int dakika = 10;
        int saniye = 50;

        int tpSn = (saniye + (dakika * 60) + (saat * 60 * 60));
        System.out.println(tpSn+" saniye");
    }
}
