/*
 * Degisken tanimlama, ilk deger, guncelleme ve sabit (Degiskenler: "Tanimlama ve Ilk Deger",
 * "Degiskenler Bellekte Adim Adim", "Ilkel Veri Tipleri"; Calisma Sorulari 1-4).
 * Beklenen: 21 ve 87.5; ardindan ilkel tip ornekleri. Derlenmeyen satirlar yorum olarak gosterilir.
 */
public class DegiskenlerBellekte {
    public static void main(String[] args) {
        int yas;                  // tanimlama
        yas = 20;                 // ilk atama
        yas = yas + 1;            // guncelleme
        double ortalama = 82.5;   // tanimlama + atama
        ortalama += 5;            // bilesik atama
        final int MAKSIMUM = 100; // sabit
        // MAKSIMUM = 200;        // derleme hatasi: final degiskene yeniden atama
        System.out.println(yas);
        System.out.println(ortalama);

        // Ilkel tipler
        byte seviye = 7;
        int adet = 42;
        long nufus = 8_000_000_000L;   // L soneki sart (Soru 2)
        float oran = 1.5F;             // float oran = 1.5; derlenmez (Soru 4)
        double fiyat = 19.90;
        char not = 'A';
        boolean gecti = true;
        System.out.println(seviye + " " + adet + " " + nufus + " " + oran + " " + fiyat
                + " " + not + " " + gecti + " " + MAKSIMUM);

        // Soru 3: genisletmeler otomatik, daraltma derlenmez
        long l = 5;
        double d = 'A';
        float f = 10;
        // int x = 5L;   // derlenmez: possible lossy conversion from long to int
        System.out.println(l + " " + d + " " + f);

        // Soru 1: tanimlayici kurallari
        int toplamPuan = 1, _deger = 2, $tutar = 3;
        // int 2sayi = 4;   // derlenmez: rakamla baslayamaz
        System.out.println(toplamPuan + _deger + $tutar);
    }
}
