/*
 * Tip donusumu: genisletme otomatik, daraltma acik donusum ister (Degiskenler: "Tip Donusumu",
 * "Donusumlerde Tasma ve Kesme"; Calisma Sorulari 9, 12). Beklenen: 7.0 9 9.8 2 2.5;
 * (byte) 200 = -56, (int) 3000000000L = -1294967296, (int) -2.7 = -2, Math.round(-2.7) = -3.
 */
public class TipDonusumu {
    public static void main(String[] args) {
        int adet = 7;
        double genis = adet;       // 7.0
        double oran = 9.8;
        int dar = (int) oran;      // 9 (oran hala 9.8)
        int bolum = 5 / 2;         // 2
        double dogru = 5.0 / 2;    // 2.5
        System.out.println(genis + " " + dar + " " + oran + " " + bolum + " " + dogru);

        // Donusumlerde tasma ve kesme
        System.out.println((byte) 200);           // -56
        System.out.println((int) 3000000000L);    // -1294967296
        System.out.println((int) 3.9);            // 3
        System.out.println((int) -2.7);           // -2
        System.out.println((int) 3.9e10);         // 2147483647
        System.out.println(Math.round(3.9));      // 4
        System.out.println(Math.round(-2.7));     // -3
        System.out.println(Math.round(3.9e10));   // 39000000000

        // Soru 9 ve 12
        System.out.println((byte) 200 + " " + (byte) 130);          // -56 -126
        System.out.println((int) -2.7 + " " + Math.round(-2.7));    // -2 -3
    }
}
