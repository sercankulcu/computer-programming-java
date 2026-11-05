/*
 * Metot asiri yukleme: ayni ad, farkli parametre listesi (Slayt 17-18, Calisma Sorusu 17).
 * Yalniz donus tipi farkli iki metot tanimlanamaz. Derleyici en uygun imzayi secer:
 * char -> int genisler, long -> double genisler (long -> int olmaz).
 * Beklenen cikti: 16, 15; int 5, double 5.0, iki 7, int 65, double 7.0
 */
public class AsiriYukleme {

    static int alan(int kenar) {
        return kenar * kenar;
    }

    static int alan(int en, int boy) {
        return en * boy;
    }

    // HATA: yalniz donus tipi farkli -> "method alan(int) is already defined"
    // static double alan(int kenar) { ... }

    // Soru 17
    static void yaz(int x) {
        System.out.println("int " + x);
    }

    static void yaz(double x) {
        System.out.println("double " + x);
    }

    static void yaz(int a, int b) {
        System.out.println("iki " + (a + b));
    }

    public static void main(String[] args) {
        System.out.println(alan(4));      // 16
        System.out.println(alan(3, 5));   // 15

        yaz(5);
        yaz(5.0);
        yaz(3, 4);
        yaz('A');                         // char -> int: int 65
        yaz(7L);                          // long -> double: double 7.0
    }
}
