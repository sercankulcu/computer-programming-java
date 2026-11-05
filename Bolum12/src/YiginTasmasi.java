// Taban durumu olmayan ozyineleme: her cagri yigina cerceve ekler, sonunda StackOverflowError
// (Slayt: Cagri Yigini, StackOverflowError, Kod Izleme: StackOverflowError).
// Beklenen cikti: "StackOverflowError yakalandi, ulasilan derinlik: ..." (sayi JVM yigin boyutuna gore degisir).
public class YiginTasmasi {

	static int derinlik = 0;

	static void sonsuz(int n) {
		derinlik = n;                // kac cerceve acildigini kaydet
		sonsuz(n + 1);               // taban durum yok!
	}

	public static void main(String[] args) {
		try {
			sonsuz(0);
		} catch (StackOverflowError e) {
			// Normalde program bu hatayla biter; burada gostermek icin yakalandi
			System.out.println("StackOverflowError yakalandi, ulasilan derinlik: " + derinlik);
		}
	}
}
