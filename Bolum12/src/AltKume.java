// Geri izleme (backtracking): her oge icin "sec" ve "secme" dallari ile tum alt kumeler
// (Slayt: Alt Kume Uretimi (geri izleme), Kod Izleme: Alt Kume Uretimi).
// Beklenen cikti: [1, 2], [1], [2], [] ve {1, 2, 3} icin 8 alt kume
import java.util.ArrayList;
import java.util.List;

public class AltKume {

	static void altKume(int[] a, int i,
						List<Integer> sec) {
		if (i == a.length) {                 // taban durum: tum ogeler icin karar verildi
			System.out.println(sec);
			return;
		}
		sec.add(a[i]);                       // a[i]'yi sec
		altKume(a, i + 1, sec);
		sec.remove(sec.size() - 1);          // geri al (geri izleme)
		altKume(a, i + 1, sec);              // a[i]'yi secme
	}

	public static void main(String[] args) {
		altKume(new int[]{1, 2}, 0, new ArrayList<>());
		System.out.println("---");
		altKume(new int[]{1, 2, 3}, 0, new ArrayList<>());
	}
}
