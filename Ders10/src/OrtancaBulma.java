// Ortanca (medyan) oge: sirala, ortadaki ogeyi ya da ortadaki iki ogenin ortalamasini al
// (Calisma Sorulari 24, 25, 26).
// Beklenen cikti: 5.5, 5.0; yan etki: "[2, 4, 7, 9] 5.5"; "/ 2" ile hatali 3.0, dogrusu 3.5; kopya ile yan etkisiz.
import java.util.Arrays;

public class OrtancaBulma {

	static double ortancaElemanBul(int[] dizi) {
		Arrays.sort(dizi);                      // yan etki: cagiranin dizisi siralanir
		if (dizi.length % 2 == 0) {
			int orta1 = dizi[dizi.length / 2 - 1];
			int orta2 = dizi[dizi.length / 2];
			return (orta1 + orta2) / 2.0;
		}
		return dizi[dizi.length / 2];
	}

	// Soru 26: / 2.0 yerine / 2 yazilirsa tam sayi bolmesi yapilir
	static double ortancaHatali(int[] dizi) {
		Arrays.sort(dizi);
		if (dizi.length % 2 == 0) {
			int orta1 = dizi[dizi.length / 2 - 1];
			int orta2 = dizi[dizi.length / 2];
			return (orta1 + orta2) / 2;         // HATALI
		}
		return dizi[dizi.length / 2];
	}

	public static void main(String[] args) {
		System.out.println(ortancaElemanBul(new int[]{9, 2, 7, 4}));     // 5.5
		System.out.println(ortancaElemanBul(new int[]{8, 1, 6, 3, 5}));  // 5.0

		// Soru 25: metot diziyi yerinde siraladigi icin a degisir
		int[] a = {9, 2, 7, 4};
		double m = ortancaElemanBul(a);
		System.out.println(Arrays.toString(a) + " " + m);               // [2, 4, 7, 9] 5.5

		System.out.println(ortancaHatali(new int[]{9, 1, 4, 3}));        // 3.0
		System.out.println(ortancaElemanBul(new int[]{9, 1, 4, 3}));     // 3.5

		// Yan etkiden kacinmak icin kopya uzerinde calisilabilir
		int[] b = {9, 2, 7, 4};
		double m2 = ortancaElemanBul(b.clone());
		System.out.println(Arrays.toString(b) + " " + m2);              // [9, 2, 7, 4] 5.5
	}
}
