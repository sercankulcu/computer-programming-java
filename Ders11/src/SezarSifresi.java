// Sezar sifreleme ve cozme: her harfi alfabede kaydir kadar otele (mod 26)
// (Slayt: Sezar Sifreleme ve Cozme; Calisma Sorusu 27).
// Beklenen cikti: "bdclolp", "yazilim" (cozme); Soru 27: "mcb".
public class SezarSifresi {

	public static void main(String[] args) {
		String metin = "yazilim";
		int kaydir = 3;
		StringBuilder sifreli = new StringBuilder();
		for (int i = 0; i < metin.length(); i++) {
			char c = metin.charAt(i);
			int yer = (c - 'a' + kaydir) % 26;    // 'z' sonrasi basa doner
			char yeni = (char) ('a' + yer);
			sifreli.append(yeni);
		}
		System.out.println(sifreli);              // bdclolp

		// Cozme: ters yonde kaydir; negatif kalmamasi icin + 26
		StringBuilder cozulmus = new StringBuilder();
		for (int i = 0; i < sifreli.length(); i++) {
			char c = sifreli.charAt(i);
			int yer = (c - 'a' - kaydir + 26) % 26;
			cozulmus.append((char) ('a' + yer));
		}
		System.out.println(cozulmus);             // yazilim

		// Soru 27: kaydir = 2
		String metin2 = "kaz";
		int kaydir2 = 2;
		StringBuilder sifreli2 = new StringBuilder();
		for (int i = 0; i < metin2.length(); i++) {
			char c = metin2.charAt(i);
			int yer = (c - 'a' + kaydir2) % 26;
			sifreli2.append((char) ('a' + yer));
		}
		System.out.println(sifreli2);             // mcb
	}
}
