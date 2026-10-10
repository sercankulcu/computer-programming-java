/*
 * 1'den n'e toplam: diyagramdan Java koduna (Akis Diyagramlari: "Ornek: 1'den n'e Toplam",
 * "Diyagramdan Java Koduna"; Calisma Sorulari 19 ve 29). n = 3 -> 6, n = 4 -> 10;
 * test girdileri 0, 1, 5 -> 0, 1, 15. Carpim biriktiricisi 0 ile baslarsa n = 4 icin 0 (1 ile 24).
 */
public class BirdenNeToplam {

    static int toplam(int n) {
        int toplam = 0, i = 1;
        while (i <= n) {
            toplam = toplam + i;
            i = i + 1;
        }
        return toplam;
    }

    static int carpim(int n, int baslangic) {
        int carpim = baslangic, i = 1;
        while (i <= n) {
            carpim = carpim * i;
            i = i + 1;
        }
        return carpim;
    }

    public static void main(String[] args) {
        // Slayttaki kod: girdi sabit alindi
        int n = 3;
        int toplam = 0, i = 1;
        while (i <= n) {
            toplam = toplam + i;
            i = i + 1;
        }
        System.out.println(toplam);   // 6

        System.out.println("n = 4 -> " + toplam(4) + " (formul n(n+1)/2 = " + 4 * 5 / 2 + ")");

        // Soru 29: dongunun sifir, bir ve cok kez dondugu durumlar
        int[] testler = {0, 1, 5};
        for (int t : testler)
            System.out.println("n = " + t + " -> " + toplam(t));

        // Soru 19: carpim icin baslangic degeri 1 olmali
        System.out.println("carpim = 0 ile n = 4 -> " + carpim(4, 0));   // 0
        System.out.println("carpim = 1 ile n = 4 -> " + carpim(4, 1));   // 24
    }
}
