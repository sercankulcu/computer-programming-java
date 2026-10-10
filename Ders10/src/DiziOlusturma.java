// Dizi olusturma, oge okuma/yazma ve varsayilan degerler
// (Slayt: Dizi Olusturma, Kod Izleme: Dizi Olusturma, Oge Okuma ve Yazma; Calisma Sorusu 2).
// Beklenen cikti: "5 3 10", "4 3", "70 90", "0 0.0 false null", "7".
public class DiziOlusturma {

	public static void main(String[] args) {
		// Uc farkli olusturma bicimi
		int[] sayilar = new int[5];                 // 5 oge, hepsi 0
		String[] adlar = {"Ada", "Can", "Ece"};     // ilk deger listesi
		double[] olcumler;                          // yalnizca referans degiskeni
		olcumler = new double[10];                  // dizi simdi olusturuldu
		System.out.println(sayilar.length + " " + adlar.length + " " + olcumler.length); // 5 3 10

		// Kod izleme: dizi olusturma
		sayilar = new int[4];
		sayilar[0] = 7;
		sayilar[3] = 2;
		System.out.println(sayilar.length + " "
				+ adlar.length);                    // 4 3

		// Oge okuma ve yazma
		int[] puanlar = {70, 85, 90};
		int ilk = puanlar[0];
		puanlar[1] = 88;
		int son = puanlar[puanlar.length - 1];
		System.out.println(ilk + " " + son);        // 70 90

		// Soru 2: varsayilan degerler (0, 0.0, false, null)
		int[] a = new int[3];
		double[] d = new double[2];
		boolean[] b = new boolean[2];
		String[] s = new String[2];
		System.out.println(a[1] + " " + d[0] + " " + b[1] + " " + s[0]); // 0 0.0 false null
		System.out.println(a.length + d.length + s.length);               // 3 + 2 + 2 = 7
	}
}
