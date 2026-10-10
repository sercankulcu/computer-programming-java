/*
 * Biriktiricili carpim donguleri (Algoritmalar Calisma Sorulari 7 ve 8,
 * Akis Diyagramlari Calisma Sorulari 17).
 * Beklenen: "6 30 120 360", "6 36 216", "7 42 210 840".
 */
public class AzalanCarpim {
    public static void main(String[] args) {
        // Soru 7: sayi 6'dan 3'e azalir; yazma carpmadan sonra
        int sonuc = 1;
        int sayi = 6;
        while (sayi > 2) {
            sonuc = sonuc * sayi;
            sayi = sayi - 1;
            System.out.print(sonuc + " ");
        }
        System.out.println();

        // Soru 8: carpan i degil, hep sayac = 6
        sonuc = 1;
        int sayac = 6;
        for (int i = 3; i < sayac; i++) {
            sonuc = sonuc * sayac;
            System.out.print(sonuc + " ");
        }
        System.out.println();

        // Akis Diyagramlari Soru 17: sonuc = 1, sayi = 7, sayi > 3 iken
        sonuc = 1;
        sayi = 7;
        while (sayi > 3) {
            sonuc = sonuc * sayi;
            sayi = sayi - 1;
            System.out.print(sonuc + " ");
        }
        System.out.println();
    }
}
