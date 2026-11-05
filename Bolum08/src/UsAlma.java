/*
 * Us alma: carpim biriktiricisi 1'den baslar, us kadar taban ile carpilir (Slayt 31-32).
 * Beklenen cikti: 16 (2^4); Math.pow ile 16.0
 */
public class UsAlma {

    public static void main(String[] args) {
        int taban = 2, us = 4;
        int sonuc = 1;
        for (int i = 0; i < us; i++) {
            sonuc *= taban;
        }
        System.out.println(sonuc);                    // 16
        System.out.println(Math.pow(taban, us));      // 16.0 (double doner)
    }
}
