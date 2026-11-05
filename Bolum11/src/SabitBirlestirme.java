// Derleme zamaninda sabit birlestirme ve intern: hangi ifade havuzdaki "ab" nesnesidir?
// (Slayt: Sabit Birlestirme ve intern; Calisma Sorusu 18).
// Beklenen cikti: true, true, false, true, true; Soru 18 secenekleri: true, false, false, false.
public class SabitBirlestirme {

	public static void main(String[] args) {
		String a = "a", b = "b";
		String r = a + b;                 // calisma zamaninda yeni nesne
		final String f = "a";             // final: derleyici sabit olarak birlestirir
		System.out.println(("a" + "b") == "ab");  // true
		System.out.println((f + "b") == "ab");    // true
		System.out.println(r == "ab");            // false
		System.out.println(r.equals("ab"));       // true
		System.out.println(r.intern() == "ab");   // true

		// Soru 18 secenekleri: yalnizca A true
		System.out.println("A) " + ((f + "b") == "ab"));             // true
		System.out.println("B) " + (r == "ab"));                     // false
		System.out.println("C) " + ((a + "b") == "ab"));             // false
		System.out.println("D) " + (new String("ab") == "ab"));      // false
	}
}
