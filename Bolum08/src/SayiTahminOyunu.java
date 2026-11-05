/*
 * Sayi tahmin oyunu: hedef bulunana kadar while dongusu (Slayt 39).
 * Sabit tohum new Random(42) ile hedef 31 olur; tahminler klavye yerine dizgiden okunur.
 * Beklenen cikti: 50 Asagi, 25 Yukari, 37 Asagi, 31 -> "4. denemede bildin"
 */
import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {

    public static void main(String[] args) {
        Random rnd = new Random(42);                   // slaytta: new Random()
        Scanner klavye = new Scanner("50 25 37 31");   // slaytta: new Scanner(System.in)
        int hedef = rnd.nextInt(100) + 1;  // 1..100
        int tahmin = 0, deneme = 0;
        while (tahmin != hedef) {
            tahmin = klavye.nextInt();
            deneme++;
            System.out.print("Tahmin " + tahmin + ": ");
            if (tahmin < hedef) System.out.println("Yukari");
            if (tahmin > hedef) System.out.println("Asagi");
        }
        System.out.println("Dogru!");
        System.out.println(deneme + ". denemede bildin");
        klavye.close();
    }
}
