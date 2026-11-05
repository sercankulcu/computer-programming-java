/*
 * ebob (Oklid algoritmasi) ve onu cagiran ekok (Slayt 36-37, Calisma Sorusu 30).
 * ekok'ta once bolup sonra carpmak (a / ebob * b) ara sonucun tasmasini onler.
 * Beklenen cikti: 6, 36, "12 12"
 */
public class EbobEkok {

    static int ebob(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    static int ekok(int a, int b) {
        return a / ebob(a, b) * b;
    }

    public static void main(String[] args) {
        System.out.println(ebob(48, 18));   // 6
        System.out.println(ekok(12, 18));   // 36
        System.out.println(ebob(84, 36) + " " + ekok(4, 6));   // 12 12
    }
}
