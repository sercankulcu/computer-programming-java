// Bol ve fethet: birlestirme siralamasi (merge sort)
// (Slayt: Bol ve Fethet: Birlestirme Siralamasi).
// Beklenen cikti: [38, 27, 43, 3, 9, 82, 10] -> [3, 9, 10, 27, 38, 43, 82]
import java.util.Arrays;

public class BirlestirmeSiralamasi {

	static void sirala(int[] a, int lo, int hi) {
		if (lo >= hi) return;                 // taban durum: 0 ya da 1 oge
		int mid = (lo + hi) / 2;
		sirala(a, lo, mid);                   // sol yariyi sirala
		sirala(a, mid + 1, hi);               // sag yariyi sirala
		int[] t = new int[hi - lo + 1];       // iki sirali yariyi birlestir
		int i = lo, j = mid + 1, k = 0;
		while (i <= mid && j <= hi)
			t[k++] = a[i] <= a[j] ? a[i++] : a[j++];
		while (i <= mid) t[k++] = a[i++];
		while (j <= hi) t[k++] = a[j++];
		System.arraycopy(t, 0, a, lo, t.length);
	}

	public static void main(String[] args) {
		int[] a = {38, 27, 43, 3, 9, 82, 10};
		System.out.println(Arrays.toString(a));
		sirala(a, 0, a.length - 1);
		System.out.println(Arrays.toString(a));
	}
}
