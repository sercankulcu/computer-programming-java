/*
 * Ic ice donguler, atla (continue) ve cik (break) (Akis Diyagramlari: "Ic Ice Dongu Adim Adim";
 * Calisma Sorulari 22, 23, 24, 25, 26). 2 x 2 carpim tablosu "1 2 / 2 4";
 * j == 2 atlanirsa 6 satir; ucgen desen 10 yildiz; cizdir() yildiz-tire deseni.
 */
public class IcIceDongu {

    // Soru 25: i + 1 yildiz, 5 - i tire
    static void cizdir() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++)
                System.out.print("*");
            for (int j = 0; j < 5 - i; j++)
                System.out.print("-");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Kucuk carpim tablosu: dis i = 1, 2; ic j = 1, 2
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 2; j++)
                System.out.print(i * j + " ");
            System.out.println();   // satir sonu
        }

        System.out.println("--- Soru 22 ---");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (j == 2) continue;   // atla
                System.out.print("i: " + i + " j: " + j);
                System.out.println();
            }
        }

        System.out.println("--- Soru 23 ---");
        for (int i = 1; i <= 4; i++) {
            if (i == 3) continue;       // atla: ic dongu bu turda hic calismaz
            for (int j = 1; j <= 4; j++) {
                if (j == 3) break;      // cik: ic dongu tamamen biter
                System.out.println("i: " + i + " j: " + j);
            }
        }

        System.out.println("--- Soru 24 ---");
        int yildiz = 0;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
                yildiz++;
            }
            System.out.println();
        }
        System.out.println(yildiz + " yildiz");   // 10

        System.out.println("--- Soru 25 ---");
        cizdir();

        System.out.println("--- Soru 26 ---");
        for (int i = 2; i <= 4; i++) {
            if (i == 4) break;
            for (int j = 2; j <= 4; j++) {
                if (j == 4) continue;
                System.out.println("i: " + i + " j: " + j);
            }
        }
    }
}
