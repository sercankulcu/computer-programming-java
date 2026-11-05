// Hanoi kuleleri: n-1 diski araya, en buyugu hedefe, n-1 diski hedefe tasi
// (Slayt: Hanoi Kuleleri: hanoi(3, 'A', 'C', 'B'); Calisma Sorulari 29, 30; Alistirma: n = 4).
// Beklenen cikti: "A->C A->B C->B A->C B->A B->C A->C"; 2 disk icin 3 satir; hamle sayilari 1 3 7 15 31 (2^n - 1).
public class HanoiKuleleri {

	static int hamleSayaci = 0;

	static void hanoi(int n, char kaynak,
					  char hedef, char ara) {
		if (n == 0) return;
		hanoi(n - 1, kaynak, ara, hedef);
		System.out.print(kaynak + "->" + hedef + " ");
		hanoi(n - 1, ara, hedef, kaynak);
	}

	// Soru 29: disk numarasiyla, her hamle ayri satirda
	static void hanoiSatir(int n, char kaynak, char hedef, char ara) {
		if (n == 0) return;
		hanoiSatir(n - 1, kaynak, ara, hedef);
		System.out.println(n + ": " + kaynak + " -> " + hedef);
		hanoiSatir(n - 1, ara, hedef, kaynak);
	}

	// Yazdirmadan yalnizca hamleleri sayar
	static void hanoiSay(int n, char kaynak, char hedef, char ara) {
		if (n == 0) return;
		hanoiSay(n - 1, kaynak, ara, hedef);
		hamleSayaci++;
		hanoiSay(n - 1, ara, hedef, kaynak);
	}

	public static void main(String[] args) {
		hanoi(3, 'A', 'C', 'B');
		System.out.println();

		hanoiSatir(2, 'A', 'C', 'B');

		// Soru 30 ve alistirma: h(n) = 2 h(n - 1) + 1 = 2^n - 1
		for (int n = 1; n <= 5; n++) {
			hamleSayaci = 0;
			hanoiSay(n, 'A', 'C', 'B');
			System.out.print(hamleSayaci + " ");
		}
		System.out.println();
	}
}
