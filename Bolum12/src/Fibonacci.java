// Dogrudan ozyinelemeli Fibonacci ve cagri sayisi; donguli surumle karsilastirma
// (Slayt: Fibonacci Sorunu, Kod Izleme: fib(4), Tasma ve Uc Durumlar; Calisma Sorulari 19, 21, 22).
// Beklenen cikti: 3; "0 1 1 2 3 5 8 13"; 2; fib(5) = 5 ve 15 cagri; n = 10, 20, 30 icin 177, 21891, 2692537 cagri.
public class Fibonacci {

	static long cagriSayisi = 0;

	static long fib(int n) {
		cagriSayisi++;
		if (n <= 1) return n;                  // iki taban durum: fib(0) = 0, fib(1) = 1
		return fib(n - 1) + fib(n - 2);        // ayni alt problemler tekrar tekrar cozulur
	}

	static long fibDongu(int n) {
		long onceki = 0, simdiki = 1;
		if (n == 0) return 0;
		for (int i = 2; i <= n; i++) {
			long yeni = onceki + simdiki;
			onceki = simdiki;
			simdiki = yeni;
		}
		return simdiki;
	}

	public static void main(String[] args) {
		System.out.println(fib(4));                 // 3

		for (int i = 0; i <= 7; i++)                // Soru 19
			System.out.print(fib(i) + " ");
		System.out.println();                       // 0 1 1 2 3 5 8 13

		System.out.println(fib(3));                 // 2 (Soru 21)

		cagriSayisi = 0;
		long f5 = fib(5);
		System.out.println("fib(5) = " + f5 + ", cagri = " + cagriSayisi);   // 5, 15 (Soru 22)

		int[] nler = {10, 20, 30};
		for (int n : nler) {
			cagriSayisi = 0;
			long sonuc = fib(n);
			System.out.println("n = " + n + ": fib = " + sonuc + ", cagri = " + cagriSayisi
					+ ", fibDongu = " + fibDongu(n));
		}
	}
}
