/*
 * Secimli siralama (Algoritmalar: "Secimli Siralama", Calisma Sorulari 26 ve 29).
 * Her gecisten sonra dizi ve enK yazilir; karsilastirma sayisi her zaman n(n-1)/2.
 * [29, 10, 14, 37, 13] -> 10 karsilastirma; [6, 2, 8, 3] -> 6; sirali [1..5] -> yine 10.
 */
import java.util.Arrays;

public class SecimliSiralama {

    static void secimliSirala(int[] dizi) {
        int n = dizi.length;
        int karsilastirma = 0;
        System.out.println("baslangic: " + Arrays.toString(dizi));
        for (int i = 0; i <= n - 2; i++) {
            int enK = i;
            for (int j = i + 1; j <= n - 1; j++) {
                karsilastirma++;
                if (dizi[j] < dizi[enK]) enK = j;
            }
            // dizi[i] ile dizi[enK] yer degistir
            int gecici = dizi[i];
            dizi[i] = dizi[enK];
            dizi[enK] = gecici;
            System.out.println("i = " + i + ", enK = " + enK + " -> " + Arrays.toString(dizi));
        }
        System.out.println("toplam " + karsilastirma + " karsilastirma\n");
    }

    public static void main(String[] args) {
        secimliSirala(new int[] {29, 10, 14, 37, 13});
        secimliSirala(new int[] {6, 2, 8, 3});
        secimliSirala(new int[] {1, 2, 3, 4, 5});
    }
}
