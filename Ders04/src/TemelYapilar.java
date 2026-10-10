/*
 * Temel programlama yapilari: dongu, dizi ve fonksiyon (Programlamaya Giris Calisma Sorulari
 * 17, 22, 23, 25, 26). Beklenen: 9 (tek sayilar 1+3+5), 10, "7 4 1 -2 bitti",
 * dizi: 15 / 27 / 5, kare(3) + kare(4) = 25.
 */
public class TemelYapilar {

    // fonksiyon kare(x): dondur x * x
    static int kare(int x) {
        return x * x;
    }

    public static void main(String[] args) {
        // Soru 17: s = 0, i = 1; i <= 5 iken s = s + i, i = i + 2
        int s = 0, i = 1;
        while (i <= 5) {
            s = s + i;
            i = i + 2;
        }
        System.out.println(s);   // 9

        // Soru 22: tekrarli toplama
        int toplam = 0;
        i = 1;
        while (i <= 4) {
            toplam = toplam + i;
            i = i + 1;
        }
        System.out.println(toplam);   // 10

        // Soru 23: kosul tur basinda denetlenir; -2 de yazilir
        int sayac = 10;
        while (sayac > 0) {
            sayac = sayac - 3;
            System.out.print(sayac + " ");
        }
        System.out.println("bitti");

        // Soru 25: indisler 0'dan baslar
        int[] dizi = {4, 8, 15, 16, 23};
        System.out.println(dizi[2]);             // 15
        System.out.println(dizi[0] + dizi[4]);   // 27
        System.out.println(dizi.length);         // 5

        // Soru 26: fonksiyon iki kez cagrilir
        int a = kare(3);
        int b = kare(4);
        System.out.println(a + b);   // 25
    }
}
