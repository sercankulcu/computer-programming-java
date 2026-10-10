// Sesli harf sayma: indexOf ile karakterin sesliler dizgisinde olup olmadigina bakma
// (Slayt: Sesli Harf Sayma; Calisma Sorusu 26).
// Turkce harfler kaynak her kodlamada derlensin diye \\u kacislariyla yazildi:
// \u0131 = noktasiz i, \u00F6 = o umlaut, \u00FC = u umlaut. Beklenen cikti: 5 ("Merhaba Dunya"), 3 ("Giresun").
import java.util.Locale;

public class SesliHarfSayma {

	public static void main(String[] args) {
		Locale tr = Locale.forLanguageTag("tr");
		String s = "Merhaba D\u00FCnya".toLowerCase(tr);
		String sesliler = "ae\u0131io\u00F6u\u00FC";     // a e (noktasiz i) i o (o umlaut) u (u umlaut)
		int sayac = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (sesliler.indexOf(c) >= 0) sayac++;
		}
		System.out.println(sayac);   // 5 (e, a, a, u umlaut, a)

		// Soru 26
		String g = "Giresun".toLowerCase(tr);
		int sayac2 = 0;
		for (int i = 0; i < g.length(); i++) {
			if (sesliler.indexOf(g.charAt(i)) >= 0)
				sayac2++;
		}
		System.out.println(sayac2);  // 3 (i, e, u)
	}
}
