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

/* Beklenen cikti:
baslangic: [4, 3, 5, 1]
i = 1, anahtar = 3 -> [3, 4, 5, 1]
i = 2, anahtar = 5 -> [3, 4, 5, 1]
i = 3, anahtar = 1 -> [1, 3, 4, 5]
toplam 5 karsilastirma

baslangic: [6, 2, 8, 3]
i = 1, anahtar = 2 -> [2, 6, 8, 3]
i = 2, anahtar = 8 -> [2, 6, 8, 3]
i = 3, anahtar = 3 -> [2, 3, 6, 8]
toplam 5 karsilastirma

baslangic: [1, 2, 3, 4, 5]
i = 1, anahtar = 2 -> [1, 2, 3, 4, 5]
i = 2, anahtar = 3 -> [1, 2, 3, 4, 5]
i = 3, anahtar = 4 -> [1, 2, 3, 4, 5]
i = 4, anahtar = 5 -> [1, 2, 3, 4, 5]
toplam 4 karsilastirma
*/
