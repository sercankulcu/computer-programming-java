/*
 * Tek mi cift mi: sayi % 2 == 0 ise cift (Slayt 29-30).
 * Calisma Sorusu 33: negatif tek sayida % 2 sonucu -1'dir; "% 2 == 1" testi yanlis,
 * "% 2 != 0" dogru. Beklenen cikti: 17 Tek, -4 Cift; sonra -1 false true true false
 */
public class TekCift {

    public static void main(String[] args) {
        int[] sayilar = {17, -4};
        for (int sayi : sayilar) {
            System.out.print(sayi + " -> ");
            if (sayi % 2 == 0)
                System.out.println("Cift");
            else
                System.out.println("Tek");
        }

        // Soru 33: % 2 == 1 tuzagi
        int a = -7, b = 7, c = -4;
        System.out.println(a % 2);         // -1
        System.out.println(a % 2 == 1);    // false (yanlis test!)
        System.out.println(a % 2 != 0);    // true
        System.out.println(b % 2 == 1);    // true
        System.out.println(c % 2 != 0);    // false
    }
}
