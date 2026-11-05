// Matris transpozu ve 2x2 matris carpimi
// (Slayt: Matris Transpozu, Matris Carpimi (2x2)).
// Beklenen cikti: [[1, 4], [2, 5], [3, 6]] ve [[19, 22], [43, 50]]
import java.util.Arrays;

public class MatrisIslemleri {

	public static void main(String[] args) {
		int[][] matris = {{1, 2, 3}, {4, 5, 6}};
		int satirSayisi = matris.length;
		int sutunSayisi = matris[0].length;
		int[][] t = new int[sutunSayisi][satirSayisi];
		for (int i = 0; i < satirSayisi; i++)
			for (int j = 0; j < sutunSayisi; j++)
				t[j][i] = matris[i][j];
		System.out.println(Arrays.deepToString(t));   // [[1, 4], [2, 5], [3, 6]]

		int[][] A = {{1, 2}, {3, 4}};
		int[][] B = {{5, 6}, {7, 8}};
		int[][] C = new int[2][2];
		for (int i = 0; i < 2; i++)
			for (int j = 0; j < 2; j++)
				for (int k = 0; k < 2; k++)
					C[i][j] += A[i][k] * B[k][j];
		System.out.println(Arrays.deepToString(C));   // [[19, 22], [43, 50]]
	}
}
