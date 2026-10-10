// Palindrom kontrolu ozyinelemeyle: uclari karsilastir, ic kisim icin kendini cagir
// (Slayt: Palindrom Kontrolu: palindrom("kayak", 0, 4)).
// Beklenen cikti: true, false
public class OzyinelemeliPalindrom {

	static boolean palindrom(String s,
							 int sol, int sag) {
		if (sol >= sag) return true;            // taban durum: 0 ya da 1 karakter kaldi
		if (s.charAt(sol) != s.charAt(sag))
			return false;                       // taban durum: uyusmazlik
		return palindrom(s, sol + 1, sag - 1);
	}

	public static void main(String[] args) {
		System.out.println(palindrom("kayak", 0, 4));   // true
		String k = "kabuk";
		System.out.println(palindrom(k, 0, k.length() - 1));   // false
	}
}
