/*
 * Tekrarli akis: geri donen ok = dongu (Akis Diyagramlari: "Tekrarli Akis", "do-while Akis Diyagrami";
 * Calisma Sorulari 14, 15, 16, 28). Beklenen: 1 2 3 4 5; 1 4 7 10 (cikista i = 13); 25; 012;
 * artirilmayan sayac sinirli calistirilir; do-while girdi dogrulama (7, 0, 3) -> Gecersiz, Gecersiz, 3.
 */
import java.util.Scanner;

public class TekrarliAkis {
    public static void main(String[] args) {
        // i = 1; i <= 5 iken: yaz i, i = i + 1
        int i = 1;
        while (i <= 5) {
            System.out.print(i + " ");
            i = i + 1;
        }
        System.out.println();

        // Soru 14: ucer artan sayac
        i = 1;
        int kararSayisi = 0;
        while (true) {
            kararSayisi++;
            if (!(i <= 10)) break;
            System.out.print(i + " ");
            i = i + 3;
        }
        System.out.println("(karar " + kararSayisi + " kez, cikista i = " + i + ")");

        // Soru 16: biriktirici 10'dan baslar; yazma dongunun disinda
        int x = 10;
        for (i = 1; i <= 5; i++) {
            x = x + i;
        }
        System.out.println(x);   // 25

        // Soru 28: print bosluk koymaz
        i = 0;
        while (i < 3) {
            System.out.print(i);
            i++;
        }
        System.out.println();    // 012

        // Soru 15: sayac artirilmazsa sonsuz dongu (burada 5 turla sinirlandi)
        i = 1;
        int guvenlik = 0;
        while (i <= 10) {
            System.out.print(i + " ");
            // i = i + 1;  eksik! i hep 1 kalir
            guvenlik++;
            if (guvenlik == 5) {
                System.out.println("... (sonsuz dongu, 5 turda kesildi)");
                break;
            }
        }

        // do-while: once govde (oku), kosul sonda; girdiler 7, 0, 3
        Scanner klavye = new Scanner("7 0 3");
        int sayi;
        do {
            sayi = klavye.nextInt();
            if (sayi < 1 || sayi > 5)
                System.out.println(sayi + ": Gecersiz");
        } while (sayi < 1 || sayi > 5);
        System.out.println(sayi);   // 3
    }
}
