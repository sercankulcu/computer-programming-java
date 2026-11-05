/*
 * Eklemeli siralama (Algoritmalar: "Eklemeli Siralama", Calisma Sorulari 28 ve 29).
 * Her i icin anahtar ve dizi yazilir; dizi[j] > anahtar karsilastirmalari sayilir.
 * [4, 3, 5, 1] -> 5 karsilastirma; [6, 2, 8, 3] -> 5; sirali [1..5] -> 4.
 */
import java.util.Arrays;

public class EklemeliSiralama {

    static int karsilastirma;   // dizi[j] > anahtar karsilastirmasi sayisi

    // Karsilastirmayi sayarak yapar
    static boolean buyukMu(int deger, int anahtar) {
        karsilastirma++;
        return deger > anahtar;
    }

    static void eklemeliSirala(int[] dizi) {
        int n = dizi.length;
        karsilastirma = 0;
        System.out.println("baslangic: " + Arrays.toString(dizi));
        for (int i = 1; i <= n - 1; i++) {
            int anahtar = dizi[i];
            int j = i - 1;
            // j >= 0 yanlis olunca dizi[j] hic okunmaz (kisa devre)
            while (j >= 0 && buyukMu(dizi[j], anahtar)) {
                dizi[j + 1] = dizi[j];   // buyuk oge bir saga kayar
                j = j - 1;
            }
            dizi[j + 1] = anahtar;      // anahtar acilan bosluga konur
            System.out.println("i = " + i + ", anahtar = " + anahtar + " -> " + Arrays.toString(dizi));
        }
        System.out.println("toplam " + karsilastirma + " karsilastirma\n");
    }

    public static void main(String[] args) {
        eklemeliSirala(new int[] {4, 3, 5, 1});
        eklemeliSirala(new int[] {6, 2, 8, 3});
        eklemeliSirala(new int[] {1, 2, 3, 4, 5});
    }
}
