/*
 * Saniye -> saat:dakika:saniye, / ve % ile (Degiskenler: "Saniye -> saat:dakika:saniye (3725)";
 * Calisma Sorulari 35; alistirmalar). 3725 -> 1:02:05, 7384 -> 2:03:04;
 * 1575 kurus -> 15 lira 75 kurus; 1234 basamak toplami -> 10.
 */
public class SaniyeDonusumu {

    static void donustur(int toplam) {
        int saat = toplam / 3600;
        int kalan = toplam % 3600;
        int dakika = kalan / 60;
        int saniye = kalan % 60;
        System.out.printf("%d:%02d:%02d%n",
                          saat, dakika, saniye);
    }

    public static void main(String[] args) {
        donustur(3725);
        donustur(7384);

        // Alistirma: kurusu lira ve kurusa ayir
        int tutar = 1575;
        System.out.println(tutar / 100 + " lira " + tutar % 100 + " kurus");

        // Alistirma: dort basamakli sayinin basamaklari toplami
        int sayi = 1234;
        int toplam = sayi / 1000 + sayi / 100 % 10 + sayi / 10 % 10 + sayi % 10;
        System.out.println(toplam);
    }
}
