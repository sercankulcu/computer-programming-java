/*
 * asalMi metodu: bolen bulunca erken return false (Slayt 34-35).
 * i <= n / i kosulu karekoke kadar arar ve i * i gibi tasma yapmaz.
 * Beklenen cikti: false (15), true (7); 1..30 asallari "2 3 5 7 11 13 17 19 23 29"
 */
public class AsalMi {

    static boolean asalMi(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= n / i; i++)
            if (n % i == 0) return false;
        return true;
    }

    public static void main(String[] args) {
        System.out.println(asalMi(15));   // false
        System.out.println(asalMi(7));    // true

        for (int k = 1; k <= 30; k++)
            if (asalMi(k)) System.out.print(k + " ");
        System.out.println();
    }
}
