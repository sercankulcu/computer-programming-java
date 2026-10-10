/*
 * Faktoriyel algoritmasi (Algoritmalar: "Ornek: Faktoriyel", izleme tablosu, test durumlari).
 * n = 5 -> 120, n = 0 -> 1, n = -3 -> hata, n = 21 -> kisit uyarisi (21! long'a sigmaz).
 * Calisma Sorulari 5 (sonuc = 0 ile baslarsa 0) ve 6 (i < n sinir hatasi: n = 5 -> 24) da gosterilir.
 */
public class Faktoriyel {

    // Dersteki algoritma; kisit 0 <= n <= 20 (Alistirma: n = 21 icin uyari)
    static void faktoriyel(int n) {
        if (n < 0) {
            System.out.println("n = " + n + " -> hata");
            return;
        }
        if (n > 20) {
            System.out.println("n = " + n + " -> uyari: kisit 0 <= n <= 20 (" + n + "! long'a sigmaz)");
            return;
        }
        long sonuc = 1;
        int i = 2;
        while (i <= n) {
            sonuc = sonuc * i;
            i = i + 1;
        }
        System.out.println("n = " + n + " -> " + sonuc);
    }

    // Izleme tablosu: i tur basi degeri, sonuc tur sonu degeri
    static void izle(int n) {
        long sonuc = 1;
        int i = 2;
        System.out.println("an\t\ti\tsonuc\ti <= n");
        System.out.println("baslangic\t" + i + "\t" + sonuc + "\t-");
        int tur = 1;
        while (i <= n) {
            int turBasiI = i;
            sonuc = sonuc * i;
            i = i + 1;
            System.out.println("tur " + tur + "\t\t" + turBasiI + "\t" + sonuc + "\tdogru");
            tur++;
        }
        System.out.println("cikis\t\t" + i + "\t" + sonuc + "\t" + i + " <= " + n + " yanlis");
    }

    public static void main(String[] args) {
        faktoriyel(5);    // 120 (normal)
        faktoriyel(0);    // 1 (sinir: dongu hic donmez)
        faktoriyel(1);    // 1
        faktoriyel(-3);   // hata (gecersiz)
        faktoriyel(20);   // 2432902008176640000 (long'a sigar)
        faktoriyel(21);   // uyari (buyuk)

        System.out.println();
        izle(4);          // n = 4 icin izleme tablosu

        // Kisit denetlenmeden 21! hesaplanirsa long sessizce tasar
        long tasan = 1;
        for (int i = 2; i <= 21; i++) tasan = tasan * i;
        System.out.println("\n21! long ile: " + tasan + " (dogrusu 51090942171709440000)");

        // Soru 5: sonuc = 0 ile baslatilirsa
        int sonuc = 0;
        int i = 2;
        while (i <= 5) {
            sonuc = sonuc * i;
            i = i + 1;
        }
        System.out.println("Soru 5 (sonuc = 0, n = 5): " + sonuc);   // 0

        // Soru 6: kosul i < n yazilirsa
        int[] girdiler = {5, 1};
        for (int n : girdiler) {
            sonuc = 1;
            i = 2;
            while (i < n) {
                sonuc = sonuc * i;
                i = i + 1;
            }
            System.out.println("Soru 6 (i < n, n = " + n + "): " + sonuc);   // 24, 1
        }
    }
}
