package Problems;

public class SoruTernary_1cozum {
    public static void main(String[] args) {
        /*
        Kullanıcıya kilosunu ve boyunu sorun ve kitle indeksini hesaplayan bir program yazın (BMI)

IPUCU : BMI = Agirlik(kg) / Boy*Boy (m)

BMI 18,5'in altındaysa zayıfsınız

BMI 18,5 ile 25 arasında ise kilonuz idealdir

BMI 25-30 arasındaysa şişmansınız

BMI 30'dan büyük veya eşitse, obez

Input:

Output:

Agirlik : 71

Boy : 1,72

BMI : 23.99945916711736

Zayifsiniz.
         */

          /*
Verilen Inputun BMI'si ideal olmasina ragmen out put olarak zayifsiniz istendigi icin ilk else if if le ayni yapilmistir
    */
        double kg=71;
        double boy=1.72;

        double BMI=kg/(boy*boy);

        if (BMI<18.5){
            System.out.println("BMI : "+BMI);
            System.out.println("Zayifsiniz.");
        }
        else if (18.5<=BMI&& BMI<25) {
            System.out.println("BMI : "+BMI);
            System.out.println("Zayifsiniz.");
        } else if (BMI>=25&&BMI<30) {
            System.out.println("BMI : "+BMI);
            System.out.println("Sismansiniz/");
        } else if (BMI>=30){
            System.out.println("BMI : "+BMI);
            System.out.println("Obezsiniz.");
        }
    }
}
