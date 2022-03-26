package Problems;

import java.util.Locale;

public class SoruTernary_2cozum {
    /*
    Kullanıcıya Adı, Soyadı ve kredi kartı numaralarını sorarak verilen formata ceviren java kodunu yaziniz.

Input :

John White

1234234534561478

Output : Name :

J* W**

CCN : ** ** **** 1478

Ilk Harfler Buyuk harf ile baslamalidir.

J*** W****
CCN  : **** **** **** 1478

John White
1234234534561478
     */

    public static void main(String[] args) {

        String input="John White 1234234534561478";

        int ilkbosluk= input.trim().indexOf(" ");
        int ikincibosluk=input.trim().indexOf(" ", ilkbosluk+1);

        String isim=input.trim().toUpperCase().substring(0,ilkbosluk);
        String soyisim=input.trim().toUpperCase()  .substring(ilkbosluk+1,ikincibosluk);
        String kKNo=input.trim().toUpperCase().substring(ikincibosluk+1);

        String output=isim.charAt(0)+isim.substring(1).replaceAll("\\w", "*")+" "
                +soyisim.charAt(0)+soyisim.substring(1).replaceAll("\\w", "*");


        System.out.println(output);
        System.out.println("CCN  :"+" **** **** **** "+
                kKNo.substring(12));




    }
}
