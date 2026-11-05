// Ozyinelemeli ikili arama: aranan aralik her cagrida yariya iner
// (Slayt: Ozyinelemeli Ikili Arama: ara(a, 38, 0, 7)).
// Beklenen cikti: 6 ve -1
public class OzyinelemeliIkiliArama {

	static int ara(int[] a, int x,
				   int lo, int hi) {
		if (lo > hi) return -1;                       // taban durum: aralik bos
		int mid = (lo + hi) / 2;
		if (a[mid] == x) return mid;                  // taban durum: bulundu
		if (a[mid] < x) return ara(a, x, mid + 1, hi);
		return ara(a, x, lo, mid - 1);
	}

	public static void main(String[] args) {
		int[] a = {2, 5, 8, 12, 16, 23, 38, 56};
		System.out.println(ara(a, 38, 0, 7));    // 6
		System.out.println(ara(a, 7, 0, a.length - 1));   // -1
	}
}
