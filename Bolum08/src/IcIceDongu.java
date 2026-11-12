/*
 * Ic ice dongu: dis dongu satir, ic dongu sutun (Slayt 41-43, Calisma Sorusu 26).
 * Ic govde toplam satir x sutun kez calisir; ic baslangic dis degiskene baglanabilir.
 * Beklenen cikti: 3x4 (satir,sutun) tablosu, 3x3 carpim tablosu, sayac = 10
 */
public class IcIceDongu {

    public static void main(String[] args) {
        for (int satir = 0; satir < 3; satir++) {
            for (int sutun = 0; sutun < 4; sutun++) {
                System.out.printf("(%d,%d) ", satir, sutun);
            }
            System.out.println();
        }

        // Slayt 43: carpim tablosu
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }

        // Soru 26: govde kac kez calisir? 4 + 3 + 2 + 1 = 10
        int sayac = 0;
        for (int i = 1; i <= 4; i++) {
            for (int j = i; j <= 4; j++) {
                sayac++;
            }
        }
        System.out.println(sayac);
    }
}

/* Beklenen cikti:
(0,0) (0,1) (0,2) (0,3)
(1,0) (1,1) (1,2) (1,3)
(2,0) (2,1) (2,2) (2,3)
   1   2   3
   2   4   6
   3   6   9
10
*/
