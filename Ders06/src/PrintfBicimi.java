/*
 * Bicimli cikti: printf (Degiskenler: "Bicimli Cikti: printf", "printf Bicimini Adim Adim Cozumle";
 * Calisma Sorulari 34). Ondalik ayirici nokta olsun diye Locale.US kullanilir (Turkce ayarda virgul).
 * Beklenen: "Ada         87.46", "Ada     |  3.14|00042", "Can   |  2.718|0007".
 */
import java.util.Locale;

public class PrintfBicimi {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        String ad = "Ada";
        double ortalama = 87.456;
        System.out.printf("%-10s %6.2f%n", ad, ortalama);

        System.out.printf("%-8s|%6.2f|%05d%n",
                          "Ada", 3.14159, 42);

        // Soru 34
        System.out.printf("%-6s|%7.3f|%04d%n",
                "Can", 2.71828, 7);

        // Turkce yerel ayarda ayni bicim
        System.out.println(String.format(new Locale("tr", "TR"), "Turkce ayar: %6.2f", 3.14159));
    }
}
