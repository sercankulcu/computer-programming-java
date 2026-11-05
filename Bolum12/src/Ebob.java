// Oklid algoritmasi ile EBOB: ebob(a, b) = ebob(b, a % b), ebob(a, 0) = |a|
// (Slayt: Oklid ile EBOB: ebob(48, 18); Calisma Sorusu 27).
// Beklenen cikti: ebob(48, 18) adimlari ve 6; ebob(84, 36) = 12
public class Ebob {

	static int ebob(int a, int b) {
		if (b == 0) return Math.abs(a);
		return ebob(b, a % b);
	}

	// Ayni hesap, her cagriyi yazdirarak
	static int ebobIzle(int a, int b) {
		System.out.println("ebob(" + a + ", " + b + ")");
		if (b == 0) return Math.abs(a);
		return ebobIzle(b, a % b);
	}

	public static void main(String[] args) {
		System.out.println(ebob(48, 18));      // 6
		ebobIzle(48, 18);                      // (48,18) -> (18,12) -> (12,6) -> (6,0)
		System.out.println(ebob(84, 36));      // 12 (Soru 27)
	}
}
