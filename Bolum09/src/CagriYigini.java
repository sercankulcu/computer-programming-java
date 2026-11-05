/*
 * Cagri yigini: main -> ortalama -> topla; her cagri kendi cercevesini acar
 * (Slayt 7, Calisma Sorulari 2, 3 ve 31). Argumanlar soldan saga hesaplanir.
 * Beklenen cikti: 8, 6, "f1 f2 6", "12 2"
 */
public class CagriYigini {

    static int sayac = 0;

    static int topla(int a, int b) {
        return a + b;
    }

    static int ortalama(int x, int y) {
        int t = topla(x, y);
        return t / 2;             // tam sayi bolmesi
    }

    // Soru 3: cagri sirasini ekrana yazan metot
    static int f(int x) {
        System.out.print("f" + x + " ");
        return x * 2;
    }

    // Soru 31: ic ice cagri ve sayac
    static int ikiyle(int n) {
        sayac++;
        return n * 2;
    }

    public static void main(String[] args) {
        int o = ortalama(9, 7);
        System.out.println(o);                   // 8

        System.out.println(ortalama(8, 5));      // 13 / 2 = 6

        System.out.println(f(1) + f(2));         // f1 f2 6

        int r = ikiyle(ikiyle(3));               // once ic cagri: 6, sonra 12
        System.out.println(r + " " + sayac);     // 12 2
    }
}
