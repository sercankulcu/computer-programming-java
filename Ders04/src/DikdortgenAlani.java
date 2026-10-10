/*
 * Problemden programa: dikdortgen alani ve cevresi (Programlamaya Giris: "Algoritmayi Izleme:
 * Dikdortgen Alani"; Calisma Sorulari 13 ve 14). (3, 4) -> Alan: 12, Cevre: 14;
 * (-2, 4) ve (0, 5) -> Gecersiz olcu; (5, 2) -> Alan: 10, Cevre: 14. Girdiler sabit dizgiden okunur.
 */
import java.util.Scanner;

public class DikdortgenAlani {
    public static void main(String[] args) {
        Scanner klavye = new Scanner("3 4  -2 4  0 5  5 2");
        for (int calistirma = 1; calistirma <= 4; calistirma++) {
            int en = klavye.nextInt();    // oku en
            int boy = klavye.nextInt();   // oku boy
            System.out.println("en = " + en + ", boy = " + boy);
            if (en > 0 && boy > 0) {
                int alan = en * boy;
                int cevre = 2 * (en + boy);
                System.out.println("Alan: " + alan);
                System.out.println("Cevre: " + cevre);
            } else {
                System.out.println("Gecersiz olcu");
            }
        }
    }
}
