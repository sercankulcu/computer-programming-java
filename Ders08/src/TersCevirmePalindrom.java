/*
 * Sayiyi ters cevirme ve palindrom denetimi: ters = ters * 10 + rakam (Slayt 27).
 * Beklenen cikti: 1221 ve true; 1234 icin 4321 ve false
 */
public class TersCevirmePalindrom {

    public static void main(String[] args) {
        int[] denemeler = {1221, 1234};
        for (int sayi : denemeler) {
            int kalan = sayi, ters = 0;
            while (kalan > 0) {
                int rakam = kalan % 10;
                ters = ters * 10 + rakam;
                kalan /= 10;
            }
            System.out.println(ters);
            System.out.println(ters == sayi);  // palindrom mu?
        }
    }
}
