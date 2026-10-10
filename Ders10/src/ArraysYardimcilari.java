// java.util.Arrays yardimcilari: toString, deepToString, fill, equals, copyOf, sort, binarySearch
// (Slayt: Arrays Yardimcilari, Siralama ve Ikili Arama; Calisma Sorusu 32).
// Beklenen cikti: slayttaki tablo degerleri; sort sonrasi [1, 2, 5, 7, 9], binarySearch(a, 7) = 3; bulunamayan 7 -> -4.
import java.util.Arrays;

public class ArraysYardimcilari {

	public static void main(String[] args) {
		int[] a = {5, 2, 9}, r = {10, 20, 30, 40, 50}, p = {1, 2, 3}, q = {1, 2, 3}, f = new int[4];
		int[][] m = {{1, 2}, {3, 4}};

		System.out.println(Arrays.toString(a));        // [5, 2, 9]
		System.out.println(Arrays.deepToString(m));    // [[1, 2], [3, 4]]
		System.out.println(Arrays.toString(m));        // [[I@... (satir dizilerinin adresleri)
		Arrays.fill(f, 7);
		System.out.println(Arrays.toString(f));        // [7, 7, 7, 7]
		System.out.println((p == q) + " / " + p.equals(q));  // false / false (referans karsilastirmasi)
		System.out.println(Arrays.equals(p, q));       // true (icerik)
		System.out.println(Arrays.deepEquals(m, new int[][]{{1, 2}, {3, 4}}));  // true (2B icin)

		System.out.println(Arrays.toString(Arrays.copyOf(a, 5)));         // [5, 2, 9, 0, 0]
		System.out.println(Arrays.toString(Arrays.copyOf(a, 2)));         // [5, 2]
		System.out.println(Arrays.toString(Arrays.copyOfRange(r, 1, 4))); // [20, 30, 40]

		// Siralama ve ikili arama (binarySearch yalnizca sirali dizide dogru calisir)
		int[] s = {5, 2, 9, 1, 7};
		Arrays.sort(s);                                // yerinde siralar
		System.out.println(Arrays.toString(s));        // [1, 2, 5, 7, 9]
		System.out.println(Arrays.binarySearch(s, 7)); // 3

		// Soru 32: bulunamazsa -(eklenme noktasi) - 1
		System.out.println(Arrays.binarySearch(new int[]{2, 4, 6, 8}, 7));   // -4
		System.out.println(Arrays.binarySearch(new int[]{2, 4, 6, 8}, 5));   // -3
	}
}
