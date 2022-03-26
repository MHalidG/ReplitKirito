package Problems;

import java.util.Scanner;

public class SoruSc_3cozum {
    /*
    Kullanıcıdan dikdörtgenin kenar uzunluklarını alın ve dikdörtgenin alanını ve çevresini konsola yazdıran bir program yazın.

Örnek Çıktı:

Alan: 32

Çevre: 24
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen dikdortgenin kenar uzunluklarini giriniz");
        int kk= scan.nextInt();
        int uk= scan.nextInt();


        System.out.println("Alan: "+(uk*kk) );
        System.out.println("Çevre: "+ ((kk+uk)*2));


    }




}
