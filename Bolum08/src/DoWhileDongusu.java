/*
 * do-while: govde en az bir kez calisir, kosul sonda denetlenir (Slayt 10-11, Calisma Sorusu 15).
 * Menu girdileri klavye yerine sabit dizgiden okunur: 1, 1, 0.
 * Beklenen cikti: iki kez "Merhaba!", "Gule gule"; sonra "5 | 6 5"
 */
import java.util.Scanner;

public class DoWhileDongusu {

    public static void main(String[] args) {
        Scanner klavye = new Scanner("1 1 0");   // new Scanner(System.in) yerine
        int secim;
        do {
            System.out.print("Secim (1/0): ");
            secim = klavye.nextInt();
            System.out.println(secim);           // girdiyi ekranda gostermek icin
            if (secim == 1)
                System.out.println("Merhaba!");
        } while (secim != 0);
        System.out.println("Gule gule");
        klavye.close();

        // Soru 15: kosul basta false olsa da do-while bir kez calisir
        int n = 5;
        do {
            System.out.print(n + " ");
            n++;
        } while (n < 3);

        int m = 5;
        while (m < 3) {
            System.out.print(m + " ");
            m++;
        }
        System.out.println("| " + n + " " + m);  // 5 | 6 5
    }
}
