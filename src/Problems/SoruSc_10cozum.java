package Problems;

public class SoruSc_10cozum {
    /*
    Kullanıcıdan dakika girmesini isteyin, Dakikaları birkaç yıl ve gün sayısına dönüştürmek için bir Java programı yazın.

INPUT:

Dakika sayısı: 3456789

OUTPUT :

3456789 dakika yaklaşık 6 yıl 210 gündür
     */
    public static void main(String[] args) {
        int input=3456789;
        int gun=input/60/24;
        int yil=gun/365;
        int klnGun=gun-(yil*365);
        System.out.println(input+" dakika yaklasik "+yil+" yil "+klnGun+" gundur");





    }

}
