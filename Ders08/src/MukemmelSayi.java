/*
 * Mukemmel sayi: kendisi haric bolenleri toplami kendisine esit (Slayt 29).
 * Bolen ararken n / 2'ye kadar gitmek yeterlidir.
 * Beklenen cikti: 28 -> true, 12 -> false; 1..1000 arasinda 6 28 496
 */
public class MukemmelSayi {

    public static void main(String[] args) {
        int[] denemeler = {28, 12};
        for (int n : denemeler) {
            int toplam = 0;
            for (int i = 1; i <= n / 2; i++) {
                if (n % i == 0) toplam += i;
            }
            System.out.println(n + " -> " + (toplam == n));
        }

        for (int n = 2; n <= 1000; n++) {
            int toplam = 0;
            for (int i = 1; i <= n / 2; i++) {
                if (n % i == 0) toplam += i;
            }
            if (toplam == n) System.out.print(n + " ");
        }
        System.out.println();
    }
}
