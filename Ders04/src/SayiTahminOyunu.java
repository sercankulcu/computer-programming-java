/*
 * Sayi tahmin oyunu (Akis Diyagramlari: "Sayi Tahmin Oyunu Adim Adim"; Calisma Sorulari 30).
 * gizli = 37; tahminler sabit dizgiden okunur. 50, 25, 37 -> Daha kucuk, Daha buyuk, Bildin (3. deneme);
 * 20, 40, 37 -> Daha buyuk, Daha kucuk, Bildin (3. deneme). Alistirma: en fazla 5 deneme kurali.
 */
import java.util.Scanner;

public class SayiTahminOyunu {

    static void oyna(String girdiler) {
        Scanner klavye = new Scanner(girdiler);
        int gizli = 37, deneme = 0;   // normalde rastgele secilir
        while (true) {
            int tahmin = klavye.nextInt();
            deneme = deneme + 1;
            if (tahmin == gizli) {
                System.out.println("Bildin (" + deneme + ". deneme)");
                break;
            }
            if (tahmin < gizli)
                System.out.println("Daha buyuk");
            else
                System.out.println("Daha kucuk");
        }
    }

    // Alistirma: 5 denemede bilinemezse "Kaybettin"
    static void besDenemeli(String girdiler) {
        Scanner klavye = new Scanner(girdiler);
        int gizli = 37, deneme = 0;
        while (deneme < 5) {
            int tahmin = klavye.nextInt();
            deneme = deneme + 1;
            if (tahmin == gizli) {
                System.out.println("Bildin (" + deneme + ". deneme)");
                return;
            }
            System.out.println(tahmin < gizli ? "Daha buyuk" : "Daha kucuk");
        }
        System.out.println("Kaybettin");
    }

    public static void main(String[] args) {
        oyna("50 25 37");
        System.out.println("---");
        oyna("20 40 37");
        System.out.println("---");
        besDenemeli("10 90 30 40 35");
    }
}
