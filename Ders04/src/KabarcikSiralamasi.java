/*
 * Erken durmali kabarcik siralamasi (Algoritmalar: "Kabarcik Siralamasi", Calisma Sorulari 27 ve 29).
 * Her gecisin sonunda dizi yazilir; bir geciste degisim olmazsa durulur.
 * [5, 1, 4, 2, 8] -> 3 gecis, 9 karsilastirma; [6, 2, 8, 3] -> 3 gecis, 6; sirali [1..5] -> 1 gecis, 4.
 */
import java.util.Arrays;

public class KabarcikSiralamasi {

    static void kabarcikSirala(int[] dizi) {
        int n = dizi.length;
        int karsilastirma = 0;
        System.out.println("baslangic: " + Arrays.toString(dizi));
        int tur = 0;
        boolean degisti;
        do {
            degisti = false;
            for (int j = 0; j <= n - 2 - tur; j++) {
                karsilastirma++;
                if (dizi[j] > dizi[j + 1]) {
                    int gecici = dizi[j];
                    dizi[j] = dizi[j + 1];
                    dizi[j + 1] = gecici;
                    degisti = true;
                }
            }
            tur = tur + 1;
            System.out.println(tur + ". gecis -> " + Arrays.toString(dizi) + ", degisti = " + degisti);
        } while (degisti);   // degisti yanlis olana kadar
        System.out.println("toplam " + tur + " gecis, " + karsilastirma + " karsilastirma\n");
    }

    public static void main(String[] args) {
        kabarcikSirala(new int[] {5, 1, 4, 2, 8});
        kabarcikSirala(new int[] {6, 2, 8, 3});
        kabarcikSirala(new int[] {1, 2, 3, 4, 5});
    }
}
