/*
 * Kosullu dizi guncelleme (Algoritmalar Calisma Sorulari 30).
 * Ciftler x2, tek ve 3'e bolunenler x3; "else if" yuzunden yalnizca ilk dogru dal calisir.
 * Beklenen: 40 45 32 12 20 19 24 5 9 13; carpanlar yer degistirirse 60 30 48 18 30 19 36 5 6 13.
 */
public class KosulluDiziGuncelleme {

    static void yaz(int[] dizi) {
        for (int i = 0; i < dizi.length; i++) System.out.print(dizi[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] dizi = {20, 15, 16, 6, 10, 19, 12, 5, 3, 13};
        for (int i = 0; i <= 9; i++) {
            if (dizi[i] % 2 == 0)
                dizi[i] = dizi[i] * 2;
            else if (dizi[i] % 3 == 0)
                dizi[i] = dizi[i] * 3;
        }
        yaz(dizi);

        // Carpanlar yer degistirirse: ciftler x3, tek ve 3'e bolunenler x2
        int[] dizi2 = {20, 15, 16, 6, 10, 19, 12, 5, 3, 13};
        for (int i = 0; i <= 9; i++) {
            if (dizi2[i] % 2 == 0)
                dizi2[i] = dizi2[i] * 3;
            else if (dizi2[i] % 3 == 0)
                dizi2[i] = dizi2[i] * 2;
        }
        yaz(dizi2);
    }
}
