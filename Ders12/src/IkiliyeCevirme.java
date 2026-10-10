// Onluk sayiyi ozyinelemeyle ikiliye cevirme: ikili(n) = ikili(n / 2) + (n % 2)
// (Calisma Sorusu 28; Alistirma: 13 -> "1101").
// Beklenen cikti: "1101 110 1", Integer.toBinaryString ile ayni sonuc.
public class IkiliyeCevirme {

	static String ikili(int n) {
		if (n < 2) return "" + n;            // taban durum: 0 ya da 1
		return ikili(n / 2) + (n % 2);       // once ust bitler, sonra en dusuk bit
	}

	public static void main(String[] args) {
		System.out.println(ikili(13) + " " + ikili(6) + " " + ikili(1));   // 1101 110 1
		System.out.println(Integer.toBinaryString(13) + " " + ikili(255) + " " + ikili(0));   // 1101 11111111 0
	}
}
