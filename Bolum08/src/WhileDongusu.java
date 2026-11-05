/*
 * while dongusu: kosul her turun basinda denetlenir (Slayt 8-9, Calisma Sorulari 9-12).
 * Carpim biriktiricisi 1 ile baslar.
 * Beklenen cikti: 120, "2345", "012", "6 30 120 360", "7 42 210 840"
 */
public class WhileDongusu {

    public static void main(String[] args) {
        int sayi = 5;
        int faktoriyel = 1;
        while (sayi > 1) {
            faktoriyel *= sayi;
            sayi--;
        }
        System.out.println(faktoriyel);          // 120

        // Soru 9
        int i = 2;
        while (i <= 5) {
            System.out.print(i);
            i++;
        }
        System.out.println();                    // 2345

        // Soru 10
        i = 0;
        while (i < 3) {
            System.out.print(i);
            i++;
        }
        System.out.println();                    // 012

        // Soru 11: while (sayi > 2)
        int sonuc = 1;
        sayi = 6;
        while (sayi > 2) {
            sonuc *= sayi;
            sayi--;
            System.out.print(sonuc + " ");
        }
        System.out.println();                    // 6 30 120 360

        // Soru 12: while (sayi > 3)
        sonuc = 1;
        sayi = 7;
        while (sayi > 3) {
            sonuc *= sayi;
            sayi--;
            System.out.print(sonuc + " ");
        }
        System.out.println();                    // 7 42 210 840
    }
}
