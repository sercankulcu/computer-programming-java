/*
 * Basamak sayisi: do-while ile 10'a bolerek sayma; 0 icin de 1 basamak (Slayt 23-24,
 * Calisma Sorusu 36). long kullanimi Integer.MIN_VALUE'nun mutlak degerini tasirmadan tutar.
 * Beklenen cikti: 3, sonra 0 -> 1, 7 -> 1, 12345 -> 5, -507 -> 3
 */
public class BasamakSayisi {

    // Soru 36: metot olarak
    public static int basamakSayisi(int sayi) {
        sayi = Math.abs(sayi);
        int basamakSayisi = 0;
        do {
            basamakSayisi++;
            sayi /= 10;
        } while (sayi > 0);
        return basamakSayisi;
    }

    public static void main(String[] args) {
        int sayi = -507;
        long kalan = sayi;
        if (kalan < 0) kalan = -kalan;
        int basamak = 0;
        do {
            basamak++;
            kalan /= 10;
        } while (kalan > 0);
        System.out.println(basamak);   // 3

        int[] denemeler = {0, 7, 12345, -507};
        for (int s : denemeler) {
            System.out.println(s + " -> " + basamakSayisi(s));
        }
    }
}
