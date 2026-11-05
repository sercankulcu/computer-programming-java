/*
 * Piramit desenleri (Calisma Sorulari 27-30): her satirda once bosluk/tire, sonra yildiz
 * sayisi satir numarasina baglanir. Piramitte yildiz = 2 x satir - 1.
 * Beklenen cikti: yildiz-tire deseni, bosluk-yildiz deseni, piramit, ters piramit (5 satir)
 */
public class PiramitDesenleri {

    // Soru 27: yildiz ve tire deseni
    public static void cizdir() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 5 - i; j++) {
                System.out.print("-");
            }
            System.out.println();
        }
    }

    // Soru 28: bosluk ve yildiz deseni (slaytta static olmayan metot; burada static)
    public static void cizdir2() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 5 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        cizdir();
        System.out.println();
        cizdir2();
        System.out.println();

        // Soru 29: piramit
        int satirSayisi = 5;
        for (int i = 1; i <= satirSayisi; i++) {
            for (int j = 1; j <= satirSayisi - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // Soru 30: ters piramit
        for (int i = satirSayisi; i > 0; i--) {
            for (int j = 1; j <= satirSayisi - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
