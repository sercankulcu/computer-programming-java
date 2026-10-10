/*
 * Ic ice kararlar: dis if dogruysa ic if denetlenir (Slayt 14, Calisma Sorusu 16).
 * Girdiler sabit dizgiden okunur: (20, true), (20, false), (16, true).
 * Beklenen cikti: Arac kullanabilir / Once ehliyet almali / Yas yetersiz
 *                 ve sinema icin Giris / Bilet al / Veliyle gel
 */
import java.util.Scanner;

public class IcIceKarar {

    public static void main(String[] args) {
        Scanner klavye = new Scanner("20 true 20 false 16 true");

        for (int tur = 0; tur < 3; tur++) {
            int yas = klavye.nextInt();
            boolean ehliyet = klavye.nextBoolean();
            System.out.print("yas=" + yas + ", ehliyet=" + ehliyet + " -> ");
            if (yas >= 18) {
                if (ehliyet)
                    System.out.println("Arac kullanabilir");
                else
                    System.out.println("Once ehliyet almali");
            } else {
                System.out.println("Yas yetersiz");
            }
        }
        klavye.close();

        // Soru 16: sinema girisi
        int[] yaslar = {20, 20, 15};
        boolean[] biletler = {true, false, true};
        for (int k = 0; k < 3; k++) {
            int yas = yaslar[k];
            boolean bilet = biletler[k];
            if (yas >= 18) {
                if (bilet)
                    System.out.println("Giris");
                else
                    System.out.println("Bilet al");
            } else {
                System.out.println("Veliyle gel");
            }
        }
    }
}
