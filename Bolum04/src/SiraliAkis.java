/*
 * Sirali akis: dallanma ve tekrar yok, her kutu bir kez calisir (Akis Diyagramlari: "Sirali Akis";
 * Calisma Sorulari 5, 6, 7). a = 4, b = 7 -> toplam 11; a = 3 -> 15 9 6;
 * gecicisiz takas (4, 7) -> 7 4; dk = 135 -> 2 15.
 */
import java.util.Scanner;

public class SiraliAkis {
    public static void main(String[] args) {
        // Girdiler klavye yerine sabit bir dizgiden okunur
        Scanner klavye = new Scanner("4 7");
        int a = klavye.nextInt();   // a degerini oku
        int b = klavye.nextInt();   // b degerini oku
        int toplam = a + b;
        System.out.println(toplam); // 11

        // Soru 6: a = 3
        a = 3;
        b = a * a;
        int c = b - a;
        a = c + b;
        System.out.println(a + " " + b + " " + c);   // 15 9 6

        // Soru 5: toplamla gecici degiskensiz takas
        a = 4;
        b = 7;
        a = a + b;   // 11
        b = a - b;   // 4
        a = a - b;   // 7
        System.out.println(a + " " + b);             // 7 4

        // Soru 7: dakikayi saate cevir (/ tam sayi bolmesi, % kalan)
        int dk = 135;
        int saat = dk / 60;
        int kalan = dk % 60;
        System.out.println(saat + " " + kalan);      // 2 15
    }
}
