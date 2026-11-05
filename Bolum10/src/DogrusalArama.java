// Dogrusal arama: ogeleri bastan sona tek tek karsilastirma
// (Slayt: Dogrusal Arama: ara(d, 6); Calisma Sorusu 30).
// Beklenen cikti: 2 ve -1
public class DogrusalArama {

	static int ara(int[] dizi, int hedef) {
		for (int i = 0; i < dizi.length; i++)
			if (dizi[i] == hedef) return i;
		return -1;                    // bulunamadi
	}

	public static void main(String[] args) {
		int[] d = {8, 3, 6, 2};
		System.out.println(ara(d, 6));   // 2
		System.out.println(ara(d, 5));   // -1 (Soru 30)
	}
}
