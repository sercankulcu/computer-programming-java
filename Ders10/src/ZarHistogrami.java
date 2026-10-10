// Frekans sayma: zar histogrami ve rastgele dizi doldurma
// (Slayt: Frekans Sayma: Zar Histogrami; Calisma Sorusu 27).
// Beklenen cikti: "1: *", "3: ***", "6: **" (digerleri bos); ardindan sabit tohumla (42) uretilen 5 sayi (0-99).
import java.util.Arrays;
import java.util.Random;

public class ZarHistogrami {

	// Soru 27: nextInt(100) 0 dahil, 100 haric deger uretir. Tekrarlanabilir cikti icin
	// slayttaki new Random() yerine sabit tohumlu new Random(42) kullanildi.
	static int[] diziOlusturVeDoldur(int elemanSayisi) {
		int[] dizi = new int[elemanSayisi];
		Random rastgele = new Random(42);
		for (int i = 0; i < dizi.length; i++) {
			dizi[i] = rastgele.nextInt(100);
		}
		return dizi;
	}

	public static void main(String[] args) {
		int[] atislar = {3, 6, 3, 1, 6, 3};
		int[] sayac = new int[7];        // 0. indis kullanilmaz; sayac[zar] o zarin frekansi
		for (int zar : atislar)
			sayac[zar]++;
		for (int y = 1; y <= 6; y++) {
			System.out.print(y + ": ");
			for (int k = 0; k < sayac[y]; k++)
				System.out.print("*");
			System.out.println();
		}

		int[] d = diziOlusturVeDoldur(5);
		System.out.println(d.length + " " + Arrays.toString(d));
	}
}
