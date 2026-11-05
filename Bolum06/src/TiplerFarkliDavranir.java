/*
 * Tipler farkli davranir: + toplama mi birlestirme mi? (Degiskenler: "\"Sonuc: \" + 2 + 3 Adim Adim";
 * Calisma Sorulari 31, 32). Beklenen: 5, 23, Sonuc: 23, Sonuc: 5; 1234; 2314, 323, 2312, 233, 232.
 * Not: slaytta "Sonuc" Turkce u harfiyle yazilir.
 */
public class TiplerFarkliDavranir {
    public static void main(String[] args) {
        System.out.println(2 + 3);                 // 5
        System.out.println("2" + "3");             // 23
        System.out.println("Sonuc: " + 2 + 3);     // Sonuc: 23
        System.out.println("Sonuc: " + (2 + 3));   // Sonuc: 5

        // Soru 31
        String sayi1 = "12";
        String sayi2 = "34";
        String toplam = sayi1 + sayi2;
        System.out.println(toplam);

        // Soru 32
        String s1 = "23";
        String s2 = "14";
        System.out.println(s1 + s2);
        System.out.println(1 + 2 + s1);
        System.out.println(s1 + 1 + 2);
        System.out.println(s1 + (1 + 2));
        System.out.println(s1 + 1 * 2);
    }
}
