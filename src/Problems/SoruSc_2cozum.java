package Problems;

import java.util.Scanner;

public class SoruSc_2cozum {
    /*
    Kullanıcıdan karenin kenar uzunluğunu alın ve karenin alanını ve çevresini konsola yazdıran bir program yazın.

Ornek Cikti :

Alan: 9

Cevre: 12
     */
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen karenin bir kenarinin uzunlugunu giriniz...");
        int kenar=scan.nextInt();

        System.out.println("Alan: "+ (kenar*kenar));
        System.out.println("Cevre: "+(kenar*4));






    }

}
