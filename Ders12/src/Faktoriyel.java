// Ozyinelemeli ve donguli faktoriyel; taban durum, negatif girdi, cagri/donus sirasi ve long tasmasi
// (Slayt: Ozyinelemeli Faktoriyel, Kod Izleme: faktoriyel(4), Donguli Faktoriyel, Tasma ve Uc Durumlar;
//  Calisma Sorulari 3, 5, 6).
// Beklenen cikti: 24, 24, 120; "g3 g2 g1 d2 d3 6"; 2432902008176640000 ve -4249290049419214848; Soru 3: 120, mesaj, 1.
public class Faktoriyel {

	static long faktoriyel(int n) {
		if (n < 0)
			throw new IllegalArgumentException();
		if (n <= 1) return 1;                 // taban durum
		return n * faktoriyel(n - 1);         // ozyinelemeli adim: problem kuculur
	}

	static long faktoriyelDongu(int n) {
		long sonuc = 1;
		for (int i = 2; i <= n; i++)
			sonuc *= i;
		return sonuc;
	}

	// Soru 6: cagri aninda "g", donuste "d" yazar
	static int f(int n) {
		System.out.print("g" + n + " ");
		if (n <= 1) return 1;
		int r = n * f(n - 1);
		System.out.print("d" + n + " ");
		return r;
	}

	// Soru 3: negatif kontrolu mesaj yazar ama metottan cikmaz; dongu hic donmez ve 1 doner
	static long faktoriyelSoru3(int sayi) {
		if (sayi < 0) {
			System.out.println("Sayi negatif olamaz.");
		}
		long sonuc = 1;
		for (int i = 1; i <= sayi; i++) {
			sonuc *= i;
		}
		return sonuc;
	}

	public static void main(String[] args) {
		System.out.println(faktoriyel(4));        // 24
		System.out.println(faktoriyelDongu(4));   // 24
		System.out.println(faktoriyel(5));        // 120 (Soru 5)

		System.out.println(f(3));                 // g3 g2 g1 d2 d3 6

		// long tasmasi: hata firlatilmaz, deger sessizce sarar
		System.out.println(faktoriyel(20));       // 2432902008176640000
		System.out.println(faktoriyel(21));       // -4249290049419214848

		try {
			faktoriyel(-1);
		} catch (IllegalArgumentException e) {
			System.out.println("faktoriyel(-1): IllegalArgumentException");
		}

		System.out.println(faktoriyelSoru3(5));   // 120
		System.out.println(faktoriyelSoru3(-3));  // Sayi negatif olamaz. / 1
	}
}
