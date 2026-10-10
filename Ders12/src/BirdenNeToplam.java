// 1'den n'e toplam ozyinelemeyle; derinlige gore girintili cagri/donus izleme tablosu
// (Slayt: 1'den n'e Toplam: toplam(3), Hata Ayiklama; Calisma Sorusu 18).
// Beklenen cikti: 6; "15 1 0"; toplam(2) icin cagrildi/dondu satirlari (0, 1, 3).
public class BirdenNeToplam {

	static int toplam(int n) {
		if (n <= 0) return 0;          // taban durum (negatifler de buraya duser)
		return n + toplam(n - 1);
	}

	// Hata ayiklama: derinlik kadar girintiyle cagri ve donusu yazdirir
	static int toplamIzle(int n, int derinlik) {
		String girinti = "  ".repeat(derinlik);
		System.out.println(derinlik + " " + girinti + "toplam(" + n + ") cagrildi");
		int sonuc = (n <= 0) ? 0 : n + toplamIzle(n - 1, derinlik + 1);
		System.out.println(derinlik + " " + girinti + "toplam(" + n + ") dondu " + sonuc);
		return sonuc;
	}

	public static void main(String[] args) {
		System.out.println(toplam(3));                                            // 6
		System.out.println(toplam(5) + " " + toplam(1) + " " + toplam(-2));       // 15 1 0
		toplamIzle(2, 0);
	}
}
