// Rakamlar toplami, basamak sayisi ve yazdirmanin cagridan once/sonra olmasi
// (Slayt: Rakamlar Toplami: rakamToplami(472); Calisma Sorulari 13, 14, 15, 16).
// Beklenen cikti: 13, 13 (negatif), 17; "6", "1 3"; basamakSayisi(0) = 0 (hata) ; "274 472".
public class RakamIslemleri {

	// Slayttaki surum: negatif sayilar icin once mutlak deger (long ile tasmasiz)
	static int rakamToplami(int n) {
		long m = Math.abs((long) n);
		return rakamToplamiPozitif(m);
	}

	static int rakamToplamiPozitif(long n) {
		if (n < 10) return (int) n;
		return (int) (n % 10)
				+ rakamToplamiPozitif(n / 10);
	}

	// Soru 13: yalnizca negatif olmayan sayilar icin basit surum
	static int rakamToplamiBasit(int n) {
		if (n < 10) return n;
		return n % 10 + rakamToplamiBasit(n / 10);
	}

	// Soru 14: ozyinelemeli basamak sayisi
	static int basamak(int n) {
		n = Math.abs(n);
		if (n < 10) return 1;
		return 1 + basamak(n / 10);
	}

	// Soru 15: while surumu 0 icin hic donmez ve 0 dondurur (0 aslinda bir basamaklidir)
	static int basamakSayisi(int sayi) {
		int sayac = 0;
		sayi = Math.abs(sayi);
		while (sayi > 0) {
			sayi /= 10;
			sayac++;
		}
		return sayac;
	}

	// Soru 16: once yazdir sonra cagir -> rakamlar ters sirada
	static void yazA(int n) {
		if (n == 0) return;
		System.out.print(n % 10);
		yazA(n / 10);
	}

	// Once cagir sonra yazdir -> rakamlar dogru sirada
	static void yazB(int n) {
		if (n == 0) return;
		yazB(n / 10);
		System.out.print(n % 10);
	}

	public static void main(String[] args) {
		System.out.println(rakamToplami(472));        // 13
		System.out.println(rakamToplami(-472));       // 13
		System.out.println(rakamToplamiBasit(908));   // 17

		System.out.println(basamak(123456));                       // 6
		System.out.println(basamak(0) + " " + basamak(-470));      // 1 3
		System.out.println(basamakSayisi(0) + " " + basamakSayisi(-470));   // 0 3

		yazA(472);
		System.out.print(" ");
		yazB(472);
		System.out.println();                         // 274 472
	}
}
