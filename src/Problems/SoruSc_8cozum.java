package Problems;

public class SoruSc_8cozum {
    /*
    Kullanıcıdan üç basamaklı bir sayı girmesini ve bu sayının basamaklarının toplamını bulmasını isteyin.

Örnek Çıktı:

Verilen tamsayının rakamları toplamı 10'dur.
     */
    public static void main(String[] args) {
        int input= 235;
        int toplam=(input%10)+(input/10%10)+(input/100);
        System.out.println("Verilen tamsayinin rakamlari toplami "+toplam+"\'dur.");



    }


}
