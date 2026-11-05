/*
 * Iki sayiyi sirala (Algoritmalar: "Ornek: Iki Sayiyi Sirala", Calisma Sorulari 3 ve 4).
 * gecici degiskenle takas: a = 7, b = 3 -> 3 7; a = 2, b = 9 -> takas yok, 2 9.
 * Gecicisiz hatali takas 3 3 verir; uc sayi (9, 2, 5) a-b, b-c, a-b adimlariyla 2 5 9 olur.
 */
public class IkiSayiyiSirala {

    // oku a, b / eger a > b ise gecici ile takas / yaz a, b
    static void sirala(int a, int b) {
        if (a > b) {
            int gecici = a;   // a'nin eski degeri kaybolmasin
            a = b;
            b = gecici;
        }
        System.out.println(a + " " + b);
    }

    // Soru 3: gecici degisken kullanilmazsa ilk atama a'nin eski degerini siler
    static void geciciOlmadan(int a, int b) {
        if (a > b) {
            a = b;
            b = a;
        }
        System.out.println(a + " " + b);
    }

    // Soru 4 / Alistirma: iki sayiyi siralama adimi uc kez uygulanir (a-b, b-c, a-b)
    static void ucSayiyiSirala(int a, int b, int c) {
        int gecici;
        if (a > b) { gecici = a; a = b; b = gecici; }
        if (b > c) { gecici = b; b = c; c = gecici; }
        if (a > b) { gecici = a; a = b; b = gecici; }
        System.out.println(a + " " + b + " " + c);
    }

    public static void main(String[] args) {
        sirala(7, 3);            // 3 7
        sirala(2, 9);            // 2 9 (kosul yanlis, takas atlanir)
        sirala(5, 5);            // 5 5 (esit degerlerde degisim gerekmez)
        geciciOlmadan(7, 3);     // 3 3 (hatali)
        ucSayiyiSirala(9, 2, 5); // 2 5 9
    }
}
