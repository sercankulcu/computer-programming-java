// Kuyruk ozyinelemesi: ozyinelemeli cagri son islemdir, sonuc birikim parametresinde tasinir
// (Slayt: Kuyruk Ozyinelemesi, Kod Izleme: fakt(4, 1); Calisma Sorulari 25, 26).
// Beklenen cikti: fakt(4, 1) -> fakt(3, 4) -> fakt(2, 12) -> fakt(1, 24) zinciri ve 24.
public class KuyrukOzyinelemesi {

	static long fakt(int n, long birikim) {
		if (n <= 1) return birikim;
		return fakt(n - 1, n * birikim);   // cagridan sonra yapilacak is yok
	}

	// Ayni metot, zinciri yazdirarak
	static long faktIzle(int n, long birikim) {
		System.out.print("fakt(" + n + ", " + birikim + ")");
		if (n <= 1) {
			System.out.println();
			return birikim;
		}
		System.out.print(" -> ");
		return faktIzle(n - 1, n * birikim);
	}

	public static void main(String[] args) {
		System.out.println(fakt(4, 1)); // 24
		System.out.println(faktIzle(4, 1));
		// Not: Java kuyruk cagrisi optimizasyonunu garanti etmez; her cagri yine yeni bir yigin cercevesi acar.
	}
}
