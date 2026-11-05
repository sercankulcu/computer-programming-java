/*
 * float/double sayac tuzagi: 0.1 ikilik tabanda tam gosterilemez (Slayt 18, Calisma Sorusu 17).
 * x 0.9999999999999999 iken x < 1.0 hala true oldugundan 10 yerine 11 tur doner.
 * Beklenen cikti: son x degerleri ve n = 11; tam sayi sayacla 10
 */
public class DoubleSayac {

    public static void main(String[] args) {
        int n = 0;
        for (double x = 0; x < 1.0; x += 0.1) {
            n++;
            if (n >= 9) System.out.println("tur " + n + ": x = " + x);
        }
        System.out.println(n);    // 11

        // Cozum: sayaci tam sayi tut, double degeri ondan hesapla
        int sayac = 0;
        for (int k = 0; k < 10; k++) {
            double x = k * 0.1;
            sayac++;
        }
        System.out.println(sayac); // 10
    }
}
