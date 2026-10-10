/*
 * Once metot sozlesmesi, sonra govde: basamakSayisi (Slayt 29, 32-33).
 * Gorev: sayinin onluk basamak sayisini dondurur. Girdi: herhangi bir int.
 * Cikti: 1..10; 0 icin 1, -507 icin 3. long, Integer.MIN_VALUE'nun mutlak degerini tasirmaz.
 * Beklenen cikti: 3, 1, 10
 */
public class BasamakSayisiMetodu {

    static int basamakSayisi(int sayi) {
        long kalan = Math.abs((long) sayi);
        if (kalan == 0) return 1;
        int adet = 0;
        while (kalan > 0) {
            adet++;
            kalan /= 10;
        }
        return adet;
    }

    public static void main(String[] args) {
        System.out.println(basamakSayisi(-507));               // 3
        System.out.println(basamakSayisi(0));                  // 1
        System.out.println(basamakSayisi(Integer.MIN_VALUE));  // 10
    }
}
