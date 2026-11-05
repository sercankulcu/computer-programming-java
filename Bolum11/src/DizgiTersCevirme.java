// Dizgiyi ters cevirme: charAt ile sondan basa ve StringBuilder.reverse()
// (Slayt: Dizgiyi Ters Cevirme; Calisma Sorusu 25).
// Beklenen cikti: "avaJ", "avaJ", "udrO".
public class DizgiTersCevirme {

	public static void main(String[] args) {
		String s = "Java";
		String ters = "";
		for (int i = s.length() - 1; i >= 0; i--)
			ters += s.charAt(i);
		System.out.println(ters);                  // avaJ
		String t2 = new StringBuilder(s).reverse()
				.toString();
		System.out.println(t2);                    // avaJ

		// Soru 25
		String k = "Ordu";
		String ters2 = "";
		for (int i = k.length() - 1; i >= 0; i--)
			ters2 += k.charAt(i);
		System.out.println(ters2);                 // udrO
	}
}
