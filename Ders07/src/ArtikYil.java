/*
 * Artik yil: 4'e bolunup 100'e bolunmeyen ya da 400'e bolunen yillar (Slayt 33).
 * Girdiler sabit dizgiden okunur.
 * Beklenen cikti: 2024 artik, 1900 normal, 2000 artik, 2023 normal
 */
import java.util.Scanner;

public class ArtikYil {

    public static void main(String[] args) {
        Scanner klavye = new Scanner("2024 1900 2000 2023");   // new Scanner(System.in) yerine
        while (klavye.hasNextInt()) {
            int yil = klavye.nextInt();
            boolean artik =
                (yil % 4 == 0 && yil % 100 != 0)
                || yil % 400 == 0;
            if (artik)
                System.out.println(yil + " artik yil");
            else
                System.out.println(yil + " normal yil");
        }
        klavye.close();
    }
}
