/*
 * Sinir hatalari (off-by-one): < ile <= bir tur fark eder (Slayt 20-22).
 * Dongu degismezi (Slayt 19): her turun basinda toplam = 1 + ... + (i - 1).
 * Beklenen cikti: "0 1 2 3 4 | tur: 5", "0 1 2 3 4 5 | tur: 6", degismez izlemesi ve 10
 */
public class SinirHatalari {

    public static void main(String[] args) {
        int sayac = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print(i + " ");
            sayac++;
        }
        System.out.println("| tur: " + sayac);

        sayac = 0;
        for (int i = 0; i <= 5; i++) {
            System.out.print(i + " ");
            sayac++;
        }
        System.out.println("| tur: " + sayac);

        // Slayt 19: dongu degismezi
        int n = 4;
        int toplam = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println("i = " + i + " basinda toplam = " + toplam
                    + " (1.." + (i - 1) + " toplami)");
            toplam += i;
        }
        System.out.println(toplam);   // 10
    }
}

/* Beklenen cikti:
0 1 2 3 4 | tur: 5
0 1 2 3 4 5 | tur: 6
i = 1 basinda toplam = 0 (1..0 toplami)
i = 2 basinda toplam = 1 (1..1 toplami)
i = 3 basinda toplam = 3 (1..2 toplami)
i = 4 basinda toplam = 6 (1..3 toplami)
10
*/
