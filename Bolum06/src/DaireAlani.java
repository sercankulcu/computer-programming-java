/*
 * Daire alani ve cevresi (Degiskenler: "Daire Alani ve Cevresi: r = 2.5").
 * Math.PI hazir sabittir; %.2f iki basamaga yuvarlar. Beklenen: "Alan: 19.63", "Cevre: 15.71".
 */
import java.util.Locale;

public class DaireAlani {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double r = 2.5;
        double alan = Math.PI * r * r;
        double cevre = 2 * Math.PI * r;
        System.out.println(alan + " " + cevre);   // yuvarlanmamis degerler
        System.out.printf("Alan: %.2f%n", alan);
        System.out.printf("Cevre: %.2f%n", cevre);
    }
}
