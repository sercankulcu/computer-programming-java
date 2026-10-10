/*
 * Asal sayi algoritmasi, karekok siniri ile (Algoritmalar: "Ornek: Asal Sayi",
 * Calisma Sorulari 13, 14 ve 15). 29 -> asal (4 bolen denenir), 21 ve 91 -> asal degil
 * (91 icin 6 kez % yapilir). i * i < n hatasi 49'u asal sanar. sonrakiAsal(24) -> 29, oncekiAsal(100) -> 97.
 */
public class AsalSayi {

    static int modSayisi;   // yapilan % islemi sayisi

    static boolean asal(int n) {
        if (n < 2) return false;
        int i = 2;
        while (i * i <= n) {
            modSayisi++;
            if (n % i == 0) return false;   // bir bolen bulununca arama durur
            i = i + 1;
        }
        return true;
    }

    // Soru 14: kosul yanlislikla i * i < n yazilirsa
    static boolean hataliAsal(int n) {
        if (n < 2) return false;
        int i = 2;
        while (i * i < n) {
            if (n % i == 0) return false;
            i = i + 1;
        }
        return true;
    }

    // Soru 15: artirma kontrolden once (++sayi); sayinin kendisi denenmez
    static int sonrakiAsal(int sayi) {
        while (true) {
            sayi = sayi + 1;
            if (asal(sayi)) {
                System.out.println(sayi + " asal sayidir");
                return sayi;
            } else {
                System.out.println(sayi + " asal sayi degildir");
            }
        }
    }

    static int oncekiAsal(int sayi) {
        do {
            sayi = sayi - 1;
        } while (!asal(sayi));
        return sayi;
    }

    public static void main(String[] args) {
        int[] girdiler = {29, 21, 91, 1, 2};
        for (int n : girdiler) {
            modSayisi = 0;
            System.out.println(n + ": " + (asal(n) ? "asal" : "asal degil") + " (" + modSayisi + " kez %)");
        }

        System.out.println("i * i < n hatasiyla 49: " + (hataliAsal(49) ? "asal" : "asal degil")
                + " (dogrusu: " + (asal(49) ? "asal" : "asal degil") + ")");

        sonrakiAsal(24);
        System.out.println("oncekiAsal(100) = " + oncekiAsal(100));
    }
}
