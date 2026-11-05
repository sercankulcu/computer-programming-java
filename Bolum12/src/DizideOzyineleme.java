// Dizi ve dizgi uzerinde ozyineleme: indis parametresiyle dizi toplami, karakter sayma
// (Calisma Sorulari 17, 31; Alistirmalar).
// Beklenen cikti: 13; "banana" icinde 'a' sayisi 3; en buyuk oge 9.
public class DizideOzyineleme {

	// Soru 17: toplam(a, i) = a[i] + toplam(a, i + 1); taban durum i == a.length
	static int toplam(int[] a, int i) {
		if (i == a.length) return 0;
		return a[i] + toplam(a, i + 1);
	}

	// Soru 31: ilk karaktere bak, kalan dizgiyle devam et
	static int say(String s, char c) {
		if (s.length() == 0) return 0;
		int ilk = (s.charAt(0) == c) ? 1 : 0;
		return ilk + say(s.substring(1), c);
	}

	// Ek ornek: dizideki en buyuk oge
	static int enBuyuk(int[] a, int i) {
		if (i == a.length - 1) return a[i];
		int kalan = enBuyuk(a, i + 1);
		return Math.max(a[i], kalan);
	}

	public static void main(String[] args) {
		int[] d = {4, 7, 2};
		System.out.println(toplam(d, 0));              // 13
		System.out.println(say("banana", 'a'));        // 3
		System.out.println(enBuyuk(new int[]{3, 9, 1, 5}, 0));   // 9
	}
}
