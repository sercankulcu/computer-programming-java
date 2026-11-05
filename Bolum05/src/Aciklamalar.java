// Hangi satirlar calisir? Aciklamalar (Java'ya Giris Calisma Sorulari 23 ve 24).
// Tirnak icindeki // ve /* */ aciklama degil, metnin parcasidir.
// Beklenen: "2", "6 // degil", "7 /* yorum degil */".
// (Bu baslik // ile yazildi: /* */ aciklamasi icinde */ gecerse aciklama erken biter.)
public class Aciklamalar {
    public static void main(String[] args) {
        // System.out.println("1");
        System.out.println("2"); // System.out.println("3");
        /* System.out.println("4");
        System.out.println("5"); */
        System.out.println("6 // degil");
        System.out.println("7 /* yorum degil */");

        // Soru 24: /* */ aciklamalari ic ice olamaz; asagidaki satir derleme hatasi verir
        // (aciklama ilk */'da biter, kalan "kalan */" kod sanilir):
        //     /* dis /* ic */ kalan */
    }
}
