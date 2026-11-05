/*
 * Desenler: artan ucgen, saga yasli ucgen, sayi ucgeni, ici bos kare (Slayt 45-54).
 * Satira gore sayilar (Slayt 49): bosluk = n - satir, karakter = satir.
 * Calisma Sorusu 32: println ic donguye konursa her yildiz ayri satira yazilir.
 */
public class UcgenDesenleri {

    public static void main(String[] args) {
        // Artan ucgen (n = 4)
        int n = 4;
        for (int satir = 1; satir <= n; satir++) {
            for (int sutun = 1; sutun <= satir; sutun++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // Saga yasli ucgen (n = 3)
        n = 3;
        for (int satir = 1; satir <= n; satir++) {
            for (int bosluk = 0; bosluk < n - satir; bosluk++)
                System.out.print(" ");
            for (int yildiz = 0; yildiz < satir; yildiz++)
                System.out.print("*");
            System.out.println();
        }
        System.out.println();

        // Sayi ucgeni (n = 4)
        n = 4;
        for (int satir = 1; satir <= n; satir++) {
            for (int deger = 1; deger <= satir; deger++) {
                System.out.print(deger + " ");
            }
            System.out.println();
        }
        System.out.println();

        // Ici bos kare (n = 4)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();

        // Soru 32: println yanlis yerde -> 1 + 2 + 3 = 6 satir, her birinde tek *
        n = 3;
        for (int satir = 1; satir <= n; satir++) {
            for (int sutun = 1; sutun <= satir; sutun++) {
                System.out.print("*");
                System.out.println();
            }
        }
    }
}
