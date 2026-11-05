/*
 * Ucgen turu: once ucgen esitsizligi, sonra ic ice kararla tur (Calisma Sorusu 21).
 * Ayni yapida pozitif/negatif/sifir siniflamasi (Soru 12) ve VKI (Soru 36) de var.
 * Beklenen cikti: Ikizkenar; pozitif negatif sifir; VKI 70/1.75^2 = 22.86 -> Normal
 */
public class UcgenTuru {

    public static void main(String[] args) {
        int a = 5, b = 5, c = 8;
        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c)
                System.out.println("Eskenar");
            else if (a == b || b == c || a == c)
                System.out.println("Ikizkenar");
            else
                System.out.println("Cesitkenar");
        } else {
            System.out.println("Ucgen degil");
        }

        // Soru 12: pozitif, negatif, sifir
        int[] girdiler = {7, -3, 0};
        for (int s : girdiler) {
            if (s > 0)
                System.out.println("pozitif");
            else if (s < 0)
                System.out.println("negatif");
            else
                System.out.println("sifir");
        }

        // Soru 36: vucut kitle indeksi
        double kilo = 70, boy = 1.75;
        double vki = kilo / (boy * boy);
        System.out.print("VKI = " + vki + " -> ");
        if (vki < 18.5)
            System.out.println("Zayif");
        else if (vki < 25)
            System.out.println("Normal");
        else
            System.out.println("Fazla kilolu");
    }
}
