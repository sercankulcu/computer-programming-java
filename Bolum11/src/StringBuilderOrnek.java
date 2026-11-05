// StringBuilder: degistirilebilir tampon; append, toString, reverse
// (Slayt: Birlestirme ve StringBuilder, Kod Izleme: StringBuilder ile Birlestirme; Calisma Sorulari 23, 24).
// Beklenen cikti: "1 2 3 |"; Soru 23: "ab1-2-3- -3-2-1ba"; dongude + ile ve StringBuilder ile ayni sonuc.
public class StringBuilderOrnek {

	public static void main(String[] args) {
		StringBuilder metin = new StringBuilder();
		for (int i = 1; i <= 3; i++) {
			metin.append(i).append(' ');   // ayni nesneye ekler, zincirlenebilir
		}
		String sonuc = metin.toString();
		System.out.println(sonuc + "|");   // 1 2 3 |

		// Soru 23: reverse tamponun kendisini cevirir; s etkilenmez
		StringBuilder sb = new StringBuilder("ab");
		for (int i = 1; i <= 3; i++) {
			sb.append(i).append('-');
		}
		String s = sb.toString();
		sb.reverse();
		System.out.println(s + " " + sb);   // ab1-2-3- -3-2-1ba

		// Soru 24: dongude s = s + i her turda yeni String olusturur ve eskiyi kopyalar
		String birlesik = "";
		for (int i = 0; i < 10; i++)
			birlesik = birlesik + i;            // 10 ayri String nesnesi
		StringBuilder tampon = new StringBuilder();
		for (int i = 0; i < 10; i++)
			tampon.append(i);                   // tek tampon
		System.out.println(birlesik + " " + tampon + " " + birlesik.equals(tampon.toString()));
	}
}
