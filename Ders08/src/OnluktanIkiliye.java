/*
 * Onluktan ikiliye cevirme: kalanlar (n % 2) basamak degeriyle (1, 10, 100...) toplanir (Slayt 30).
 * Sonuc ikilik rakamlari gosteren bir onluk sayidir; Integer.toBinaryString ile karsilastirilir.
 * Beklenen cikti: 1101 (13 icin)
 */
public class OnluktanIkiliye {

    public static void main(String[] args) {
        int n = 13;
        int ikili = 0, basamak = 1;
        while (n > 0) {
            ikili += (n % 2) * basamak;
            basamak *= 10;
            n /= 2;
        }
        System.out.println(ikili);   // 1101
        System.out.println("Integer.toBinaryString(13) = " + Integer.toBinaryString(13));
    }
}
