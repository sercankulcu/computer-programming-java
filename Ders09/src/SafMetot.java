/*
 * Saf metot ve yan etki (Slayt 40): kare(x) deger dondurur ve baska hesapta kullanilabilir;
 * kareYaz(x) yalniz ekrana yazar. Hazir Math metotlari da saf metotlardir (Slayt 25).
 * Beklenen cikti: 16, 25 (kare(3) + kare(4)), 16; Math: 7 9 4.0 1024.0 3
 */
public class SafMetot {

    static int kare(int x) {
        return x * x;
    }

    static void kareYaz(int x) {
        System.out.println(x * x);
    }

    public static void main(String[] args) {
        System.out.println(kare(4));              // 16
        System.out.println(kare(3) + kare(4));    // 25: sonuc hesapta kullanilabilir
        kareYaz(4);                               // 16: yalniz ekrana yazar
        // int t = kareYaz(3) + kareYaz(4);       // HATA: void deger vermez

        // Slayt 25: sik kullanilan Math metotlari
        System.out.println(Math.abs(-7) + " " + Math.max(3, 9) + " "
                + Math.sqrt(16) + " " + Math.pow(2, 10) + " " + Math.round(2.5));
    }
}
