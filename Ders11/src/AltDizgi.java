// substring(a, b): a dahil, b haric; gecerli aralik 0 <= a <= b <= length()
// (Slayt: Alt Dizgi Sinirlari; Calisma Sorulari 10, 11).
// Beklenen cikti: "PRO", "GRAM", "GRAM", "[]"; Soru 10: "PRO", "GRAM", "OGR||", "3"; hatali cagrilar yakalanir.
public class AltDizgi {

	public static void main(String[] args) {
		String s = "PROGRAM";
		System.out.println(s.substring(0, 3));           // PRO (uzunluk 3 - 0 = 3)
		System.out.println(s.substring(3, 7));           // GRAM (bitis length() olabilir)
		System.out.println(s.substring(3));              // GRAM (sona kadar)
		System.out.println("[" + s.substring(2, 2) + "]");   // [] bos dizgi, hata degil

		// Soru 10
		System.out.println(s.substring(0, 3));
		System.out.println(s.substring(3));
		System.out.println(s.substring(2, 5) + "|" + s.substring(4, 4) + "|");   // OGR||
		System.out.println(s.substring(1, 4).length());                          // 3

		// Bitis > length() ya da baslangic > bitis -> calisma zamani hatasi (Soru 11: substring(5, 3))
		try {
			System.out.println(s.substring(5, 9));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("substring(5, 9): StringIndexOutOfBoundsException");
		}
		try {
			System.out.println(s.substring(5, 3));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("substring(5, 3): StringIndexOutOfBoundsException");
		}
		System.out.println("[" + s.substring(7) + "] [" + s.substring(0, 7) + "]");   // [] [PROGRAM]
	}
}
