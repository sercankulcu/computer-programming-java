/*
 * Armstrong sayisi (3 basamak): rakamlarin kupleri toplami sayiya esit mi? (Slayt 28)
 * Ek olarak 100..999 arasindaki tum Armstrong sayilari ic ice dongu olmadan taranir.
 * Beklenen cikti: true, sonra "153 370 371 407"
 */
public class ArmstrongSayisi {

    public static void main(String[] args) {
        int sayi = 153;
        int kalan = sayi, toplam = 0;
        while (kalan > 0) {
            int r = kalan % 10;
            toplam += r * r * r;   // 3 basamak: kup
            kalan /= 10;
        }
        System.out.println(toplam == sayi);   // true

        for (int s = 100; s <= 999; s++) {
            int k = s, t = 0;
            while (k > 0) {
                int r = k % 10;
                t += r * r * r;
                k /= 10;
            }
            if (t == s) System.out.print(s + " ");
        }
        System.out.println();
    }
}
