/*
 * switch ifadesi (ok -> bicimi) bir deger uretir; birden fazla etiket virgulle yazilir
 * (Slayt 24-25, Calisma Sorusu 28). Ok biciminde dusme (fall-through) olmaz.
 * Beklenen cikti: 1 Kis, 4 Ilkbahar, 7 Yaz, 10 Sonbahar, 13 Gecersiz
 */
import java.util.Scanner;

public class SwitchIfadesi {

    public static void main(String[] args) {
        Scanner klavye = new Scanner("1 4 7 10 13");   // new Scanner(System.in) yerine
        while (klavye.hasNextInt()) {
            int ay = klavye.nextInt();
            String mevsim = switch (ay) {
                case 12, 1, 2 -> "Kis";
                case 3, 4, 5 -> "Ilkbahar";
                case 6, 7, 8 -> "Yaz";
                case 9, 10, 11 -> "Sonbahar";
                default -> "Gecersiz";
            };
            System.out.println(ay + " " + mevsim);
        }
        klavye.close();
    }
}
