/*
 * Sirali islemler: deyimler yukaridan asagiya, birer kez calisir (Slayt 4-5).
 * Calisma Sorusu 7: tam sayi bolmesinde islem sirasi sonucu degistirir.
 * Beklenen cikti: 20.0 ve "10 9"
 */
public class SiraliIslemler {

    public static void main(String[] args) {
        double taban = 8;
        double yukseklik = 5;
        double alan = taban * yukseklik / 2;
        System.out.println(alan);                          // 20.0

        // Soru 7: int ile ayni formul, farkli sira
        int t = 7, yk = 3;
        System.out.println(t * yk / 2 + " " + t / 2 * yk); // 10 9  (21/2=10, 3*3=9)
    }
}
