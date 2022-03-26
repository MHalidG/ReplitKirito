package Problems;

import java.util.Scanner;

public class SoruSc_6cozum {
    /*
    Kullanıcıdan bir Float değer girmesini isteyin, bu sayıyı short değişken tipine dönüştürün ve konsolda yazdırın.
     */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        float input=scan.nextFloat();

        short cevirik= ((short) input);

        System.out.println(cevirik);

    }
}
