/*
 * Not ortalamasi ve hata turleri (Programlamaya Giris Calisma Sorulari 5, 6, 9 ve 15).
 * n1 + n2 + n3 / 3 mantik hatasi "Ortalama: 185" verir; dogrusu 81.67.
 * (70, 85, 90) -> Gecti: 81.67; (40, 55, 62) -> Kaldi: 52.33. Sifira bolme istisnasi yakalanir.
 */
import java.util.Locale;

public class NotOrtalamasi {

    static void degerlendir(int n1, int n2, int n3) {
        double ort = (n1 + n2 + n3) / 3.0;
        if (ort >= 60)
            System.out.printf("Gecti: %.2f%n", ort);
        else
            System.out.printf("Kaldi: %.2f%n", ort);
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);   // ondalik ayirici nokta olsun

        // Soru 9: bolme toplamadan once yapilir -> mantik hatasi
        int n1 = 70, n2 = 85, n3 = 90;
        int ort = n1 + n2 + n3 / 3;
        System.out.println("Ortalama: " + ort);                 // 185
        System.out.printf("Ortalama: %.2f%n", (n1 + n2 + n3) / 3.0);  // 81.67

        // Soru 15
        degerlendir(70, 85, 90);
        degerlendir(40, 55, 62);

        // Soru 5: soz dizimi hatasi derleyicide yakalanir, program hic calismaz:
        // System.out.println((x + 2);   // ) eksik -> derleme hatasi

        // Soru 6: sifira bolme derlenir ama calisirken hata verir; "Son" yazilmaz
        System.out.println("Merhaba");
        int x = 10;
        try {
            System.out.println(x / 0);
            System.out.println("Son");
        } catch (ArithmeticException e) {
            System.out.println("Calisma zamani hatasi: " + e.getMessage());
        }
    }
}
