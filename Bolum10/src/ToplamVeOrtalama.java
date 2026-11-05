// Toplam, ortalama ve ortalamanin ustundekileri sayma
// (Slayt: Toplam ve Ortalama, Ortalamanin Ustundekileri Sayma; Calisma Sorulari 18, 19).
// Beklenen cikti: "19 4.75", "70.0 3", hatali ortalama 4.0; dogru ortalama 4.75, 5.5, NaN.
public class ToplamVeOrtalama {

	// Soru 18: toplam / dizi.length tam sayi bolmesidir; ondalik kisim kaybolur
	static double ortalamaHesaplaHatali(int[] dizi) {
		int toplam = 0;
		for (int i = 0; i < dizi.length; i++)
			toplam += dizi[i];
		double ortalama = toplam / dizi.length;  // HATALI: once int bolme, sonra double'a donusum
		return ortalama;
	}

	// Soru 19: (double) donusumu ile dogru ortalama; bos dizide 0.0 / 0 -> NaN
	static double ortalamaHesapla(int[] dizi) {
		int toplam = 0;
		for (int i = 0; i < dizi.length; i++)
			toplam += dizi[i];
		return (double) toplam / dizi.length;
	}

	public static void main(String[] args) {
		// Toplam ve ortalama (bos dizi kontrolu ile)
		int[] sayilar = {4, 7, 2, 6};
		int toplam = 0;
		for (int deger : sayilar) toplam += deger;
		double ortalama = 0;
		if (sayilar.length > 0)
			ortalama = (double) toplam / sayilar.length;
		System.out.println(toplam + " " + ortalama);   // 19 4.75

		// Ortalamanin ustundekileri sayma
		int[] notlar = {60, 75, 90, 45, 80};
		int toplam2 = 0;
		for (int x : notlar) toplam2 += x;
		double ort = (double) toplam2 / notlar.length;
		int ustte = 0;
		for (int x : notlar)
			if (x > ort) ustte++;
		System.out.println(ort + " " + ustte);          // 70.0 3

		System.out.println(ortalamaHesaplaHatali(new int[]{4, 7, 2, 6}));  // 4.0 (yanlis)
		System.out.println(ortalamaHesapla(new int[]{4, 7, 2, 6}));        // 4.75
		System.out.println(ortalamaHesapla(new int[]{5, 6}));              // 5.5
		System.out.println(ortalamaHesapla(new int[0]));                   // NaN
	}
}
