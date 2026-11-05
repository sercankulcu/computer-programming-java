/*
 * Ikinci dereceden denklem: diskriminant d = b*b - 4ac'ye gore uc durum
 * (Slayt 34, Calisma Sorusu 35). Katsayilar sabit dizgiden okunur.
 * Beklenen cikti: (1,-5,6) -> 3.0 ve 2.0; (1,2,1) -> -1.0; (1,0,1) -> Reel kok yok
 */
import java.util.Scanner;

public class IkinciDerecedenDenklem {

    public static void main(String[] args) {
        Scanner klavye = new Scanner("1 -5 6  1 2 1  1 0 1");   // new Scanner(System.in) yerine
        for (int tur = 0; tur < 3; tur++) {
            double a = klavye.nextDouble();
            double b = klavye.nextDouble();
            double c = klavye.nextDouble();
            System.out.print("a=" + a + " b=" + b + " c=" + c + " -> ");
            double d = b * b - 4 * a * c;
            if (d > 0) {
                double x1 = (-b + Math.sqrt(d)) / (2 * a);
                double x2 = (-b - Math.sqrt(d)) / (2 * a);
                System.out.println(x1 + " ve " + x2);
            } else if (d == 0) {
                System.out.println(-b / (2 * a));
            } else {
                System.out.println("Reel kok yok");
            }
        }
        klavye.close();
    }
}
