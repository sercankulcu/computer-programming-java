/*
 * Celsius -> Fahrenheit (Degiskenler: "Celsius -> Fahrenheit: 100, 37, -40").
 * Girdiler klavye yerine sabit dizgiden okunur. Beklenen: "100.0 C = 212.0 F",
 * "37.0 C = 98.6 F", "-40.0 C = -40.0 F". 9 / 5 * c yazilsaydi 9 / 5 = 1 olurdu.
 */
import java.util.Locale;
import java.util.Scanner;

public class CelsiusFahrenheit {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);   // nokta ondalik ayirici (Turkce ayarda nextDouble "37,5" bekler)
        Scanner klavye = new Scanner("100 37 -40");
        for (int k = 0; k < 3; k++) {
            double c = klavye.nextDouble();
            double f = c * 9 / 5 + 32;
            System.out.printf("%.1f C = %.1f F%n", c, f);
        }
        double c = 100;
        System.out.println("Hatali 9 / 5 * c + 32: " + (9 / 5 * c + 32));   // 132.0
    }
}
