/*
 * Rakamlar toplami: kalan % 10 son rakami verir, kalan / 10 onu atar (Slayt 25-26,
 * Calisma Sorusu 38 - eksik satir: int rakam = sayi % 10;).
 * Beklenen cikti: 14, sonra rakamlarToplami(-4096) = 19
 */
public class RakamlarToplami {

    // Soru 38: eksik satir tamamlandi
    static int rakamlarToplami(int sayi) {
        sayi = Math.abs(sayi);
        int toplam = 0;
        while (sayi > 0) {
            int rakam = sayi % 10;     // eksik satir
            toplam += rakam;
            sayi /= 10;
        }
        return toplam;
    }

    public static void main(String[] args) {
        int sayi = 725;
        long kalan = sayi;
        if (kalan < 0) kalan = -kalan;
        int toplam = 0;
        while (kalan > 0) {
            toplam += (int) (kalan % 10);
            kalan /= 10;
        }
        System.out.println(toplam);    // 7 + 2 + 5 = 14

        System.out.println("rakamlarToplami(-4096) = " + rakamlarToplami(-4096));   // 19
    }
}
