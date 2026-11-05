// Dizgiyi ozyinelemeyle ters cevirme: ters(s) = ters(s.substring(1)) + s.charAt(0)
// (Slayt: Dizgiyi Ozyinelemeli Ters Cevirme).
// Beklenen cikti: cba, kaynak
public class OzyinelemeliTersCevirme {

	static String ters(String s) {
		if (s.length() <= 1) return s;          // taban durum
		return ters(s.substring(1)) + s.charAt(0);
	}

	public static void main(String[] args) {
		System.out.println(ters("abc"));        // cba
		System.out.println(ters("kanyak"));     // kaynak
	}
}
