// Eklemeli siralama (insertion sort); her turdan sonra dizi yazdirilir
// (Slayt: Eklemeli Siralama (Insertion Sort)).
// Beklenen cikti: i=1: [3, 4, 5, 1], i=2: [3, 4, 5, 1], i=3: [1, 3, 4, 5]
import java.util.Arrays;

public class EklemeliSiralama {

	public static void main(String[] args) {
		int[] a = {4, 3, 5, 1};
		for (int i = 1; i < a.length; i++) {
			int anahtar = a[i];
			int j = i - 1;
			while (j >= 0 && a[j] > anahtar) {   // buyukleri bir saga kaydir
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = anahtar;                  // anahtari bosluga yerlestir
			System.out.println("i=" + i + ": " + Arrays.toString(a));
		}
	}
}
