// Kabarcik siralamasi (bubble sort); her gecisten sonra dizi yazdirilir
// (Slayt: Kabarcik Siralamasi (Bubble Sort); Calisma Sorusu 33: yalnizca ilk gecis).
// Beklenen cikti: gecis 0: [1, 4, 2, 5], gecis 1: [1, 2, 4, 5], gecis 2: [1, 2, 4, 5]; Soru 33: [1, 4, 2, 3, 5].
import java.util.Arrays;

public class KabarcikSiralamasi {

	public static void main(String[] args) {
		int[] a = {5, 1, 4, 2};
		int n = a.length;
		for (int gecis = 0; gecis < n - 1; gecis++) {
			for (int j = 0; j < n - 1 - gecis; j++) {
				if (a[j] > a[j + 1]) {
					int gecici = a[j];
					a[j] = a[j + 1];
					a[j + 1] = gecici;
				}
			}
			System.out.println("gecis " + gecis + ": " + Arrays.toString(a));
		}

		// Soru 33: ilk geciste en buyuk oge (5) sona "kabarir"
		int[] b = {5, 1, 4, 2, 3};
		for (int j = 0; j < b.length - 1; j++) {
			if (b[j] > b[j + 1]) {
				int t = b[j]; b[j] = b[j + 1]; b[j + 1] = t;
			}
		}
		System.out.println(Arrays.toString(b));   // [1, 4, 2, 3, 5]
	}
}
