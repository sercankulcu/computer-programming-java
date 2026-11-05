/*
 * Erken donus: return metodu hemen bitirir (Slayt 11-12, Calisma Sorulari 9-10).
 * Soru 10: hata mesaji yazmak metodu durdurmaz; return olmadan hesap surer ve 1 doner.
 * Beklenen cikti: 7; "-1 0 1"; "Sayi negatif olamaz." ve "-3 sayisinin faktoriyeli: 1"
 */
public class ErkenDonus {

    static void yazdirPozitif(int sayi) {
        if (sayi <= 0) return;
        System.out.println(sayi);
    }

    // Soru 9
    static int sinifla(int n) {
        if (n < 0) return -1;
        if (n == 0) return 0;
        return 1;
    }

    // Soru 10: uyari yaziliyor ama return yok
    public static long faktoriyel(int sayi) {
        if (sayi < 0) {
            System.out.println("Sayi negatif olamaz.");
            // duzeltme: burada return -1; gibi bir erken donus olmali
        }
        long sonuc = 1;
        for (int i = 1; i <= sayi; i++) {
            sonuc *= i;
        }
        return sonuc;
    }

    public static void main(String[] args) {
        yazdirPozitif(-3);    // hicbir sey yazmaz
        yazdirPozitif(7);     // 7

        System.out.println(sinifla(-7) + " "
            + sinifla(0) + " " + sinifla(4));   // -1 0 1

        int sayi = -3;
        System.out.println(sayi + " sayisinin faktoriyeli: "
            + faktoriyel(sayi));
    }
}
