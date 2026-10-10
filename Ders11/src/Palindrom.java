// Palindrom kontrolu: iki uctan ortaya dogru karsilastirma (harf buyuklugu ve bosluk yok sayilir)
// (Slayt: Palindrom: Harf Buyuklugu ve Bosluk Yok Sayilarak; Calisma Sorusu 29).
// Beklenen cikti: true, true
import java.util.Locale;

public class Palindrom {

	public static void main(String[] args) {
		String cumle = "Ey Edip Adanada pide ye";
		String t = cumle.toLowerCase(Locale.ENGLISH).replace(" ", "");
		int sol = 0, sag = t.length() - 1;
		boolean palindrom = true;
		while (sol < sag && palindrom) {
			if (t.charAt(sol) != t.charAt(sag))
				palindrom = false;
			sol++; sag--;
		}
		System.out.println(palindrom);   // true

		// Soru 29: break ile erken cikis
		String s = "Kabak".toLowerCase(Locale.ENGLISH);
		int sol2 = 0, sag2 = s.length() - 1;
		boolean palindrom2 = true;
		while (sol2 < sag2) {
			if (s.charAt(sol2) != s.charAt(sag2)) {
				palindrom2 = false;
				break;
			}
			sol2++; sag2--;
		}
		System.out.println(palindrom2);  // true
	}
}
