// Scanner ile metin girdisi: next() kelime, nextLine() satir okur; kalan satir sonu tuzagi
// (Slayt: Scanner ile Metin Girdisi, Kod Izleme: next() ve nextLine(); Calisma Sorusu 22).
// Klavye yerine sabit dizgi okunur: kullanici "Ada" + Enter, sonra "Giresun Merkez" + Enter yazmis gibi.
// Beklenen cikti: "Ada | Giresun Merkez" ve Soru 22: "Ada||".
import java.util.Scanner;

public class ScannerGirdi {

	public static void main(String[] args) {
		// Gercek programda: Scanner klavye = new Scanner(System.in);
		Scanner klavye = new Scanner("Ada\nGiresun Merkez\n");
		String kelime = klavye.next();     // "Ada"; satir sonu tamponda kalir
		klavye.nextLine();                 // kalan satir sonunu tuketir ("" dondurur)
		String satir = klavye.nextLine();  // "Giresun Merkez" (bosluk dahil)
		System.out.println(kelime + " | " + satir);

		// Soru 22: aradaki nextLine() unutulursa satir bos dizgi olur
		Scanner k = new Scanner("Ada\nGiresun Merkez\n");
		String kelime2 = k.next();
		String satir2 = k.nextLine();
		System.out.println(kelime2 + "|" + satir2 + "|");   // Ada||
	}
}
