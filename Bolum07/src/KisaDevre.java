/*
 * Kisa devre: && ve || sonuc belli olunca sag tarafi hesaplamaz; & ve | her iki tarafi
 * da hesaplar (Slayt 20, Calisma Sorusu 18-19).
 * Beklenen cikti: guvenli kosul false; & ile ArithmeticException yakalanir;
 *                 sayac: 1 2 1 2; Soru 19: B, C ve k = 1
 */
public class KisaDevre {

    static int sayac = 0;

    static boolean kontrol(boolean v) {
        sayac++;
        return v;
    }

    public static void main(String[] args) {
        int a = 10, b = 0;
        if (b != 0 && a / b > 1) {         // guvenli: a / b hic hesaplanmaz
            System.out.println("buyuk");
        } else {
            System.out.println("&& ile guvenli: kosul false");
        }
        try {
            if (b != 0 & a / b > 1) {      // ArithmeticException: / by zero
                System.out.println("buyuk");
            }
        } catch (ArithmeticException e) {
            System.out.println("& ile hata: " + e.getMessage());
        }

        // Soru 18: her ifadeden once sayac = 0
        sayac = 0;
        boolean s1 = kontrol(false) && kontrol(true);
        System.out.println("(1) " + s1 + " sayac=" + sayac);   // 1
        sayac = 0;
        boolean s2 = kontrol(false) & kontrol(true);
        System.out.println("(2) " + s2 + " sayac=" + sayac);   // 2
        sayac = 0;
        boolean s3 = kontrol(true) || kontrol(false);
        System.out.println("(3) " + s3 + " sayac=" + sayac);   // 1
        sayac = 0;
        boolean s4 = kontrol(true) | kontrol(false);
        System.out.println("(4) " + s4 + " sayac=" + sayac);   // 2

        // Soru 19: hangi ++k calisir?
        int k = 0;
        if (k > 0 && ++k > 0)
            System.out.println("A");
        if (k == 0 || ++k > 0)
            System.out.println("B");
        if (k == 0 | ++k > 0)
            System.out.println("C");
        System.out.println(k);   // 1
    }
}
