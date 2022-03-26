package Problems;

import java.math.BigInteger;

public class SoruTernary_3cozum {
/*
Verilen iki sayının (sıfırdan büyük veya sıfıra eşit) toplamını hesaplayan ve yazdıran bir Java programı yazın.
Verilen tamsayılar veya toplam 10'dan fazla basamakli olursa, "OverFlow" yazdırın.
 Ornek:
INPUT :
25
46
OUTPUT :
Numaralarin Toplami:
71{
 */

    public static void main(String[] args) {
        long a = 999999999;
        long b = 999999999;

        if (a >= 0 && b >= 0) {
            BigInteger c = new BigInteger("99999999999999999999");
            c = BigInteger.valueOf(a+b);

            String d = c + "";
            int h = d.length();
            if (h > 9) {
                System.out.println("OwerFlow");
            } else if (h < 9) {
                System.out.println(c);
            } else {
                System.out.println("Girdiginiz sayilar pozitif olmali");
            }
        }
    }
}
