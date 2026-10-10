/*
 * Sonsuz dongu: kosul hic false olmuyorsa dongu bitmez (Slayt 17, Calisma Sorulari 34-35).
 * Gercek sonsuz donguyu calistirmak yerine bir tur siniri (GUVENLIK_SINIRI) ile gosterilir.
 * Beklenen cikti: i++ unutulunca i hep 1 kalir; duzeltilmis surumde 5! = 120
 */
public class SonsuzDongu {

    static final int GUVENLIK_SINIRI = 5;   // gercek programda bu sinir yoktur

    // Soru 34: i++ unutuldu -> while (i <= n) hep true
    static long faktoriyelHatali(int n) {
        long sonuc = 1;
        int i = 1;
        int tur = 0;
        while (i <= n) {
            sonuc *= i;
            // i++;  unutuldu
            tur++;
            System.out.println("tur " + tur + ": i = " + i + ", sonuc = " + sonuc);
            if (tur == GUVENLIK_SINIRI) {
                System.out.println("... i degismiyor, dongu sonsuza kadar surerdi");
                break;
            }
        }
        return sonuc;
    }

    // Soru 35: dogru surum
    static long faktoriyelHesapla(int n) {
        long sonuc = 1;
        int i = 1;
        while (i <= n) {
            sonuc *= i;
            i++;
        }
        return sonuc;
    }

    public static void main(String[] args) {
        faktoriyelHatali(5);
        System.out.println("Duzeltilmis: " + faktoriyelHesapla(5));   // 120

        // Yanlis yonde guncelleme: i-- ile i <= 10 cok uzun surer (int sarana kadar)
        int tur = 0;
        for (int i = 0; i <= 10; i--) {
            tur++;
            if (tur == GUVENLIK_SINIRI) {
                System.out.println("i-- ile i = " + i + ", kosul hala true");
                break;
            }
        }
    }
}
