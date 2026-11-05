// En kucuk, en buyuk ve en buyuk ikinci ogeyi bulma
// (Slayt: En Kucuk ve En Buyuk, Dizideki En Buyuk Ikinci Oge; Calisma Sorulari 16, 17).
// Beklenen cikti: "1 9", "9", "1"; negatif dizide hatali baslangic 0 verir, dogrusu -3.
public class EnKucukEnBuyuk {

	// Soru 16: ilk ogeyle baslayip kalanlari karsilastirma
	static int bulMinimum(int[] dizi) {
		int minimum = dizi[0];
		for (int i = 1; i < dizi.length; i++) {
			if (dizi[i] < minimum) {
				minimum = dizi[i];
			}
		}
		return minimum;
	}

	// Soru 17: enBuyuk = 0 ile baslamak tum ogeler negatifse yanlis sonuc verir
	static int enBuyukEleman(int[] dizi) {
		int enBuyuk = 0;   // dizi[0] yerine (HATALI baslangic)
		for (int i = 0; i < dizi.length; i++)
			if (dizi[i] > enBuyuk)
				enBuyuk = dizi[i];
		return enBuyuk;
	}

	public static void main(String[] args) {
		int[] sayilar = {5, 3, 9, 1};
		int min = sayilar[0], max = sayilar[0];
		for (int deger : sayilar) {
			if (deger < min) min = deger;
			if (deger > max) max = deger;
		}
		System.out.println(min + " " + max);           // 1 9

		// En buyuk ikinci (tekrar eden en buyuk 12 atlanir)
		int[] a = {7, 12, 5, 12, 9};
		int enBuyuk = Integer.MIN_VALUE;
		int ikinci = Integer.MIN_VALUE;
		for (int x : a) {
			if (x > enBuyuk) {
				ikinci = enBuyuk;
				enBuyuk = x;
			} else if (x > ikinci && x != enBuyuk) {
				ikinci = x;
			}
		}
		System.out.println(ikinci);                     // 9

		System.out.println(bulMinimum(new int[]{7, 3, 9, 1, 4}));     // 1

		int[] negatifler = {-8, -3, -5};
		System.out.println(enBuyukEleman(negatifler));  // 0 (dizide yok!)
		int dogru = negatifler[0];                      // dogrusu: ilk ogeyle basla
		for (int x : negatifler) if (x > dogru) dogru = x;
		System.out.println(dogru);                      // -3
	}
}
