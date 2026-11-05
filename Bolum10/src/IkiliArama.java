// Ikili arama: sirali dizide araligi her adimda yariya indirme
// (Slayt: Ikili Arama: hedef = 23, Basarisiz Arama; Calisma Sorusu 31).
// Beklenen cikti: lo/hi/mid izleme satirlari, 5; -3 (Arrays.binarySearch ile ayni); 2
public class IkiliArama {

	// Bulamazsa Arrays.binarySearch gibi -(lo + 1) dondurur; lo eklenme noktasidir
	static int ara(int[] a, int x) {
		int lo = 0, hi = a.length - 1;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (a[mid] == x) return mid;
			if (a[mid] < x) lo = mid + 1; else hi = mid - 1;
		}
		return -(lo + 1);
	}

	public static void main(String[] args) {
		int[] a = {2, 5, 8, 12, 16, 23, 38, 56};
		int hedef = 23, lo = 0, hi = a.length - 1;
		int sonuc = -1;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			System.out.println("lo=" + lo + " hi=" + hi + " mid=" + mid + " a[mid]=" + a[mid]);
			if (a[mid] == hedef) { sonuc = mid; break; }
			if (a[mid] < hedef) lo = mid + 1;
			else hi = mid - 1;
		}
		System.out.println(sonuc);                               // 5

		System.out.println(ara(new int[]{2, 4, 6, 8}, 5));      // -3

		// Soru 31: hedef = 11
		System.out.println(ara(new int[]{3, 8, 11, 15, 20, 27, 31}, 11));   // 2
	}
}
