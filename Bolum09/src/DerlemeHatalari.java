/*
 * return ile ilgili derleme hatalari (Slayt 13): hatali surumler yorum icinde,
 * duzeltilmis surumler calisir.
 *  - Her yolda return olmali: "missing return statement"
 *  - double, int'e kendiliginden donusmez: "possible lossy conversion from double to int"
 * Beklenen cikti: 1, 0, 2
 */
public class DerlemeHatalari {

    // HATALI: n <= 0 icin return yok
    // static int yaz(int n) {
    //     if (n > 0) {
    //         return 1;
    //     }
    // }

    static int yaz(int n) {
        if (n > 0) {
            return 1;
        }
        return 0;                 // her yolda bir deger
    }

    // HATALI: 2.5 int'e sigmaz
    // static int f() {
    //     return 2.5;
    // }

    static int f() {
        return (int) 2.5;         // acik donusum: 2 (kesirli kisim atilir)
    }

    public static void main(String[] args) {
        System.out.println(yaz(5));    // 1
        System.out.println(yaz(-5));   // 0
        System.out.println(f());       // 2
    }
}
