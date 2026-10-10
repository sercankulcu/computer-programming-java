// Klasik for ve gelismis for (for-each) ile dizide gezinme
// (Slayt: Klasik for ile Gezinme, Gelismis for; Calisma Sorulari 3, 4, 10, 11).
// Beklenen cikti: "0: 70" ... satirlari; for-each 75 93 95 ve puanlar[0] = 70;
// "20 16"; "2.4.5.7.8."; "2 4 6 8"; "[3, 5, 7]"; "18 12 6".
import java.util.Arrays;

public class DiziGezinme {

	public static void main(String[] args) {
		int[] puanlar = {70, 88, 90};

		// Klasik for: indis gerektiginde
		for (int i = 0; i < puanlar.length; i++) {
			System.out.printf("%d: %d%n", i, puanlar[i]);
		}

		// Gelismis for: puan ogenin kopyasidir; atama diziyi degistirmez
		for (int puan : puanlar) {
			puan = puan + 5;
			System.out.println(puan);
		}
		System.out.println(puanlar[0]);             // 70 (degismedi)

		// Soru 3: i = 1'den baslayan dongu ilk ogeyi atlar
		int[] sayilar = {12, 20, 16};
		for (int i = 1; i < sayilar.length; i++) {
			System.out.print(sayilar[i] + " ");     // 20 16
		}
		System.out.println();

		// Soru 4: ogeleri ayiriciyla yazdirma
		int[] a = {2, 4, 5, 7, 8};
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ".");
		}
		System.out.println();                       // 2.4.5.7.8.
		int[] b = {2, 4, 6, 8};
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println();                       // 2 4 6 8

		// Soru 10: gelismis for ile atama diziyi degistirmez
		int[] c = {3, 5, 7};
		for (int x : c) {
			x = x * 2;
		}
		System.out.println(Arrays.toString(c));     // [3, 5, 7]

		// Soru 11: tersten ve ikiser atlayarak
		int[] d = {3, 6, 9, 12, 15, 18};
		for (int i = d.length - 1; i >= 0; i -= 2) {
			System.out.print(d[i] + " ");           // 18 12 6
		}
		System.out.println();
	}
}
