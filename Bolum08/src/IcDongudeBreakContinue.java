/*
 * Ic ice dongulerde break ve continue yalniz bulunduklari donguyu etkiler
 * (Calisma Sorulari 19-24). Her blok bir sorunun kodudur.
 * Beklenen cikti: her soru icin "i: .. j: .." satirlari (yorumlarda ozet)
 */
public class IcDongudeBreakContinue {

    // Soru 19: j == 2 atlanir -> her i icin j = 1, 3
    static void soru19() {
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 4; j++) {
                if (j == 2) {
                    continue;
                }
                System.out.println("i: " + i + " j: " + j);
            }
        }
    }

    // Soru 20: j == 3 atlanir -> i = 3..5, j = 1, 2
    static void soru20() {
        for (int i = 3; i < 6; i++) {
            for (int j = 1; j < 4; j++) {
                if (j == 3) {
                    continue;
                }
                System.out.println("i: " + i + " j: " + j);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("--- Soru 19");
        soru19();
        System.out.println("--- Soru 20");
        soru20();

        // Soru 21: dista break, icte continue -> i = 1, 2; j = 1, 2, 4
        System.out.println("--- Soru 21");
        for (int i = 1; i < 4; i++) {
            if (i == 3) {
                break;
            }
            for (int j = 1; j <= 4; j++) {
                if (j == 3) {
                    continue;
                }
                System.out.println("i: " + i + " j: " + j);
            }
        }

        // Soru 22: dista continue, icte break -> i = 1, 2, 4; j = 1, 2
        System.out.println("--- Soru 22");
        for (int i = 1; i <= 4; i++) {
            if (i == 3) {
                continue;
            }
            for (int j = 1; j <= 4; j++) {
                if (j == 3) {
                    break;
                }
                System.out.println("i: " + i + " j: " + j);
            }
        }

        // Soru 23: i == 4 break, j == 3 continue -> i = 2, 3; j = 2, 4
        System.out.println("--- Soru 23");
        for (int i = 2; i < 5; i++) {
            if (i == 4) {
                break;
            }
            for (int j = 2; j < 5; j++) {
                if (j == 3) {
                    continue;
                }
                System.out.println("i: " + i + " j: " + j);
            }
        }

        // Soru 24: j == 4 continue -> i = 2, 3; j = 2, 3
        System.out.println("--- Soru 24");
        for (int i = 2; i < 5; i++) {
            if (i == 4) {
                break;
            }
            for (int j = 2; j < 5; j++) {
                if (j == 4) {
                    continue;
                }
                System.out.println("i: " + i + " j: " + j);
            }
        }
    }
}
