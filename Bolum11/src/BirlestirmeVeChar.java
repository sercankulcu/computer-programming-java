// + operatoru soldan saga: String varsa birlestirme, yoksa toplama; char aritmetigi
// (Calisma Sorulari 2, 3, 4, 5).
// Beklenen cikti: 1234, 46, 1234, 712; 2314; 3345; 98, b, a1, 195.
public class BirlestirmeVeChar {

	public static void main(String[] args) {
		// Soru 2
		String sayi1 = "12";
		String sayi2 = "34";
		String toplam = sayi1 + sayi2;
		System.out.println(toplam);              // 1234 (birlestirme)
		int a = 12, b = 34;
		System.out.println(a + b);               // 46 (toplama)
		System.out.println(sayi1 + 3 + 4);       // 1234 ("12" + 3 -> "123", + 4 -> "1234")
		System.out.println(3 + 4 + sayi1);       // 712 (once 3 + 4 = 7)

		// Soru 3
		String s1 = "23";
		String s2 = "14";
		System.out.println(s1 + s2);             // 2314

		// Soru 4: soldan saga
		System.out.println(1 + 2 + "3" + 4 + 5); // 3345

		// Soru 5: char aritmetigi
		char k = 'a';
		System.out.println(k + 1);               // 98 (int)
		System.out.println((char) (k + 1));      // b
		System.out.println("" + k + 1);          // a1
		System.out.println('a' + 'b');           // 97 + 98 = 195
	}
}
