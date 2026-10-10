// Sinir disi indis hatasi: i <= a.length bir tur fazla doner
// (Slayt: Sinir Disi Hatasi, Kod Izleme: Bir Tur Fazla (<=); Calisma Sorusu 5).
// Beklenen cikti: 4 8 6 yazilir, sonra ArrayIndexOutOfBoundsException yakalanir; dogru dongu 4 8 6 yazar.
public class SinirDisiHatasi {

	public static void main(String[] args) {
		int[] a = {4, 8, 6};
		try {
			for (int i = 0; i <= a.length; i++) {   // HATALI: <= son turda a[3]'e erisir
				System.out.println(a[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Hata: " + e.getMessage());   // Index 3 out of bounds for length 3
		}

		// Dogrusu: i < a.length
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();

		// Soru 5: ayni hata; once 1 2 3 4 5 yazilir, sonra istisna
		int dizi[] = {1, 2, 3, 4, 5};
		try {
			for (int i = 0; i <= dizi.length; ++i)
				System.out.print(dizi[i] + " ");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println();
			System.out.println("Hata: " + e.getMessage());   // Index 5 out of bounds for length 5
		}

		// Negatif indis de gecersizdir
		try {
			System.out.println(a[-1]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Hata: " + e.getMessage());   // Index -1 out of bounds for length 3
		}
	}
}
