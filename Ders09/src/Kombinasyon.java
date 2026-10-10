/*
 * kombinasyon, faktoriyel'i uc kez cagirir (Calisma Sorusu 12): C(n, r) = n! / (r! (n-r)!).
 * Beklenen cikti: 6 (C(4,2) = 24 / (2 * 2)), 10 (C(5,3))
 */
public class Kombinasyon {

    static long faktoriyel(int n) {
        long sonuc = 1;
        for (int i = 2; i <= n; i++)
            sonuc *= i;
        return sonuc;
    }

    static long kombinasyon(int n, int r) {
        return faktoriyel(n)
            / (faktoriyel(r) * faktoriyel(n - r));
    }

    public static void main(String[] args) {
        System.out.println(kombinasyon(4, 2));   // 6
        System.out.println(kombinasyon(5, 3));   // 10
    }
}
