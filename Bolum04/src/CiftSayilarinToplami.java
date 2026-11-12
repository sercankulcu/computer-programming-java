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

/* Beklenen cikti:
baslangic: i = 2, toplam = 0
tur 1: i = 4, toplam = 2
tur 2: i = 6, toplam = 6
tur 3: i = 8, toplam = 12
tur 4: i = 10, toplam = 20
tur 5: i = 12, toplam = 30
n = 10 -> 30
n = 7 -> 12
n = 0 -> 0
*/
