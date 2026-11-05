/*
 * Problemi parcalama: enBuyuk3, iki sayilik enBuyuk'u iki kez cagirir (Slayt 27, 38).
 * Beklenen cikti: 9
 */
public class EnBuyuk3 {

    static int enBuyuk(int a, int b) {
        if (a > b) return a;
        return b;
    }

    static int enBuyuk3(int a, int b, int c) {
        return enBuyuk(enBuyuk(a, b), c);
    }

    public static void main(String[] args) {
        System.out.println(enBuyuk3(4, 9, 7));   // 9
    }
}
