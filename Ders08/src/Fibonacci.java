/*
 * Fibonacci serisi: iki onceki deger tutulur, her turda kaydirilir (Slayt 37-38).
 * Beklenen cikti: "0 1 1 2 3" (adet = 5) ve "0 1 1 2 3 5 8 13 21 34" (adet = 10)
 */
public class Fibonacci {

    public static void main(String[] args) {
        int[] adetler = {5, 10};
        for (int adet : adetler) {
            long a = 0, b = 1;
            for (int i = 0; i < adet; i++) {
                System.out.print(a + " ");
                long sonraki = a + b;
                a = b;
                b = sonraki;
            }
            System.out.println();
        }
    }
}
