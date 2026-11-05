// 2B dizide clone() sig kopyadir: satir dizileri paylasilir
// (Slayt: 2B Dizide Sig Kopya Tuzagi).
// Beklenen cikti: [[99, 2], [3, 4]] ve [[99, 2], [7, 8]]; derin kopya degisince a etkilenmez.
import java.util.Arrays;

public class SigKopyaTuzagi {

	public static void main(String[] args) {
		int[][] a = {{1, 2}, {3, 4}};
		int[][] b = a.clone();          // yalnizca dis dizi kopyalandi
		b[0][0] = 99;                   // paylasilan satir: a'yi da etkiler
		b[1] = new int[]{7, 8};         // b'nin satir referansi degisti: a etkilenmez
		System.out.println(Arrays.deepToString(a));   // [[99, 2], [3, 4]]
		System.out.println(Arrays.deepToString(b));   // [[99, 2], [7, 8]]

		// Derin kopya: her satir ayrica kopyalanir
		int[][] c = new int[a.length][];
		for (int i = 0; i < a.length; i++)
			c[i] = a[i].clone();
		c[0][0] = 1;
		System.out.println(Arrays.deepToString(a));   // [[99, 2], [3, 4]]
		System.out.println(Arrays.deepToString(c));   // [[1, 2], [3, 4]]
	}
}
