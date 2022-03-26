package Problems;

import java.util.Scanner;

public class SoruSc_1cozum {
    /*
    Kullanıcıdan bir sayı alın ve sayının küpünün yarısını konsola yazdıran bir program yazın.
     */
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int input=scan.nextInt();

        System.out.println(" Girdiginiz sayinin kupunun yarisi = "+ ((input*input*input)/2));





    }



}
