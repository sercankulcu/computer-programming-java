// printf ve String.format ile bicimleme; yerel ayar ve tip uyusmazligi
// (Slayt: printf ile Bicimleme; Calisma Sorulari 31, 32).
// Beklenen cikti: "Java       3   17.50"; Turkce yerel ayarda "17,50"; "Ada   |  42|  3.14|", "00042|1,234,567";
// Soru 32: IllegalFormatConversionException yakalanir.
import java.util.IllegalFormatConversionException;
import java.util.Locale;

public class Bicimleme {

	public static void main(String[] args) {
		String ad = "Java"; int adet = 3; double fiyat = 17.5;
		// %-8s: 8 genislik sola yasli, %3d: 3 genislik, %7.2f: 7 genislik 2 ondalik
		System.out.printf(Locale.US, "%-8s %3d %7.2f%n", ad, adet, fiyat);
		// Yerel ayar verilmezse ondalik ayirici makineye baglidir; Turkce'de virgul olur
		System.out.printf(Locale.forLanguageTag("tr"), "%-8s %3d %7.2f%n", ad, adet, fiyat);

		// Soru 31
		String ad2 = "Ada";
		int adet2 = 42;
		double fiyat2 = 3.14159;
		System.out.println(String.format(Locale.US,
				"%-6s|%4d|%6.2f|", ad2, adet2, fiyat2));   // Ada   |  42|  3.14|
		System.out.println(String.format(Locale.US,
				"%05d|%,d", 42, 1234567));                  // 00042|1,234,567

		// Soru 32: %d tam sayi bekler; derleyici denetlemez, hata calisma zamaninda
		try {
			System.out.printf("%d%n", 3.5);
		} catch (IllegalFormatConversionException e) {
			System.out.println("IllegalFormatConversionException: " + e.getMessage());
		}
		System.out.printf(Locale.US, "%.1f%n", 3.5);        // 3.5
	}
}
