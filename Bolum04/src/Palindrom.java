/*
 * Palindrom algoritmasi (Algoritmalar: "Ornek: Palindrom", Calisma Sorulari 11 ve 12).
 * Metin kucuk harfe cevrilip bosluklari atilir, iki uctan merkeze karsilastirilir.
 * "Kayak" -> true (2 karsilastirma); "Kayik" -> false (2 karsilastirma); 11 harfli palindrom -> 5.
 * Not: slayttaki "Kayik" orneginde Turkce i harfi var; burada Turkce karaktersiz yazildi, sonuc ayni.
 */
public class Palindrom {

    static int karsilastirma;   // yapilan karakter karsilastirmasi sayisi

    static boolean palindromMu(String metin) {
        // kural: kucuk harfe cevir, bosluklari at
        metin = metin.toLowerCase().replace(" ", "");
        int sol = 0, sag = metin.length() - 1;
        while (sol < sag) {
            karsilastirma++;
            if (metin.charAt(sol) != metin.charAt(sag))
                return false;   // ilk farkli ciftte durur
            sol = sol + 1;
            sag = sag - 1;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] metinler = {"Kayak", "Kayik", "abcdefedcba", "Ey Edip Adanada pide ye"};
        for (String m : metinler) {
            karsilastirma = 0;
            boolean sonuc = palindromMu(m);
            System.out.println("\"" + m + "\" -> " + sonuc + " (" + karsilastirma + " karsilastirma)");
        }
    }
}
