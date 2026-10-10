/*
 * for dongusu: baslangic; kosul; guncelleme (Slayt 4-5, Calisma Sorulari 1-6).
 * Toplam biriktiricisi 0 ile baslar; kosul n + 1 kez sorulur, govde n kez calisir.
 * Soru 13-14: sonuc *= sayac izlemesi.
 * Beklenen cikti: 10, 28, "2 5 8", "----", 25, 15, "6 36 216", "12 72 432"
 */
public class ForDongusu {

    public static void main(String[] args) {
        int n = 4;
        int toplam = 0;
        for (int i = 1; i <= n; i++) {
            toplam += i;
        }
        System.out.println(toplam);              // 10

        // Soru 2: toplam 1..7
        toplam = 0;
        for (int i = 1; i <= 7; i++) {
            toplam += i;
        }
        System.out.println(toplam);              // 28

        // Soru 3: adim 3 ile sayma
        for (int i = 2; i <= 10; i += 3) {
            System.out.print(i + " ");           // 2 5 8
        }
        System.out.println();

        // Soru 4: i < 5 -> 4 tur
        for (int i = 1; i < 5; i++)
        {
            System.out.print("-");               // ----
        }
        System.out.println();

        // Soru 5 ve 6: x += i, baslangic degeri farkli
        int x = 10;
        for (int i = 1; i <= 5; i++) {
            x += i;
        }
        System.out.println(x);                   // 25
        x = 0;
        for (int i = 1; i <= 5; i++) {
            x += i;
        }
        System.out.println(x);                   // 15

        fonksiyon();    // 6 36 216
        fonksiyon2();   // 12 72 432
    }

    // Soru 13: i = 3, 4, 5 -> 3 tur; her turda 6 ile carpilir
    // (slaytta static olmayan "void fonksiyon()"; main'den cagirmak icin static yapildi)
    static void fonksiyon() {
        int sonuc = 1;
        int sayac = 6;
        for (int i = 3; i < sayac; i++) {
            sonuc *= sayac;
            System.out.print(sonuc + " ");
        }
        System.out.println();
    }

    // Soru 14: sonuc 2 ile baslarsa
    static void fonksiyon2() {
        int sonuc = 2;
        int sayac = 6;
        for (int i = 3; i < sayac; i++) {
            sonuc *= sayac;
            System.out.print(sonuc + " ");
        }
        System.out.println();
    }
}
