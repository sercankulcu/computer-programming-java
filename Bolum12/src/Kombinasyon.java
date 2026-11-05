// Kombinasyon C(n, k) = C(n-1, k-1) + C(n-1, k); taban durumlar k == 0 ve k == n; bellekleme ile hizlandirma
// (Slayt: Alistirmalar - kombinasyon).
// Beklenen cikti: C(5, 2) = 10; C(30, 15) = 155117520 (belleksiz ve bellekli cagri sayilari karsilastirilir).
public class Kombinasyon {

	static long cagriSayisi = 0;

	static long kombinasyon(int n, int k) {
		cagriSayisi++;
		if (k == 0 || k == n) return 1;     // taban durumlar
		return kombinasyon(n - 1, k - 1) + kombinasyon(n - 1, k);
	}

	static long kombinasyonBellek(int n, int k, long[][] bellek) {
		cagriSayisi++;
		if (k == 0 || k == n) return 1;
		if (bellek[n][k] != 0) return bellek[n][k];
		bellek[n][k] = kombinasyonBellek(n - 1, k - 1, bellek) + kombinasyonBellek(n - 1, k, bellek);
		return bellek[n][k];
	}

	public static void main(String[] args) {
		System.out.println("C(5, 2) = " + kombinasyon(5, 2));   // 10

		cagriSayisi = 0;
		long a = kombinasyon(30, 15);
		System.out.println("belleksiz C(30, 15) = " + a + ", cagri = " + cagriSayisi);
		cagriSayisi = 0;
		long b = kombinasyonBellek(30, 15, new long[31][31]);
		System.out.println("bellekli  C(30, 15) = " + b + ", cagri = " + cagriSayisi);
	}
}
