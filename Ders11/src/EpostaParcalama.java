// Uygulama: e-posta adresini indexOf ve substring ile parcalama
// (Slayt: Uygulama: E-postayi Parcalama; Calisma Sorusu 12).
// Beklenen cikti: "ali / gru.edu", "A", "KAYA, ece".
import java.util.Locale;

public class EpostaParcalama {

	public static void main(String[] args) {
		String eposta = "ali@gru.edu";
		int at = eposta.indexOf('@');
		String kullanici = eposta.substring(0, at);
		String alan = eposta.substring(at + 1);
		char ilk = eposta.charAt(0);
		System.out.println(kullanici + " / " + alan);     // ali / gru.edu
		System.out.println(Character.toUpperCase(ilk));   // A

		// Soru 12: e-postadan ad ve soyad
		String s = "ece.kaya@uni.tr";
		int at2 = s.indexOf('@');
		String ad = s.substring(0, at2);
		int nokta = ad.indexOf('.');
		String isim = ad.substring(0, nokta);
		String soyad = ad.substring(nokta + 1);
		// Not: parametresiz toUpperCase() Turkce yerel ayarda 'i' harfini noktali buyuk I'ya cevirir;
		// teknik metinde Locale.ENGLISH verilir.
		System.out.println(soyad.toUpperCase(Locale.ENGLISH) + ", " + isim);   // KAYA, ece
	}
}
