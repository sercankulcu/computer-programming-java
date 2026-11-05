/*
 * Calisma Sorusu 39: 13! int'e sigmaz; tasma sessizce yanlis sonuc verir.
 * 12! = 479001600 int sinirinin altinda; 13! = 6227020800 ise long gerektirir.
 * Beklenen cikti: int ile 1932053504 (yanlis), long ile 6227020800
 */
public class FaktoriyelTasmasi {

    public static void main(String[] args) {
        int sonuc = 1;
        for (int i = 1; i <= 13; i++) {
            sonuc *= i;
        }
        System.out.println(sonuc);       // 1932053504 (tasma)

        long dogru = 1;
        for (int i = 1; i <= 13; i++) {
            dogru *= i;
        }
        System.out.println(dogru);       // 6227020800

        // Tasmayi yakalamak icin: Math.multiplyExact istisna firlatir
        try {
            int s = 1;
            for (int i = 1; i <= 13; i++) {
                s = Math.multiplyExact(s, i);
            }
            System.out.println(s);
        } catch (ArithmeticException e) {
            System.out.println("Hata: " + e.getMessage());
        }
    }
}
