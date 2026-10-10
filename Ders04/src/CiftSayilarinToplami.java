/*
 * 1'den n'e kadar cift sayilarin toplami (Algoritmalar Calisma Sorulari 19 ve alistirma).
 * n = 10 -> 30 (izleme tablosuyla), n = 7 -> 12, n = 0 -> 0 (dongu hic donmez).
 */
public class CiftSayilarinToplami {

    static int ciftToplam(int n, boolean izle) {
        int toplam = 0;
        int i = 2;
        if (izle) System.out.println("baslangic: i = " + i + ", toplam = " + toplam);
        int tur = 1;
        while (i <= n) {
            toplam = toplam + i;
            i = i + 2;
            if (izle) System.out.println("tur " + tur++ + ": i = " + i + ", toplam = " + toplam);
        }
        return toplam;
    }

    public static void main(String[] args) {
        System.out.println("n = 10 -> " + ciftToplam(10, true));   // 30
        System.out.println("n = 7 -> " + ciftToplam(7, false));    // 12
        System.out.println("n = 0 -> " + ciftToplam(0, false));    // 0
    }
}
