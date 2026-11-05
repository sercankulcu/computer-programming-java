/*
 * Islem onceligi ve ifade agaci (Degiskenler: "Islem Onceligi", "Ifade Agaci";
 * Calisma Sorulari 25, 27). 2 + 3 * 4 > 10 && 7 % 2 == 1 -> true;
 * Beklenen: true, true, 7, 9, true.
 */
public class IslemOnceligi {
    public static void main(String[] args) {
        // Ifade agaci: 3 * 4 = 12, 2 + 12 = 14, 14 > 10, 7 % 2 = 1, 1 == 1, true && true
        System.out.println(2 + 3 * 4 > 10 && 7 % 2 == 1);

        // Soru 25: aritmetik karsilastirmadan once
        if (1 + 1 + 1 + 1 + 1 == 5) {
            System.out.print("true");
        } else {
            System.out.print("false");
        }
        System.out.println();

        // Soru 27
        System.out.println(10 - 4 / 2 * 3 + 7 % 4);   // 10 - 6 + 3 = 7
        System.out.println((10 - 4) / 2 * 3);         // 9
        System.out.println(2 + 3 * 4 > 10 && 7 % 2 == 1);
    }
}
