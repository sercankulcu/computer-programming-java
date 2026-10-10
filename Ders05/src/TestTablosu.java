/*
 * Test tablosu ile hata bulma (Java'ya Giris Calisma Sorulari 32; "Kodlamadan Once").
 * int ortalama (75, 80) icin 77 verir, beklenen 77.5; double ve / 2.0 ile duzeltilir.
 * Beklenen: 70,90 -> 80 gecti; 0,0 -> 0 gecti; 75,80 -> 77 kaldi (duzeltilmis 77.5).
 */
public class TestTablosu {

    static void test(int n1, int n2, double beklenen) {
        int ort = (n1 + n2) / 2;            // hatali: iki int bolunur
        double dogru = (n1 + n2) / 2.0;     // duzeltme
        String sonuc = (ort == beklenen) ? "gecti" : "kaldi";
        System.out.println(n1 + ", " + n2 + " -> " + ort + " (beklenen " + beklenen + ") " + sonuc
                + "; duzeltilmis: " + dogru);
    }

    public static void main(String[] args) {
        test(70, 90, 80);
        test(0, 0, 0);
        test(75, 80, 77.5);
    }
}
