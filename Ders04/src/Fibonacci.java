/*
 * Fibonacci algoritmasi (Algoritmalar: "Ornek: Fibonacci", Calisma Sorulari 9 ve 10).
 * n = 8 -> 0 1 1 2 3 5 8 13; n = 5 -> 0 1 1 2 3 (tur sonu a, b ve sonraki ile).
 * Soru 9: son iki atamanin yeri degisirse n = 6 icin 0 1 2 4 8 16 yazilir.
 */
public class Fibonacci {

    // oku n / a = 0, b = 1 / 0'dan n-1'e kadar: yaz a, sonraki = a + b, a = b, b = sonraki
    static void fibonacci(int n) {
        int a = 0, b = 1;
        for (int tur = 0; tur < n; tur++) {
            System.out.print(a + " ");
            int sonraki = a + b;
            a = b;          // once a = b ...
            b = sonraki;    // ... sonra b = sonraki
        }
        System.out.println();
    }

    // Soru 10: her tur sonunda a, b ve sonraki
    static void izle(int n) {
        int a = 0, b = 1;
        for (int tur = 0; tur < n; tur++) {
            int yazilan = a;
            int sonraki = a + b;
            a = b;
            b = sonraki;
            System.out.println("Tur " + tur + ": yazilan = " + yazilan + ", sonraki = " + sonraki
                    + ", a = " + a + ", b = " + b);
        }
    }

    // Soru 9: atama sirasi degismis (hatali)
    static void hataliSira(int n) {
        int a = 0, b = 1;
        for (int tur = 0; tur < n; tur++) {
            System.out.print(a + " ");
            int sonraki = a + b;
            b = sonraki;    // yer degisti
            a = b;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        fibonacci(8);     // 0 1 1 2 3 5 8 13
        izle(5);          // yazilanlar 0 1 1 2 3; son durum a = 5, b = 8
        hataliSira(6);    // 0 1 2 4 8 16 (dogrusu 0 1 1 2 3 5)
    }
}
