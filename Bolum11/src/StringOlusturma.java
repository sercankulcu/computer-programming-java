// String olusturma, indisleme (charAt, length()) ve sinir disi charAt
// (Slayt: String Olusturma, Indisleme; Calisma Sorulari 1, 7, 8, 9).
// Beklenen cikti: "Tarkan 0 true null"; "7 G n"; "7 Gn", "3 4 -1", "215"; "3 2"; StringIndexOutOfBoundsException yakalanir.
public class StringOlusturma {

	public static void main(String[] args) {
		String ad = "Tarkan";            // dizgi sabiti
		String bos = "";                 // uzunlugu 0 olan gecerli String
		String kopya = new String(ad);   // her zaman yeni nesne
		String yok = null;               // hicbir nesneyi gostermez
		System.out.println(kopya + " " + bos.length() + " " + kopya.equals(ad) + " " + yok);

		// Soru 1: char c = "A"; derleme hatasi verir (String char'a atanamaz)
		// char c = "A";
		char c = 'A';
		String s1 = "A";
		System.out.println(c + " " + s1);

		// Indisleme: ilk karakter 0, son karakter length() - 1
		String s = "Giresun";
		System.out.println(s.length() + " " + s.charAt(0) + " " + s.charAt(6));   // 7 G n

		// Soru 8: charAt ve indexOf
		System.out.println(s.length() + " " + s.charAt(0) + s.charAt(s.length() - 1));  // 7 Gn
		System.out.println(s.indexOf('e') + " " + s.indexOf("su") + " " + s.indexOf('x')); // 3 4 -1
		System.out.println(s.charAt(2) + s.charAt(3));   // 'r' + 'e' = 114 + 101 = 215 (char toplami int)

		// Soru 7: String'de length() metot, dizide length alan
		String t = "abc";
		int[] a = {1, 2};
		System.out.println(t.length() + " " + a.length);   // 3 2

		// Soru 9: gecerli indisler 0-6; charAt(7) calisma zamani hatasi
		try {
			System.out.println(s.charAt(7));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("StringIndexOutOfBoundsException: " + e.getMessage());
		}
	}
}
