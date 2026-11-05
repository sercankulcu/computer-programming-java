// Diziyi iki isaretci ile ters cevirme, hatali tam takas ve bir konum saga dondurme
// (Slayt: Diziyi Ters Cevirme (iki isaretci); Calisma Sorulari 28, 29).
// Beklenen cikti: "[5, 4, 3, 2, 1]", Soru 28: "[1, 2, 3, 4]", Soru 29: "[4, 1, 2, 3]".
import java.util.Arrays;

public class DiziTersCevirme {

	public static void main(String[] args) {
		int[] dizi = {1, 2, 3, 4, 5};
		int sol = 0, sag = dizi.length - 1;
		while (sol < sag) {
			int gecici = dizi[sol];
			dizi[sol] = dizi[sag];
			dizi[sag] = gecici;
			sol++;
			sag--;
		}
		System.out.println(Arrays.toString(dizi));     // [5, 4, 3, 2, 1]

		// Soru 28: dongu tum diziyi gezerse her cift iki kez takas edilir -> dizi degismez
		int[] a = {1, 2, 3, 4};
		for (int i = 0; i < a.length; i++) {           // dogrusu: i < a.length / 2
			int t = a[i];
			a[i] = a[a.length - 1 - i];
			a[a.length - 1 - i] = t;
		}
		System.out.println(Arrays.toString(a));        // [1, 2, 3, 4]

		// Soru 29: bir konum saga dondurme (sagdan sola kaydirma)
		int[] b = {1, 2, 3, 4};
		int son = b[b.length - 1];
		for (int i = b.length - 1; i > 0; i--) {
			b[i] = b[i - 1];
		}
		b[0] = son;
		System.out.println(Arrays.toString(b));        // [4, 1, 2, 3]
	}
}
