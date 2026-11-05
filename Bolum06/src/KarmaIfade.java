/*
 * Karma ifade: siralama ve tipler sonucu belirler (Degiskenler: "Karma Ifade: a / b * 2.0 + a % b";
 * Calisma Sorulari 28). a = 7, b = 2 -> 7.0 (a / 2.0 ile 8.0); a = 9, b = 4 -> 4.0 (a / 4.0 ile 4.375).
 */
public class KarmaIfade {
    public static void main(String[] args) {
        int a = 7, b = 2;
        double r = a / b * 2.0 + a % b;
        System.out.println(r);                       // 7.0
        System.out.println(a / 2.0 * 2.0 + a % b);   // 8.0

        // Soru 28
        int a2 = 9, b2 = 4;
        double r2 = a2 / b2 * 1.5 + a2 % b2;
        System.out.println(r2);                      // 4.0
        System.out.println(a2 / 4.0 * 1.5 + a2 % b2); // 4.375
    }
}
