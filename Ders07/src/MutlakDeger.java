/*
 * Mutlak deger: sayi negatifse isareti degistirilir (Slayt 31-32).
 * Calisma Sorusu 37: Integer.MIN_VALUE'nun pozitif karsiligi int'e sigmaz, -sayi yine
 * kendisidir. Beklenen cikti: 8, sonra -2147483648 ve true
 */
public class MutlakDeger {

    public static void main(String[] args) {
        int sayi = -8;
        if (sayi < 0) {
            sayi = -sayi;
        }
        System.out.println(sayi);        // 8

        // Soru 37: MIN_VALUE tasmasi
        sayi = Integer.MIN_VALUE;
        if (sayi < 0) {
            sayi = -sayi;                // tasma: -(-2147483648) = -2147483648
        }
        System.out.println(sayi);        // -2147483648
        System.out.println(sayi < 0);    // true
    }
}
