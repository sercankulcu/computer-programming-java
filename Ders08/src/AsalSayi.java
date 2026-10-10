/*
 * Asal sayi denetimi: bolen 2'den karekoke kadar aranir (i <= n / i tasma yapmaz)
 * (Slayt 33-36). Ic ice dongu ve break ile 1..n arasi asallar.
 * Beklenen cikti: 29 -> true, 21 -> false, "2 3 5 7 11 13 17 19"
 */
public class AsalSayi {

    public static void main(String[] args) {
        int[] denemeler = {29, 21};
        for (int n : denemeler) {
            boolean asal = n >= 2;
            for (int i = 2; asal && i <= n / i; i++) {
                if (n % i == 0) asal = false;
            }
            System.out.println(n + " -> " + asal);
        }

        // Slayt 36: 1..n asal sayilar
        int n = 20;
        for (int k = 2; k <= n; k++) {
            boolean asal = true;
            for (int i = 2; i <= k / i; i++) {
                if (k % i == 0) { asal = false; break; }
            }
            if (asal) System.out.print(k + " ");
        }
        System.out.println();
    }
}
