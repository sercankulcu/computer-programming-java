/*
 * break donguyu bitirir, continue turun geri kalanini atlar (Slayt 13-14, Calisma Sorusu 18).
 * Beklenen cikti: "1 2 4 5 7 | bitti" ve "1 2 3 5 6 7 9 | son"
 */
public class BreakContinue {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) continue;
            if (i == 8) break;
            System.out.print(i + " ");
        }
        System.out.println("| bitti");

        // Soru 18
        for (int i = 1; i <= 12; i++) {
            if (i % 4 == 0) continue;
            if (i == 10) break;
            System.out.print(i + " ");
        }
        System.out.println("| son");
    }
}
