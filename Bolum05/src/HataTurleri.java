/*
 * Hata turleri: soz dizimi, tip, calisma zamani, mantik (Java'ya Giris: "Hata Turleri Orneklerle";
 * Calisma Sorulari 19, 25, 26, 28, 31). Derleme hatalari yorum olarak gosterilir;
 * sifira bolme try/catch ile yakalanir ("/ by zero"); a + b / 2 -> 115 (beklenen 80).
 */
public class HataTurleri {
    public static void main(String[] args) {
        // Hata1 - soz dizimi hatasi (derlenmez):  error: ';' expected
        //     System.out.println("Merhaba")
        // Hata2 - tip hatasi (derlenmez):  error: incompatible types: String cannot be converted to int
        //     int sayi = "42";
        // Soru 19:  system.out.println("x");  -> error: package system does not exist
        // Soru 26:  System.out.printn("y");   -> error: cannot find symbol (method printn(String))

        // Hata3 / Soru 31 - calisma zamani hatasi: derlenir, calisirken istisna firlatir
        System.out.println("Basla");
        int x = 10, y = 0;
        try {
            System.out.println(x / y);
            System.out.println("Bitti");   // hic calismaz
        } catch (ArithmeticException e) {
            System.out.println("java.lang.ArithmeticException: " + e.getMessage());
        }

        // Hata4 - mantik hatasi: hata iletisi yok ama sonuc yanlis
        int a = 70, b = 90;
        System.out.println(a + b / 2);     // 115 (/ once yapilir: 70 + 45)
        System.out.println((a + b) / 2);   // 80 (duzeltme)
    }
}
