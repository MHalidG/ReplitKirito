package Problems;

import java.util.Scanner;

public class SoruSc_4cozum {
    /*Kullanıcıya günde ne kadar çay içtiğini ve ne kadar şeker kullandığını sorun. Yılda kaç kg şeker kullandığını hesaplayın ve yazdırın.

1 şeker = 1.7 gr

Örnek Çıktı:

Yılda 12.41 kg şeker kullanıyor.
     */

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int bardak=scan.nextInt();
        int seker=scan.nextInt();
        int gun=365;
        int ySA=bardak*gun*seker;
        double gSY=ySA*1.7;
        double sonuc=gSY/1000;
        System.out.println("Yilda " +sonuc+ " kg seker kullaniyor.");

    }


}
