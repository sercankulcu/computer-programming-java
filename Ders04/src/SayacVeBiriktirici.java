/*
 * Sayac ve biriktirici (Akis Diyagramlari: "Sayac ve Biriktirici"; Calisma Sorulari 18).
 * Uc sayi (4, 7, 2) okunup toplanir -> 13. Sifir girilene kadar okuma (5, 8, -2, 0) -> 11 3:
 * bitis isareti 0 toplama ve sayaca katilmaz. Girdiler sabit dizgiden okunur.
 */
import java.util.Scanner;

public class SayacVeBiriktirici {
    public static void main(String[] args) {
        Scanner klavye = new Scanner("4 7 2");
        int sayac = 0, toplam = 0;
        while (sayac < 3) {
            int x = klavye.nextInt();
            toplam = toplam + x;     // biriktirici
            sayac = sayac + 1;       // sayac
            System.out.println(sayac + ". tur: x = " + x + ", sayac = " + sayac + ", toplam = " + toplam);
        }
        System.out.println(toplam);  // 13

        // Soru 18: 0 girilene kadar oku; toplam ve kac sayi girildigini yaz
        klavye = new Scanner("5 8 -2 0");
        toplam = 0;
        sayac = 0;
        int x = klavye.nextInt();
        while (x != 0) {
            toplam = toplam + x;
            sayac = sayac + 1;
            x = klavye.nextInt();    // geri donen ok oku kutusuna doner
        }
        System.out.println(toplam + " " + sayac);   // 11 3
    }
}
