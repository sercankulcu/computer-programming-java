// Bellekleme (memoization): hesaplanan fib(k) degerleri dizide saklanir, tekrar hesaplanmaz
// (Slayt: Memoization, Kod Izleme: Belleklemeli fib(5); Calisma Sorusu 23).
// Beklenen cikti: 5; "fib(6) = 8, cagri = 11"; fib(50) = 12586269025 aninda hesaplanir.
public class BelleklemeliFibonacci {

	static int cagriSayisi = 0;

	static long fib(int n, long[] bellek) {
		cagriSayisi++;
		if (n <= 1) return n;
		if (bellek[n] != 0) return bellek[n];   // daha once hesaplandi
		bellek[n] = fib(n - 1, bellek)
				+ fib(n - 2, bellek);
		return bellek[n];
	}

	public static void main(String[] args) {
		long[] bellek = new long[6];
		System.out.println(fib(5, bellek));     // 5

		// Soru 23: fib(6) icin cagri sayisi 1 + 2 * 5 = 11
		cagriSayisi = 0;
		long sonuc = fib(6, new long[50]);
		System.out.println("fib(6) = " + sonuc + ", cagri = " + cagriSayisi);

		// Belleklemesiz surum fib(50) icin milyarlarca cagri yapardi
		cagriSayisi = 0;
		System.out.println("fib(50) = " + fib(50, new long[51]) + ", cagri = " + cagriSayisi);
	}
}
