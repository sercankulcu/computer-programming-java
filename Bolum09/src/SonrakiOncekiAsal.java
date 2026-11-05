/*
 * Metotlarin birlikte kullanimi: sonrakiAsal ve oncekiAsal, asalMi'yi cagirir
 * (Calisma Sorulari 24-26). Iki soruda asalMi farkli yazildigi icin burada ikisi ayri adlandirildi.
 * Beklenen cikti: "14 asal degil", "15 asal degil", "16 asal degil", "17 asal";
 *                 oncekiAsal: 97, 19, 2, -1
 */
public class SonrakiOncekiAsal {

    // Soru 24'teki surum: sayi <= 1 denetimi yok (0 ve 1 icin yanlis "asal" der)
    static boolean asalMi(int sayi) {
        for (int i = 2; i < sayi; i++)
            if (sayi % i == 0) return false;
        return true;
    }

    // Soru 25'teki surum: sayi <= 1 icin false
    static boolean asalMi2(int sayi) {
        if (sayi <= 1) return false;
        for (int i = 2; i < sayi; i++)
            if (sayi % i == 0) return false;
        return true;
    }

    // ++sayi: once arttirilir, sonra denetlenir; 13'un kendisi denetlenmez
    static void sonrakiAsal(int sayi) {
        while (true) {
            if (asalMi(++sayi) == true) {
                System.out.println(sayi + " asal");
                break;
            } else {
                System.out.println(sayi + " asal degil");
            }
        }
    }

    static int oncekiAsal(int sayi) {
        int oncekiSayi = sayi - 1;
        while (oncekiSayi > 1) {
            if (asalMi2(oncekiSayi)) return oncekiSayi;
            oncekiSayi--;
        }
        return -1;                 // daha kucuk asal yok
    }

    public static void main(String[] args) {
        sonrakiAsal(13);

        System.out.println(oncekiAsal(100));   // 97
        System.out.println(oncekiAsal(20));    // 19
        System.out.println(oncekiAsal(3));     // 2
        System.out.println(oncekiAsal(2));     // -1
    }
}
