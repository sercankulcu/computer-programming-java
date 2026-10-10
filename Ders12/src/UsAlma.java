// Ozyinelemeli us, hizli us (us'u yariya indirme) ve negatif us
// (Slayt: Ozyinelemeli Us, Hizli Us, Tasma ve Uc Durumlar; Calisma Sorulari 8, 9, 10, 11, 12).
// Beklenen cikti: 16, 1024; 32.0, 0.125, 1.0, 0.0625; "0.25 27.0"; us(2, -1) StackOverflowError;
// 3^16 = 43046721: hizliUs 6 cagri, us 17 cagri.
public class UsAlma {

	static int cagriSayisi = 0;

	// n her cagrida 1 azalir: n + 1 cagri
	static long us(long taban, int n) {
		cagriSayisi++;
		if (n == 0) return 1;
		return taban * us(taban, n - 1);
	}

	// us her cagrida yariya iner: yaklasik log2(us) + 2 cagri
	static long hizliUs(long taban, int us) {
		cagriSayisi++;
		if (us == 0) return 1;
		long yarim = hizliUs(taban, us / 2);
		if (us % 2 == 0) return yarim * yarim;
		return yarim * yarim * taban;
	}

	// Soru 8, 9: negatif us icin pozitif usle kendini bir kez cagirir
	static double usHesapla(double taban, int us) {
		double sonuc = 1;
		if (us < 0) {
			sonuc = 1.0 / (usHesapla(taban, -us));
		} else {
			for (int i = 0; i < us; i++)
				sonuc *= taban;
		}
		return sonuc;
	}

	// Soru 11: tamamen ozyinelemeli, negatif usu destekler
	static double usTam(double t, int n) {
		if (n < 0) return 1.0 / usTam(t, -n);
		if (n == 0) return 1;
		return t * usTam(t, n - 1);
	}

	public static void main(String[] args) {
		System.out.println(us(2, 4));          // 16
		System.out.println(hizliUs(2, 10));    // 1024

		System.out.println(usHesapla(2, 5));   // 32.0
		System.out.println(usHesapla(2, -3));  // 0.125
		System.out.println(usHesapla(5, 0));   // 1.0
		System.out.println(usHesapla(4, -2));  // 0.0625 (Soru 9)

		System.out.println(usTam(2, -2) + " " + usTam(3, 3));   // 0.25 27.0

		// Soru 10: negatif usle taban duruma (n == 0) hic ulasilmaz
		try {
			us(2, -1);
		} catch (StackOverflowError e) {
			System.out.println("us(2, -1): StackOverflowError");
		}

		// Soru 12: cagri sayilari
		cagriSayisi = 0;
		long h = hizliUs(3, 16);
		System.out.println(h + " hizliUs cagri: " + cagriSayisi);   // 43046721, 6
		cagriSayisi = 0;
		long d = us(3, 16);
		System.out.println(d + " us cagri: " + cagriSayisi);        // 43046721, 17
	}
}
