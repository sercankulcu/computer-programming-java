/*
 * usHesapla: negatif us icin kendini pozitif usle cagirir (Calisma Sorulari 5-6).
 * 2^-2 = 1 / 2^2 = 0.25; 3^0 = 1.0 (dongu hic donmez).
 * Beklenen cikti: 0.25, 1.0, 0.1, 6.25
 */
public class UsHesapla {

    static double usHesapla(double taban, int us) {
        double sonuc = 1;
        if (us < 0) {
            sonuc = 1.0 / (usHesapla(taban, -us));
        } else {
            for (int i = 0; i < us; i++) {
                sonuc *= taban;
            }
        }
        return sonuc;
    }

    public static void main(String[] args) {
        System.out.println(usHesapla(2, -2));    // 0.25
        System.out.println(usHesapla(3, 0));     // 1.0
        System.out.println(usHesapla(10, -1));   // 0.1
        System.out.println(usHesapla(2.5, 2));   // 6.25
    }
}
