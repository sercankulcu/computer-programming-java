// Duzensiz (jagged) dizi: her satirin uzunlugu farkli olabilir; atanmamis satir null'dir
// (Slayt: Duzensiz (Jagged) Dizi, Yaygin Hatalar; Calisma Sorusu 36).
// Beklenen cikti: "1 2 3", ucgen bicimli yazim, "6" ve ardindan yakalanan NullPointerException.
public class DuzensizDizi {

	public static void main(String[] args) {
		int[][] m = new int[3][];       // yalnizca dis dizi olusturuldu
		m[0] = new int[1];
		m[1] = new int[2];
		m[2] = new int[3];
		for (int i = 0; i < m.length; i++)
			System.out.print(m[i].length + " ");   // 1 2 3
		System.out.println();

		// Ic dongude m[0].length degil m[i].length kullanilir
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++)
				System.out.print((i + j) + " ");
			System.out.println();
		}

		// Soru 36: m2[1] hic atanmadi -> null
		int[][] m2 = new int[3][];
		m2[0] = new int[2];
		m2[2] = new int[4];
		System.out.println(m2[0].length + m2[2].length);   // 6
		try {
			System.out.println(m2[1].length);
		} catch (NullPointerException e) {
			System.out.println("NullPointerException: m2[1] null");
		}
	}
}
