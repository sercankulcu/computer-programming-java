// String degistirilemez: toUpperCase, concat, + yeni nesne dondurur; sonuc atanmalidir
// (Slayt: Degistirilemezlik, Degistirilemezlik: toUpperCase(); Calisma Sorusu 6).
// Beklenen cikti: "java", "JAVA", "Merhaba!" (eski nesne ayni kalir), Soru 6: "java", "JAVA?".
import java.util.Locale;

public class Degistirilemezlik {

	public static void main(String[] args) {
		String dil = "java";
		dil.toUpperCase();                 // donen yeni String kullanilmadi
		System.out.println(dil);           // java
		dil = dil.toUpperCase();           // sonuc degiskene atandi
		System.out.println(dil);           // JAVA

		// s = s + "!" yeni nesne olusturur; eski "Merhaba" nesnesi degismez
		String s = "Merhaba";
		String eski = s;
		s = s + "!";
		System.out.println(s + " " + eski + " " + (s == eski));   // Merhaba! Merhaba false

		// Soru 6
		String t = "java";
		t.toUpperCase();
		t.concat("!");
		System.out.println(t);             // java
		t = t.toUpperCase(Locale.ENGLISH) + "?";
		System.out.println(t);             // JAVA?
	}
}
