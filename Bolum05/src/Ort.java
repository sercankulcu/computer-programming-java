/*
 * Tam sayi bolmesi ve ortalama hatasi (Java'ya Giris Calisma Sorulari 29 ve 30).
 * 13 / 2 -> 6 (kesir atilir); a + b / 2 -> 100 (mantik hatasi), (a + b) / 2 -> 70.
 */
public class Ort {
    public static void main(String[] args) {
        // Soru 29
        int a1 = 13;
        int b1 = 2;
        int sonuc = a1 / b1;
        System.out.println(sonuc);       // 6
        System.out.println(13 / 2.0);    // 6.5: bir islenen ondalikli

        // Soru 30
        int a = 60, b = 80;
        System.out.println(a + b / 2);   // 100
        System.out.println((a + b) / 2); // 70
    }
}
