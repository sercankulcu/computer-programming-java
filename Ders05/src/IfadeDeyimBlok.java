/*
 * Ifade, deyim ve blok (Java'ya Giris: "Ifade, Deyim ve Blok Adim Adim").
 * fiyat * adet = 360 > 300 oldugu icin blok calisir. Beklenen: "Indirim";
 * adet = 2 olsaydi toplam 240 olur ve blok atlanirdi.
 */
public class IfadeDeyimBlok {
    public static void main(String[] args) {
        int fiyat = 120;           // tanimlama deyimi
        int adet = 3;              // tanimlama deyimi
        int toplam = fiyat * adet; // ifade + atama
        if (toplam > 300) {        // kosul + blok
            System.out.println("Indirim");
        }

        adet = 2;
        toplam = fiyat * adet;     // 240
        if (toplam > 300) {
            System.out.println("Indirim");
        }
        System.out.println("adet = 2 icin toplam = " + toplam + " (blok atlandi)");
    }
}
