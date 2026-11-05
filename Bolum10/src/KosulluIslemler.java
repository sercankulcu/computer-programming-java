// Kosula gore oge secme ve degistirme, indisle okuma/yazma izleme sorulari
// (Calisma Sorulari 6, 7, 12-15, 21, 22, 23).
// Beklenen cikti: "160 89", "230"; "[0, 3, 1, 3]"; "12 20 12 14 16"; "12 21 12"; "8"; "3 9"; 25 29 21;
// "40 45 32 12 20 19 24 5 9 13"; "60 30 48 18 30 19 36 5 6 13".
import java.util.Arrays;

public class KosulluIslemler {

	// Soru 21: 20 ile 30 arasindakiler (sinirlar haric)
	static void yazdir(int[] dizi) {
		for (int i = 0; i < dizi.length; i++) {
			if (dizi[i] > 20 && dizi[i] < 30) {
				System.out.println(dizi[i]);
			}
		}
	}

	public static void main(String[] args) {
		// Soru 6: okuma ve yazma
		int[] p = {70, 85, 90};
		p[1] = p[0] + p[2];
		p[2]--;
		int son = p[p.length - 1];
		System.out.println(p[1] + " " + son);      // 160 89
		System.out.println(p[0] + p[1]);           // 230

		// Soru 7: dizi[i] = dizi[dizi[i]]; sonraki adimlar guncellenmis degerleri okur
		int[] dizi = {0, 2, 3, 1};
		for (int i = 0; i < dizi.length; i++) {
			dizi[i] = dizi[dizi[i]];
		}
		System.out.println(Arrays.toString(dizi)); // [0, 3, 1, 3]

		// Soru 12-15: && ile iki kosul
		int[] sayilar = {12, 7, 3, 21, 1, 5, 8, 9, 20, 13, 12, 14, 16};
		for (int i = 0; i < sayilar.length; i++)
			if (sayilar[i] > 10 && sayilar[i] % 2 == 0) System.out.print(sayilar[i] + " ");
		System.out.println();                      // 12 20 12 14 16
		for (int i = 0; i < sayilar.length; i++)
			if (sayilar[i] > 10 && sayilar[i] % 3 == 0) System.out.print(sayilar[i] + " ");
		System.out.println();                      // 12 21 12
		for (int i = 0; i < sayilar.length; i++)
			if (sayilar[i] < 10 && sayilar[i] % 2 == 0) System.out.print(sayilar[i] + " ");
		System.out.println();                      // 8
		for (int i = 0; i < sayilar.length; i++)
			if (sayilar[i] < 10 && sayilar[i] % 3 == 0) System.out.print(sayilar[i] + " ");
		System.out.println();                      // 3 9

		yazdir(new int[]{20, 25, 31, 29, 30, 21}); // 25 29 21 (alt alta)

		// Soru 22: once % 2 kontrol edilir; 6 ve 12 cift oldugu icin *2 alir
		int[] d1 = {20, 15, 16, 6, 10, 19, 12, 5, 3, 13};
		for (int i = 0; i < d1.length; i++) {
			if (d1[i] % 2 == 0) {
				d1[i] *= 2;
			}
			else if (d1[i] % 3 == 0) {
				d1[i] *= 3;
			}
		}
		for (int i = 0; i < d1.length; i++)
			System.out.print(d1[i] + " ");
		System.out.println();

		// Soru 23: dallarin yeri degisince
		int[] d2 = {20, 15, 16, 6, 10, 19, 12, 5, 3, 13};
		for (int i = 0; i < d2.length; i++) {
			if (d2[i] % 2 == 0) {
				d2[i] *= 3;
			}
			else if (d2[i] % 3 == 0) {
				d2[i] *= 2;
			}
		}
		for (int i = 0; i < d2.length; i++)
			System.out.print(d2[i] + " ");
		System.out.println();
	}
}
