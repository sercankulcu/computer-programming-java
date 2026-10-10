/*
 * Metot tanimi ve cagrisi: parametreler (a, b) argumanlarin (5, 3) kopyasini alir,
 * return degeri cagri yerine konur (Slayt 5-6, Calisma Sorusu 1).
 * Beklenen cikti: 8
 */
public class MetotTanimi {

    static int topla(int a, int b) {
        int sonuc = a + b;
        return sonuc;
    }

    public static void main(String[] args) {
        int toplam = topla(5, 3);
        System.out.println(toplam);   // 8
    }
}
