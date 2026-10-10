/*
 * boolean donduren metot: ciftMi dogrudan kosulda kullanilir (Slayt 30-31, Calisma Sorusu 29).
 * Beklenen cikti: "tek" (7 icin), sonra 1..10 arasinda tek ve 3'e bolunenler: "3 9"
 */
public class CiftMi {

    static boolean ciftMi(int sayi) {
        return sayi % 2 == 0;
    }

    public static void main(String[] args) {
        if (ciftMi(7)) System.out.println("cift");
        else System.out.println("tek");

        // Soru 29
        for (int i = 1; i <= 10; i++) {
            if (!ciftMi(i) && i % 3 == 0)
                System.out.print(i + " ");
        }
        System.out.println();
    }
}
