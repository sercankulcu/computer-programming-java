// == referansi, equals icerigi karsilastirir; dizgi havuzu ve null ile equals
// (Slayt: == ile equals Farki, Dizgi Havuzu; Calisma Sorulari 17, 20).
// Beklenen cikti: false, true, true; Soru 17: false, true, true, true; Soru 20: false ve yakalanan NullPointerException.
public class EsitlikKarsilastirma {

	public static void main(String[] args) {
		String a = "Giresun";
		String b = new String("Giresun");   // havuz disinda yeni nesne
		String c = "Giresun";               // havuzdaki ayni nesne
		System.out.println(a == b);      // false
		System.out.println(a == c);      // true
		System.out.println(a.equals(b)); // true

		// Soru 17
		String x = "Ordu";
		String y = new String("Ordu");
		String z = "Ordu";
		System.out.println(x == y);            // false
		System.out.println(x == z);            // true
		System.out.println(x.equals(y));       // true
		System.out.println(x == y.intern());   // true (intern havuzdaki nesneyi dondurur)

		// Soru 20: sabiti sola yazmak NullPointerException'i onler
		String bos = null;
		System.out.println("sabit".equals(bos));   // false
		try {
			System.out.println(bos.equals("sabit"));
		} catch (NullPointerException e) {
			System.out.println("NullPointerException");
		}
	}
}
