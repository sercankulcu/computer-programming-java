/*
 * Bekci (sentinel) degerle okuma: 0 gelince while (true) dongusu break ile biter (Slayt 40).
 * Sayilar klavye yerine sabit dizgiden okunur.
 * Beklenen cikti: Toplam: 18 (5 + 8 - 2 + 7)
 */
import java.util.Scanner;

public class BekciDeger {

    public static void main(String[] args) {
        Scanner sc = new Scanner("5 8 -2 7 0 99");   // 0'dan sonrasi okunmaz
        int toplam = 0;
        while (true) {
            int sayi = sc.nextInt();
            if (sayi == 0) break;
            toplam += sayi;
        }
        System.out.println("Toplam: " + toplam);
        sc.close();
    }
}
