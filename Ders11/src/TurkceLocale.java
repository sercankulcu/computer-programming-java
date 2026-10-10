// Turkce karakter ve Locale: toLowerCase / toUpperCase sonucu yerel ayara baglidir
// (Slayt: Turkce Karakter ve Locale; Calisma Sorusu 21).
// Kaynak ve cikti ASCII kalsin diye ASCII disi karakterler \\uXXXX bicimiyle yazdirilir
// (ornegin noktasiz kucuk i = \u0131, noktali buyuk I = \u0130). Beklenen: title, t\u0131tle, \u0130, I, ...
import java.util.Locale;

public class TurkceLocale {

	// ASCII disi karakterleri \\uXXXX bicimine cevirir
	static String goster(String s) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c < 128) sb.append(c);
			else sb.append(String.format("\\u%04x", (int) c));
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		Locale tr = Locale.forLanguageTag("tr");
		System.out.println(goster("TITLE".toLowerCase(Locale.ENGLISH)));   // title
		System.out.println(goster("TITLE".toLowerCase(tr)));               // t\u0131tle  (tItle, noktasiz i)
		System.out.println(goster("i".toUpperCase(tr)));                   // \u0130      (noktali buyuk I)
		System.out.println(goster("i".toUpperCase(Locale.ENGLISH)));       // I
		System.out.println(goster("I".toLowerCase(tr)));                   // \u0131
		System.out.println(goster("ISPARTA".toLowerCase(tr)));             // \u0131sparta (Soru 21: C)
		System.out.println(goster("\u0131sparta".toUpperCase(tr)));        // ISPARTA
		System.out.println("TITLE".toLowerCase(tr).equals("title"));       // false
		System.out.println("title".equalsIgnoreCase("TITLE"));             // true
	}
}
