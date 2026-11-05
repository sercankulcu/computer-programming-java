/*
 * if-else yapisi: kosul true ise ilk blok, false ise else blogu calisir (Slayt 7-8).
 * Klavye yerine sabit dizgiden okunur: 75 ve 45 notlari.
 * Beklenen cikti: 75 -> Gecti, 45 -> Kaldi
 */
import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {
        Scanner klavye = new Scanner("75 45");   // new Scanner(System.in) yerine

        for (int tur = 0; tur < 2; tur++) {
            int not = klavye.nextInt();
            System.out.print(not + " -> ");
            if (not >= 60) {
                System.out.println("Gecti");
            } else {
                System.out.println("Kaldi");
            }
        }
        klavye.close();
    }
}
