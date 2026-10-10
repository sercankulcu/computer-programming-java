/*
 * Mantiksal operatorlerle karar ve De Morgan kurallari (Slayt 17-19).
 * !(yas >= 18 && belgeVar) ile (yas < 18 || !belgeVar) her girdi icin ayni sonucu verir.
 * Beklenen cikti: (20,true) icin "Basvuru alinabilir"; De Morgan tablosunda iki sutun hep esit.
 */
import java.util.Scanner;

public class MantiksalOperatorler {

    public static void main(String[] args) {
        Scanner klavye = new Scanner("20 true");   // new Scanner(System.in) yerine
        int yas = klavye.nextInt();
        boolean belgeVar = klavye.nextBoolean();
        klavye.close();

        boolean uygun = yas >= 18 && belgeVar;
        if (uygun) {
            System.out.println("Basvuru alinabilir");
        }

        // De Morgan: iki yazim her durumda ayni sonucu verir
        int[] yaslar = {20, 20, 16, 16};
        boolean[] belgeler = {true, false, true, false};
        for (int k = 0; k < 4; k++) {
            yas = yaslar[k];
            belgeVar = belgeler[k];
            boolean red1 = !(yas >= 18 && belgeVar);
            boolean red2 = yas < 18 || !belgeVar;
            System.out.println("yas=" + yas + " belgeVar=" + belgeVar
                    + " -> " + red1 + " " + red2);
        }
    }
}
