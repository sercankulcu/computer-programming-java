/*
 * Etiketli break dis donguyu de bitirir; duz break yalniz ic donguyu bitirir
 * (Slayt 15-16, Calisma Sorusu 25).
 * Beklenen cikti: etiketli: 1 1, 1 2, 1 3, 2 1, bitti
 *                 duz: 1 1, 1 2, 1 3, 2 1, 3 1, 3 2, 3 3, bitti (yalniz i = 2 satiri kesilir)
 */
public class EtiketliBreak {

    public static void main(String[] args) {
        System.out.println("Etiketli break:");
        dis:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i * j == 4) break dis;
                System.out.println(i + " " + j);
            }
        }
        System.out.println("bitti");

        System.out.println("Duz break:");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i * j == 4) break;
                System.out.println(i + " " + j);
            }
        }
        System.out.println("bitti");
    }
}
