/*
 * switch ile hesap makinesi: String uzerinde ok bicimi switch deyimi
 * (Slayt 36, Calisma Sorusu 30). Eslesme yoksa default calisir.
 * Beklenen cikti: 12.0, 2.0, 35.0, 3.5, Hata!, Gecersiz (9 % 4 icin)
 */
import java.util.Scanner;

public class HesapMakinesi {

    public static void main(String[] args) {
        // her satir: x op y   (new Scanner(System.in) yerine)
        Scanner klavye = new Scanner("7 + 5  7 - 5  7 * 5  7 / 2  7 / 0  9 % 4");
        while (klavye.hasNext()) {
            double x = klavye.nextDouble();
            String op = klavye.next();
            double y = klavye.nextDouble();
            System.out.print(x + " " + op + " " + y + " = ");
            switch (op) {
                case "+" -> System.out.println(x + y);
                case "-" -> System.out.println(x - y);
                case "*" -> System.out.println(x * y);
                case "/" -> {
                    if (y == 0) System.out.println("Hata!");
                    else System.out.println(x / y);
                }
                default -> System.out.println("Gecersiz");
            }
        }
        klavye.close();
    }
}
