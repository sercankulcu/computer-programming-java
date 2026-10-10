/*
 * Kisa devre degerlendirme (Degiskenler: "Kisa Devre Adim Adim"; Calisma Sorulari 29).
 * b = 0 iken sol kosul false, a / b hic hesaplanmaz (sifira bolme olmaz).
 * Beklenen: b = 2 -> "Oran buyuk"; b = 4 -> "Oran kucuk" (10 / 4 = 2, 2 > 2 false).
 */
public class KisaDevre {
    public static void main(String[] args) {
        int a = 10, b = 0;
        if (b != 0 && a / b > 2) {
            System.out.println("Oran buyuk");
        }
        b = 2;
        if (b != 0 && a / b > 2) {
            System.out.println("Oran buyuk");
        }

        // Soru 29
        b = 0;
        if (b != 0 && a / b > 2)
            System.out.println("Oran buyuk");
        b = 4;
        if (b != 0 && a / b > 2)
            System.out.println("Oran buyuk");
        else
            System.out.println("Oran kucuk");

        // Kosullar ters yazilsaydi b = 0 iken program cokerdi
        b = 0;
        try {
            if (a / b > 2 && b != 0)
                System.out.println("Oran buyuk");
        } catch (ArithmeticException e) {
            System.out.println("Ters sira: ArithmeticException: " + e.getMessage());
        }
    }
}
