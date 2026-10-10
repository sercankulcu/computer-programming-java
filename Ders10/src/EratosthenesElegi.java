// Eratosthenes elegi: boolean dizi ile 20'ye kadar asal sayilar
// (Slayt: Eratosthenes Elegi (boolean dizi)).
// Beklenen cikti: 2 3 5 7 11 13 17 19
public class EratosthenesElegi {

	public static void main(String[] args) {
		int n = 20;
		boolean[] asalDegil = new boolean[n + 1];   // hepsi false ile baslar
		for (int i = 2; i * i <= n; i++)
			if (!asalDegil[i])
				for (int k = i * i; k <= n; k += i)
					asalDegil[k] = true;            // i'nin katlari asal degil
		for (int i = 2; i <= n; i++)
			if (!asalDegil[i]) System.out.print(i + " ");
		System.out.println();
	}
}
