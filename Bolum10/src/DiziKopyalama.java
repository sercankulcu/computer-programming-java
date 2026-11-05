// Referans kopyasi (b = a) ile oge kopyasi (clone, copyOf, copyOfRange, System.arraycopy)
// (Slayt: Dizi Kopyalama, Kod Izleme: Referans Kopyasi ve Oge Kopyasi; Calisma Sorulari 8, 9).
// Beklenen cikti: "99", "2 50", "9 7 50 3", "[2, 3, 0]", "false", "[0, 1, 2, 3, 0]".
import java.util.Arrays;

public class DiziKopyalama {

	public static void main(String[] args) {
		int[] a = {1, 2, 3};
		int[] b = a;                  // yeni dizi yok; ayni nesneye ikinci referans
		b[0] = 99;
		System.out.println(a[0]);     // 99
		int[] c = a.clone();          // yeni dizi, ogeler kopyalandi
		c[1] = 50;
		System.out.println(a[1] + " " + c[1]);   // 2 50

		// Soru 8 (degisken adlari cakismasin diye p, q, r)
		int[] p = {1, 2, 3};
		int[] q = p;
		q[0] = 9;
		int[] r = p.clone();
		r[1] = 50;
		p[2] = 7;
		System.out.println(p[0] + " " + q[2] + " " + r[1] + " " + r[2]);   // 9 7 50 3

		// Soru 9: copyOf uzatirsa sifirla doldurur; copyOfRange'de bitis indisi haric
		int[] x = {1, 2, 3};
		int[] y = Arrays.copyOf(x, 5);
		int[] z = Arrays.copyOfRange(y, 1, 4);
		System.out.println(Arrays.toString(z));  // [2, 3, 0]
		System.out.println(x == y);              // false

		// System.arraycopy(kaynak, kaynakBas, hedef, hedefBas, adet)
		int[] hedef = new int[5];
		System.arraycopy(x, 0, hedef, 1, 3);
		System.out.println(Arrays.toString(hedef));   // [0, 1, 2, 3, 0]
	}
}
