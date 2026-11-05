// Iki boyutlu dizi (matris): erisim, satir satir gezinme, satir toplamlari
// (Slayt: Iki Boyutlu Dizi, Matriste Satir Satir Gezinme; Calisma Sorulari 34, 35).
// Beklenen cikti: 6; "1 2 3" / "4 5 6"; "2 3", "8", "[30, 5, 6]"; "6 15".
import java.util.Arrays;

public class IkiBoyutluDizi {

	public static void main(String[] args) {
		int[][] matris = {
			{1, 2, 3},
			{4, 5, 6}
		};
		int deger = matris[1][2];
		System.out.println(deger);                 // 6

		for (int i = 0; i < matris.length; i++) {          // satirlar
			for (int j = 0; j < matris[i].length; j++) {   // sutunlar
				System.out.print(matris[i][j] + " ");
			}
			System.out.println();
		}

		// Soru 34: satir, sutun ve hucre
		int[][] m = {
			{1, 2, 3},
			{4, 5, 6}
		};
		System.out.println(m.length + " " + m[0].length);  // 2 3
		System.out.println(m[1][2] + m[0][1]);             // 8
		m[1][0] = m[0][2] * 10;
		System.out.println(Arrays.toString(m[1]));         // [30, 5, 6]

		// Soru 35: satir toplamlari
		int[][] k = {{1, 2, 3}, {4, 5, 6}};
		for (int i = 0; i < k.length; i++) {
			int toplam = 0;
			for (int j = 0; j < k[i].length; j++) {
				toplam += k[i][j];
			}
			System.out.print(toplam + " ");                // 6 15
		}
		System.out.println();
	}
}
