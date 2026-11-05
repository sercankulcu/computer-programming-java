// equalsIgnoreCase, startsWith, endsWith ve compareTo (sozluksel sira)
// (Slayt: Karsilastirma Metotlari, compareTo: Karakter ve Uzunluk Farki; Calisma Sorulari 15, 19).
// Beklenen cikti: true true true true; 4, -3; Soru 15: false; Soru 19: 4, -3, -32, 0.
public class KarsilastirmaMetotlari {

	public static void main(String[] args) {
		System.out.println("abc".equals("abc"));                 // true
		System.out.println("Java".equalsIgnoreCase("JAVA"));     // true
		System.out.println("Giresun".startsWith("Gir"));         // true
		System.out.println("Giresun".endsWith("sun"));           // true

		// Ilk farkli karakterlerin farki: 'e' - 'a' = 4
		String x = "elma";
		String y = "armut";
		System.out.println(x.compareTo(y)); // 4
		// Biri digerinin onekiyse uzunluk farki: 4 - 7 = -3
		String k = "kedi";
		System.out.println(k.compareTo("kediler")); // -3

		// Soru 15: startsWith buyuk-kucuk harfe duyarlidir
		System.out.println("Giresun".startsWith("gir"));         // false

		// Soru 19
		System.out.println("elma".compareTo("armut"));   // 4
		System.out.println("kedi".compareTo("kediler")); // -3
		System.out.println("Ali".compareTo("ali"));      // 'A' - 'a' = 65 - 97 = -32
		System.out.println("abc".compareTo("abc"));      // 0
	}
}
