// Sik kullanilan String metotlari: length, indexOf, substring, contains, trim, replace
// (Slayt: Temel Metotlar, Sik String Metotlari; Calisma Sorusu 14).
// Beklenen cikti: "Programlama 5", "16 true"; Soru 14: "[Ali Veli] 8", "ALi VeLi", "true", "bANANa".
import java.util.Locale;

public class TemelMetotlar {

	public static void main(String[] args) {
		String s = "Java Programlama";
		int uzunluk = s.length();
		int konum = s.indexOf("Programlama");
		String alt = s.substring(5, 16);
		boolean icerir = s.contains("Java");
		System.out.println(alt + " " + konum);       // Programlama 5
		System.out.println(uzunluk + " " + icerir);  // 16 true
		System.out.println(s.toLowerCase(Locale.ENGLISH) + "|" + "  bosluk  ".trim() + "|" + "  bosluk  ".strip() + "|");

		// Soru 14: trim, replace, contains
		String k = "  Ali Veli  ";
		String t = k.trim();
		System.out.println("[" + t + "] " + t.length());          // [Ali Veli] 8
		System.out.println(t.replace('l', 'L'));                    // ALi VeLi
		System.out.println(t.toLowerCase(Locale.ENGLISH).contains("veli"));  // true
		System.out.println("banana".replace("an", "AN"));           // bANANa
	}
}
