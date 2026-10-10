/*
 * Iki degiskeni takas etme (Degiskenler: "Iki Degiskeni Takas Etme"; Calisma Sorulari 36).
 * Yanlis deneme 8 8 verir; gecici degiskenle 8 5; gecici degiskensiz (toplamla) yine 8 5.
 */
public class Takas {
    public static void main(String[] args) {
        int a = 5, b = 8;
        a = b;                // yanlis deneme
        b = a;
        System.out.println(a + " " + b);   // 8 8

        a = 5; b = 8;         // bastan
        int gecici = a;       // dogru yontem
        a = b;
        b = gecici;
        System.out.println(a + " " + b);   // 8 5

        // Soru 36: gecici degiskensiz takas (a + b int sinirini asarsa ara toplam tasar)
        a = 5; b = 8;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a + " " + b);   // 8 5
    }
}
